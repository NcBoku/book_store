package book;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"book","core"})
@MapperScan("book.mapper")
@EnableFeignClients(basePackages = {"core.client"})
@EnableDiscoveryClient
public class BookService {
    public static void main(String[] args) {
        SpringApplication.run(BookService.class, args);
    }
}
