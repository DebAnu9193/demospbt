package com.springhello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class SpringbootDemo {


  @RequestMapping("/")
  @ResponseBody
  String home()
  {
	  return "Hello World";
  }
  
    public static void main(String[] args)
    {
        
        SpringApplication.run(SpringbootDemo.class, args);
    }
}


