package book.pojo.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Paragraph {

    @TableId
    private Integer paragraphId;

    private Integer chapterId;

    private Integer bookId;

    private Integer no;

    private String content;

    private String status;

    private Timestamp createdTime;

    private Timestamp updatedTime;

    @TableLogic
    private Boolean isDeleted;
}
