package demo.com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.com.domain.User;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j//添加lombok注解@Slf4j,相当于直接注入了日志实例，该类可以直接使用log.xxx输出日志
public class HelloController {
	
	@RequestMapping("/")
	public String hiUser() {
		User user=new User();
		//测试lombok注解@Data
		user.setName("lombok注解@Data");
		user.setAge(1);
		String result=user.toString();
		
		//测试lombok注解@Log(此次测得是@Slf4j的实现)
		log.info("[输出日志]"+result);
		return "[返回User对象参数]"+result;
	}
	
}
