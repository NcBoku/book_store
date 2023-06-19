package book.pojo.bo;

import book.pojo.po.Book;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ChapterBO {
    private Integer chapterId;

    private Book book;

    private Integer no;

    private String name;

    private String status;

    private Timestamp createdTime;

    private Timestamp updatedTime;

    private Boolean isValid;

    private Boolean isDeleted;
}
