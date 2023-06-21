package user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import core.pojo.common.Response;
import user.pojo.dto.UserDTO;

public interface UserService  {

    Response selectByUserId(Integer id);
}
