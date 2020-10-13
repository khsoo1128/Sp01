package soo.ct.domain;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

@Data
public class TodoDTO {
	private String subject;
	
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date cdate;
}