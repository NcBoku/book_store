package book.pojo.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Chapter {
    @TableId
    private Integer chapterId;

    private Integer bookId;

    private Integer no;

    private String name;

    private String status;

    private Timestamp createdTime;

    private Timestamp updatedTime;

    private Boolean isValid;

    @TableLogic
    private Boolean isDeleted;
}
