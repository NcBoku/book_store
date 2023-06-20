package book.mapper;

import book.pojo.bo.ChapterBO;
import book.pojo.po.Chapter;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ChapterMapper extends BaseMapper<Chapter> {

    Chapter selectChapterById(@Param("id") Integer id);

    List<ChapterBO> selectChaptersBOByBookId(@Param("id") Integer id);
}
