package data.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Data
@Alias("ApprovalLogDto")
public class ApprovalLogDto {
    public enum ApprovalAction{
        APPROVED, REJECTED
    }
    private int id;
    private int approvalId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
    private Timestamp approvalTime;
    private ApprovalAction action;
}
