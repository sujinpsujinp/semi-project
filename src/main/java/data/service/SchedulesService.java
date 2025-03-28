package data.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.dto.SchedulesDto;
import data.mapper.SchedulesMapper;


@Service
public class SchedulesService {
	@Autowired
	SchedulesMapper schedulesMapper;
	
	//일정 등록
	public void scheduleInsert(Map<String, Object> map) {

    	schedulesMapper.scheduleInsert(map);
    }
}
