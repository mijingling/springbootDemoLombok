package demo.com.domain;

import lombok.Data;

@Data //添加lombok注解@Data,自动生成set,get方法
public class User {
	private String name;  
	private int age;
}
