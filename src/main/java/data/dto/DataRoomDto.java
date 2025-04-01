package data.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("DataRoomDto")
public class DataRoomDto {
    private int id;
    private String name;
}
