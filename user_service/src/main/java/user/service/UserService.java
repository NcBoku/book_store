package user.service;

import core.pojo.common.Response;
import user.pojo.dto.UserDTO;
import user.pojo.dto.UserSearchDTO;

import java.util.List;

public interface UserService {

    Response selectByUserId(Integer id);

    Response<List<UserDTO>> search(UserSearchDTO dto);
}
