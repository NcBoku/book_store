package book.pojo.vo;

import book.pojo.dto.BookDTO;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class BookDetailVO {

    private Integer id;

    private String name;

    private Integer categoryId;

    private String category;

    private Integer authorId;

    private String author;

    private String status;

    private String introduce;

    private Integer recommendTicket;

    private Integer downloadCount;

    private Timestamp createdTime;

    private Timestamp updatedTime;

    private Boolean isValid;

    public static BookDetailVO toBookDetailVO(BookDTO dto) {
        BookDetailVO vo = new BookDetailVO();
        vo.setId(dto.getId());
        vo.setName(dto.getName());
        vo.setCategory(dto.getCategory().getName());
        vo.setCategoryId(dto.getCategory().getCategoryId());
        vo.setAuthor(dto.getAuthor().getName());
        vo.setAuthorId(dto.getAuthor().getUserId());
        vo.setStatus(dto.getStatus());
        vo.setIntroduce(dto.getIntroduce());
        vo.setRecommendTicket(dto.getRecommendTicket());
        vo.setDownloadCount(dto.getDownloadCount());
        vo.setCreatedTime(dto.getCreatedTime());
        vo.setUpdatedTime(dto.getUpdatedTime());
        vo.setIsValid(dto.getIsValid());
        return vo;
    }
}
