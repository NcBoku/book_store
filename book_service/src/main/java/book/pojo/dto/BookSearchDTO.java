package book.pojo.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BookSearchDTO {

    private String bookName;

    private String categoryName;

    private String authorName;

    private Timestamp createdTime;

    private Timestamp endedTime;

    private String sortedKey;

    private Boolean isASC;
}
