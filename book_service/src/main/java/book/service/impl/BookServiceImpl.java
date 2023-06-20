package book.service.impl;

import book.mapper.BookMapper;
import book.pojo.bo.BookBO;
import book.pojo.dto.BookDTO;
import book.pojo.dto.BookSearchDTO;
import book.service.BookService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import core.pojo.user.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    @Resource(name = "bookMapper")
    private BookMapper bookMapper;

    @Override
    public List<BookDTO> list(BookSearchDTO bookSearchDTO) {
        Page<BookBO> page = new Page<>();

        ArrayList<BookDTO> bookVOs = new ArrayList<>();

        // 通过user服务获取具有相似名称的author
        List<UserDTO> userDTOList = null;
        List<Integer> userIds = userDTOList.stream()
                .map(UserDTO::getUserId)
                .collect(Collectors.toList());

        List<BookBO> books = bookMapper.list(page, bookSearchDTO.getBookName(),
                bookSearchDTO.getCategoryName(), userIds,
                bookSearchDTO.getCreatedTime(), bookSearchDTO.getEndedTime(),
                bookSearchDTO.getSortedKey(), bookSearchDTO.getIsASC());

        books.forEach(book -> {
            BookDTO bookDTO = new BookDTO();
            BeanUtils.copyProperties(book, bookDTO);

        });

        return bookVOs;
    }
}
