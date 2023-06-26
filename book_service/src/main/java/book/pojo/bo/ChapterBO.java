package book.pojo.bo;

import book.pojo.po.Paragraph;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class ChapterBO {
    private Integer id;

    private Integer bookId;

    private Integer no;

    private String name;

    private String status;

    private Timestamp createdTime;

    private Timestamp updatedTime;

    private Boolean isValid;

    private Boolean isDeleted;

    private List<Paragraph> paragraphs;
}
