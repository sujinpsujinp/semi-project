package data.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@Alias("UsersDto")
public class UsersDto {
    private int id;
    private String name;
    private String email;
    private Date birth;
    private String description;
    private String phone;
    private String addr;
    private String department;
    private String team;
    private String position;
    private String gender;
    private boolean isAdmin;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
    private Timestamp createdAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
    private Timestamp updatedAt;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
    private Timestamp deletedAt;
}
