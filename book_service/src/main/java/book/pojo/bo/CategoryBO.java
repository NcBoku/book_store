package book.pojo.bo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class CategoryBO {

    @TableId
    private Integer id;

    private Integer parentCategoryId;

    private String name;

    private Timestamp createdTime;

    private Timestamp updatedTime;
}
