package book.service;

import book.pojo.dto.BookDTO;
import book.pojo.dto.BookSearchDTO;

import java.util.List;

public interface BookService{

    // 以某种排序方式获取某页Book数据
    List<BookDTO> list(BookSearchDTO bookSearchDTO);

}
