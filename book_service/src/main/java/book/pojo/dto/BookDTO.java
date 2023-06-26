package book.pojo.dto;

import book.pojo.po.Category;
import core.pojo.user.po.User;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class BookDTO {
    private Integer id;

    private User author;

    private Category category;

    private String name;

    private String introduce;

    private Integer recommendTicket;

    private Integer downloadCount;

    private String status;

    private Timestamp createdTime;

    private Timestamp updatedTime;

    private Boolean isValid;
}
