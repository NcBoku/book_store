package book.mapper;

import book.pojo.po.Paragraph;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ParagraphMapper extends BaseMapper<Paragraph> {

    List<Paragraph> selectParagraphsByChapterId(@Param("id") Integer id);
}
