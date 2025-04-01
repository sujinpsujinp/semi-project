package data.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Data
@Alias("MessagesDto")
public class MessagesDto {
    private int id;
    private String content;
    private int senderId;
    private int receiverId;
    private boolean isRead;
    private Timestamp createdAt;
    private Timestamp readAt;
}
