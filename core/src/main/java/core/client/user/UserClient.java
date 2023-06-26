package core.client.user;

import core.constants.ConstantsClient;
import core.pojo.common.Response;
import core.pojo.user.dto.UserDTO;
import core.pojo.user.dto.UserSearchDTO;
import core.pojo.user.po.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
@FeignClient(value = ConstantsClient.USER_CLIENT, path = ConstantsClient.USER)
public interface UserClient {

    @GetMapping("/user/{id}")
    User FindById(@PathVariable("id") Long id);

    @GetMapping("/search")
    Response<List<UserDTO>> search(@RequestBody UserSearchDTO dto);
}
