package book.pojo.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Category {
    @TableId
    private Integer categoryId;

    private Integer parentCategoryId;

    private String name;

    private Timestamp createdTime;

    private Timestamp updatedTime;

    @TableLogic
    private Boolean isDeleted;

}
