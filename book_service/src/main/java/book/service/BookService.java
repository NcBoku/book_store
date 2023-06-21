package book.service;

import book.pojo.dto.BookDTO;
import book.pojo.dto.BookSearchDTO;
import core.pojo.common.Response;

import java.util.List;

public interface BookService{

    // 以某种排序方式获取某页Book数据
    Response list(BookSearchDTO bookSearchDTO);

}
