package book.mapper;

import book.pojo.bo.BookBO;
import book.pojo.dto.BookSearchDTO;
import book.pojo.po.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface BookMapper extends BaseMapper<Book> {

    List<BookBO> list(@Param("page") Page<BookBO> page, @Param("bookName") String bookName,
                      @Param("categoryName") String categoryName, @Param("userIds") List<Integer> userIds,
                      @Param("createdTime") Timestamp createdTime, @Param("endedTime") Timestamp endedTime,
                      @Param("sortedKey") String sortedKey, @Param("isASC") Boolean isASC);
}
