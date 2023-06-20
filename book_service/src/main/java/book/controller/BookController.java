package book.controller;

import book.pojo.dto.BookDTO;
import book.pojo.dto.BookSearchDTO;
import book.service.BookService;
import core.pojo.common.Response;
import core.pojo.common.constants.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/list/page")
    public Response list(@RequestBody BookSearchDTO dto) {
        List<BookDTO> list = bookService.list(dto);
        return Response.ok(ResponseStatus.OK, list);
    }

}
