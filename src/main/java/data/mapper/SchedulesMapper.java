package data.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import data.dto.SchedulesDto;

@Mapper
public interface SchedulesMapper {
	
	//등록
	public void scheduleInsert(Map<String,Object> map);
	
	
}
