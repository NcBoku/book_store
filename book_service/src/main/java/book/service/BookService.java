package book.service;

import book.pojo.dto.BookDTO;
import book.pojo.dto.BookSearchDTO;
import book.pojo.po.Book;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface BookService{

    // 以某种排序方式获取某页Book数据
    List<Book> list(Page<Book> page, BookSearchDTO bookSearchDTO);


}
