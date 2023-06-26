package book.pojo.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
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

    @TableLogic
    private Boolean isDeleted;

}
