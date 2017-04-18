package cm.beihua.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cm.beihua.model.Mgr;
import cm.beihua.service.MgrService;
import cm.beihua.util.Page;

@Controller
@RequestMapping("/admin")
public class MgrController {

	Logger logger = Logger.getLogger(MgrController.class);
	
	@Autowired
	private MgrService mgrService;
	
	@RequestMapping("/mgr/list")
	public String  getMgrList(HttpServletRequest request,
			HttpServletResponse respose,Model model,
			@RequestParam(defaultValue="1" ,required=false) int pageNum,
			@RequestParam(defaultValue="10" ,required=false) int pageSize,
			@RequestParam(required=false) Integer id,
			@RequestParam( required=false) String name
			){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		map.put("pageNum", pageNum);
		map.put("pageSize", pageSize);
		map.put("id", id);
		map.put("name", name);
	   
    
      List<Mgr> list = mgrService.queryByPage(map);
      int total = mgrService.queryByTotal(map);
      Page<Mgr> page = new Page<Mgr>(total,pageSize,pageNum,list);
       
      model.addAttribute("data", page);
      System.out.println(page);
		return "mgrlist";
	}
	
	 @RequestMapping("/mgr/add")
	 public void addMgrInfo(HttpServletRequest request,Mgr record){
		
		
		int flage = mgrService.addMgrInfo(record);
		
	}
	@RequestMapping(value="/mgr/delete/{id}")
	 public void deleteMgrInfo(HttpServletRequest request,String id){
		 
		//int flage = mgrService.deleteMgrInfo(id);
		
		System.out.print(id);
	 }
	 
}
