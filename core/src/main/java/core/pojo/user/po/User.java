package core.pojo.user.po;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {

    @TableId
    private Integer id;
}
