package core.pojo.user.dto;

import lombok.Data;

@Data
public class UserSearchDTO {

    private Integer page;

    private Integer size;

    private String name;
}
