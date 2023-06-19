package book.pojo.bo;

import book.pojo.po.Book;
import core.pojo.user.po.User;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class BookshelfBO {

    private Integer bookshelfId;

    private User author;

    private Book book;

    private Timestamp createdTime;

    private Timestamp updatedTime;
}
