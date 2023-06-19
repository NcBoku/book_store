package book.pojo.po;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Bookshelf {

    @TableId
    private Integer bookshelfId;

    private Integer userId;

    private Integer bookId;

    private Timestamp createdTime;

    private Timestamp updatedTime;

    private Boolean isDeleted;

}
