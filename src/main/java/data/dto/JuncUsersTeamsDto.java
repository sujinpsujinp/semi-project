package data.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("JuncUsersTeamsDto")
public class JuncUsersTeamsDto {
    private int userId;
    private int teamId;
}
