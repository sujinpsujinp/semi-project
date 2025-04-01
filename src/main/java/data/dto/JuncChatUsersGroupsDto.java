package data.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("JuncChatUsersGroupsDto")
public class JuncChatUsersGroupsDto {
    private int userId;
    private int groupId;
}
