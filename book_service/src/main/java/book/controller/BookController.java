package book.controller;


import book.pojo.dto.BookSearchDTO;
import book.service.BookService;
import core.constants.ConstantsClient;
import core.pojo.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping(ConstantsClient.BOOK)
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/list")
    public Response list(@RequestBody BookSearchDTO dto) {
        return bookService.list(dto);
    }

}
