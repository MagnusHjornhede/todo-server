package restfulservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	private static final String template ="This is a test, %s";
	private final AtomicLong counter = new AtomicLong();
	
	/*@GetMapping("/Test")
	public FirstTest firstTest(@RequestParam(value="name", defaultValue = "World") String name) {
		return new 
	}*/
	
}
