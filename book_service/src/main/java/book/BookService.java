package book;


import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"book","core"})
@MapperScan("book.mapper")
public class BookService {
    public static void main(String[] args) {
        SpringApplication.run(BookService.class, args);
    }
}
