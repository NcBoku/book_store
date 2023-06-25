package user.pojo.po;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {

    @TableId
    private Integer userId;

    private String name;
}
