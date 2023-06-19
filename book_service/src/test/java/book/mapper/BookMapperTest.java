package book.mapper;

import book.pojo.dto.BookSearchDTO;
import book.pojo.po.Book;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
public class BookMapperTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void listTest(){
        Page<Book> bookPage = new Page<>();
        bookPage.setPages(1);
        bookPage.setSize(10);
        BookSearchDTO dto = new BookSearchDTO();
        dto.setBookName("书籍");
        dto.setSortedKey("name");
        dto.setIsASC(true);
        List<Book> list = bookMapper.list(bookPage, dto);
        System.out.println(list.get(0));
    }
}
