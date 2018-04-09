package com.project.iban;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/rest/test")
class Test{
 
   @RequestMapping(value="/",method = RequestMethod.GET)
   public String getAllStudents(){
	   	  //String URL="https://openiban.com/validate/FR6430002016000000448257G55?getBIC=true&validateBankCode=true";
	   		String URL = "https://openiban.com/validate/DE91100000000123456789?getBIC=true&validateBankCode=true";
	      RestTemplate template=new RestTemplate();
	 
	      String s =template.getForObject(URL,String.class);
      return s;
   }
}
