package data.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Data
@Alias("ChatLogDto")
public class ChatLogDto {
    private int id;
    private int senderId;
    private int receiverId;
    private boolean isRead;
    private String message;
    private int groupId;
    private String file;
    private Timestamp createdAt;
}
