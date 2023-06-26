package book;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import core.constants.ResponseStatus;
import core.util.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class MybatisPlusConfigTest {

    @Autowired
    private MybatisPlusInterceptor mybatisPlusInterceptor;

    @Autowired
    private RedisUtils redisUtils;


    @Test
    public void test() {
        System.out.println(ResponseStatus.OK);
    }

    @Test
    public void redisUtilsTest() {
        redisUtils.set("A", "ABC");
        Assert.isTrue("ABC".equals(redisUtils.get("A")), "成功");
        System.out.println(redisUtils.get("A"));
    }
}
