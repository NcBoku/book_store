package book.service;

import book.pojo.dto.BookSearchDTO;
import book.pojo.vo.BookDetailVO;
import core.pojo.common.Response;

import java.util.List;

public interface BookService{

    // 以某种排序方式获取某页Book数据
    Response<List<BookDetailVO>> list(BookSearchDTO bookSearchDTO);

}
