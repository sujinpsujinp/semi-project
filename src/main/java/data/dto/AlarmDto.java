package data.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("AlarmDto")
public class AlarmDto {
    public enum AlarmType {
        MESSAGE, EMAIL, NOTICE, SYSTEM
    }
    private int id;
    private AlarmType type;
    private boolean isRead;
    private int userId;
    private int causedBy;
}
