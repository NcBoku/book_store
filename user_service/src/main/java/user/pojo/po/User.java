package user.pojo.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class User {

    @TableId
    private Integer userId;

    private String name;

    @TableLogic
    private Boolean isDeleted;
}
