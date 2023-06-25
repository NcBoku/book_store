package book.controller;


import book.pojo.dto.BookDTO;
import book.pojo.dto.BookSearchDTO;
import book.service.BookService;
import core.constants.ConstantsClient;
import core.pojo.common.Response;
import core.pojo.user.dto.UserDTO;
import core.pojo.user.dto.UserSearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
