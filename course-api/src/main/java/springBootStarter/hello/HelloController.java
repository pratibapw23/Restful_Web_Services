package springBootStarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")//Applicable only for default GET method
	public String sayHello()
	{
		return "Hello";
	}
}
