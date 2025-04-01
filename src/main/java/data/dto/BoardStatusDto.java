package data.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("BoardStatusDto")
public class BoardStatusDto {
    private int boardId;
    private int viewCnt;
    private int likeCnt;
    private int dislikeCnt;
    private int reportCnt;
}
