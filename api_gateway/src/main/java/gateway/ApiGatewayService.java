package gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"gateway","core"})
@MapperScan("user.mapper")
@EnableDiscoveryClient
public class ApiGatewayService {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayService.class, args);
    }

}
