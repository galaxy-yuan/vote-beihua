package cm.beihua.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.istack.internal.logging.Logger;



@Controller()
public class TestController {

	
  
	@RequestMapping(value="/get",method=RequestMethod.GET)
	@ResponseBody
	public String getdata(HttpServletRequest request,HttpServletResponse response) throws JsonProcessingException{
		
		Map<String, Object> map = new HashMap<String, Object>();
		ObjectMapper mapper = new ObjectMapper();
		
		map.put("ss", "ddd");
		
		String json = mapper.writeValueAsString(map);
		
		System.out.println(json);
		return json;
		
		
	}
	
	@RequestMapping("/main")
	public String amain(HttpServletRequest request,HttpServletResponse response){
		
		return  "zzz";
	}
}
