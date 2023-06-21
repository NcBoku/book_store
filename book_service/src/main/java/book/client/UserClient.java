package book.client;

import core.constants.ConstantsClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = ConstantsClient.USER_CLIENT, path = ConstantsClient.USER)
public class UserClient {

}
