package user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import core.pojo.common.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import user.mapper.UserMapper;
import user.pojo.dto.UserDTO;
import user.pojo.dto.UserSearchDTO;
import user.pojo.po.User;
import user.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Response selectByUserId(Integer id) {
        User user = userMapper.selectById(id);
        UserDTO dto = new UserDTO();
        BeanUtils.copyProperties(user, dto);
        return Response.ok(dto);
    }

    @Override
    public Response<List<UserDTO>> search(UserSearchDTO dto) {
        Page<User> page = new Page<>(dto.getPage(), dto.getSize());

        IPage<User> users = userMapper.selectPage(page, new LambdaQueryWrapper<User>()
                .likeRight(StringUtils.hasText(dto.getName()), User::getName, dto.getName())
        );

        List<UserDTO> userDTOs = users.getRecords().stream()
                .map(user -> {
                    UserDTO userDTO = new UserDTO();
                    userDTO.setId(user.getUserId());
                    BeanUtils.copyProperties(user, userDTO);
                    return userDTO;
                })
                .collect(Collectors.toList());

        return Response.<List<UserDTO>>ok(userDTOs);
    }
}
