package book.pojo.bo;

import book.pojo.po.Category;
import book.pojo.po.Chapter;
import core.pojo.user.po.User;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class BookBO {
    private Integer id;

    private User author;

    private Category category;

    private String name;

    private String introduce;

    private Integer recommendTicket;

    private Integer downloadCount;

    private Integer status;

    private Timestamp createdTime;

    private Timestamp updatedTime;

    private Boolean isValid;

    private BookshelfBO bookshelfBO;

    private List<ChapterBO> chapters;
}
