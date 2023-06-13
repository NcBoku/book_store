package book.service.po;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class book {
    @TableId
    private Integer id;

    private Integer authorId;

    private Integer categoryId;

    private String name;

    private String introduce;

    private Integer recommendTicket;

    private Integer downloadCount;

    private Integer status;

    private Integer createdTime;

    private Integer updatedTime;

    private Boolean isValid;

    private Boolean isDeleted;
}
