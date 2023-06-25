package book.service.impl;

import book.client.UserClient;
import book.mapper.BookMapper;
import book.pojo.bo.BookBO;
import book.pojo.dto.BookDTO;
import book.pojo.dto.BookSearchDTO;
import book.pojo.vo.BookDetailVO;
import book.service.BookService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import core.pojo.common.Response;
import core.pojo.user.dto.UserDTO;
import core.pojo.user.dto.UserSearchDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    @Autowired
    private UserClient userClient;

    @Resource(name = "bookMapper")
    private BookMapper bookMapper;

    @Override
    public Response<List<BookDetailVO>> list(BookSearchDTO bookSearchDTO) {
        Page<BookBO> page = new Page<>();

        ArrayList<BookDTO> bookDTOs = new ArrayList<>();

        // 通过user服务获取具有相似名称的author
        UserSearchDTO searchDTO = new UserSearchDTO();
        searchDTO.setPage(1);
        searchDTO.setSize(2);
        searchDTO.setName("作者");

        Response<List<UserDTO>> users = userClient.search(searchDTO);

        Map<Integer, UserDTO> map = users.getData().stream()
                .collect(Collectors.toMap(UserDTO::getUserId, o -> o));


        List<BookBO> books = bookMapper.list(page, bookSearchDTO.getBookName(),
                bookSearchDTO.getCategoryName(), map.keySet(),
                bookSearchDTO.getCreatedTime(), bookSearchDTO.getEndedTime(),
                bookSearchDTO.getSortedKey(), bookSearchDTO.getIsASC());

        books.forEach(book -> {
            BookDTO bookDTO = new BookDTO();
            BeanUtils.copyProperties(book, bookDTO);
            UserDTO userDTO = map.get(bookDTO.getAuthor().getId());
            if (userDTO != null) {
                BeanUtils.copyProperties(userDTO, bookDTO.getAuthor());
            }

            bookDTOs.add(bookDTO);
        });

        return Response.ok(bookDTOs.stream().map(BookDetailVO::toBookDetailVO).collect(Collectors.toList()));
    }
}
