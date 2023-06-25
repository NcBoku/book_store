package user.controller;

import core.constants.ConstantsClient;
import core.pojo.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.pojo.dto.UserDTO;
import user.pojo.dto.UserSearchDTO;
import user.service.UserService;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(ConstantsClient.USER)
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Response user(@PathVariable("id") Integer id) {
        return userService.selectByUserId(id);
    }

    @GetMapping("/search")
    public Response<List<UserDTO>> search(@RequestBody UserSearchDTO dto) {
        return userService.search(dto);
    }
}
