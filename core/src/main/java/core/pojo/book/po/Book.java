package core.pojo.book.po;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Book {
    @TableId
    private Integer id;

    private Integer authorId;

    private Integer categoryId;

    private String name;

    private String introduce;

    private Integer recommendTicket;

    private Integer downloadCount;

    private Integer status;

    private Timestamp createdTime;

    private Timestamp updatedTime;

    private Boolean isValid;

    private Boolean isDeleted;
}
