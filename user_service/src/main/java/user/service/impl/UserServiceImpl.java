package user.service.impl;

import core.pojo.common.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.mapper.UserMapper;
import user.pojo.dto.UserDTO;
import user.pojo.po.User;
import user.service.UserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    public Response selectByUserId(Integer id) {
        User user = userMapper.selectById(id);
        UserDTO dto = new UserDTO();
        BeanUtils.copyProperties(user, dto);
        return Response.ok(dto);
    }
}
