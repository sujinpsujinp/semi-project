package data.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import data.dto.SchedulesDto;
import data.service.SchedulesService;
import data.service.UsersService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class SchedulesController {
	final SchedulesService schedulesService;
	final UsersService userService;
	
	//일정관리 페이지 진입
	@GetMapping({"/schedules"})
	public String schedulemain()
	{
		return "schedules/schedules";		
	}
	
	//일정등록
	@PostMapping("/scheduleinsert")
	@ResponseBody
	public String scheduleInsert(
			@RequestBody SchedulesDto dto
			)
	{
		
		try {
			String startTimeStr = dto.getStartDate() + " " + dto.getStartTime();
	        String endTimeStr = dto.getEndDate() + " " + dto.getEndTime();

	        System.out.println("🛠️ 원본 startTimeStr: " + startTimeStr);
	        System.out.println("🛠️ 원본 endTimeStr: " + endTimeStr);

	        // 초가 포함되어 있지 않으면 ":00" 추가
	        if (!startTimeStr.matches(".*:\\d{2}:\\d{2}$")) {
	            startTimeStr += ":00";
	        }
	        if (!endTimeStr.matches(".*:\\d{2}:\\d{2}$")) {
	            endTimeStr += ":00";
	        }

	        System.out.println("💥 최종 startTime 문자열: " + startTimeStr);
	        System.out.println("💥 최종 endTime 문자열: " + endTimeStr);

	        Timestamp startTimestamp = Timestamp.valueOf(startTimeStr);
	        Timestamp endTimestamp = Timestamp.valueOf(endTimeStr);

	        Map<String, Object> map = new HashMap<>();
	        map.put("userId", dto.getUserId());
	        map.put("name", dto.getName());
	        map.put("content", dto.getContent());
	        map.put("isAlltime", dto.isAlltime() ? 1 : 0);
	        map.put("startTime", startTimestamp);
	        map.put("endTime", endTimestamp);
	        map.put("startDate", dto.getStartDate());
	        map.put("endDate", dto.getEndDate());

	        schedulesService.scheduleInsert(map);
	        return "일정 등록 완료";

	    } catch (IllegalArgumentException e) {
	        System.err.println("❌ Timestamp 변환 실패!");
	        e.printStackTrace();
	        return "Timestamp 포맷 오류: " + e.getMessage();
	    }
	}
	
	
}
