package book.mapper;

import book.pojo.dto.BookSearchDTO;
import book.pojo.po.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper extends BaseMapper<Book> {

    List<Book> list(@Param("page") Page<Book> page, @Param("dto") BookSearchDTO bookSearchDTO);
}
