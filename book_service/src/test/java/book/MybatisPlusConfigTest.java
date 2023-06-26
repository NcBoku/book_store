package book;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import core.client.user.UserClient;
import core.config.MybatisPlusConfig;
import core.constants.ResponseStatus;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class MybatisPlusConfigTest {

    @Autowired
    private MybatisPlusInterceptor mybatisPlusInterceptor;


    @Test
    public void test(){
        System.out.println(ResponseStatus.OK);
    }
}
