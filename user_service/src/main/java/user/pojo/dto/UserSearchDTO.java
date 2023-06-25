package user.pojo.dto;

import lombok.Data;

@Data
public class UserSearchDTO {

    private Integer page;

    private Integer size;

    private String name;
}
