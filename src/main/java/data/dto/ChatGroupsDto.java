package data.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("ChatGroupsDto")
public class ChatGroupsDto {
    private int id;
    private String name;
}
