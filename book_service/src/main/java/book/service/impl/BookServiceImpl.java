package book.service.impl;

import book.mapper.BookMapper;
import book.pojo.dto.BookSearchDTO;
import book.pojo.po.Book;
import book.service.BookService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements BookService{

    @Resource(name = "bookMapper")
    private BookMapper bookMapper;

    @Override
    public List<Book> list(Page<Book> page, BookSearchDTO bookSearchDTO) {

        return null;
    }
}
