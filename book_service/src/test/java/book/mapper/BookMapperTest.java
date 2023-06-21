package book.mapper;

import book.pojo.bo.BookBO;
import book.pojo.dto.BookSearchDTO;
import book.pojo.po.Book;
import book.pojo.po.Paragraph;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
public class BookMapperTest {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private ChapterMapper chapterMapper;

    @Autowired
    private ParagraphMapper paragraphMapper;

    @Test
    public void listTest() {
        Page<BookBO> page = new Page<>();
        List<BookBO> list = bookMapper.list(page, null, null, null, null, null, null, null);
        list.forEach(bookBO -> {
            StringBuilder sb = new StringBuilder();
            System.out.println(sb.toString()+"\n\n");
        });
    }

}
