package cm.beihua.util;

import org.apache.log4j.Logger;

public class PageUtil {

	Logger logger = Logger.getLogger(PageUtil.class);
	
	public static  Page conventPage(int total,int pageSize,Object obj ) {
		int pageCount=0;
		if(total<0 &&pageSize<0 ){
			
			return null;
		}else{
			
			if(total/pageSize==0){
				
				 pageCount=total/pageSize;
			}else{
				 pageCount=total/pageSize;
			}
			
			return null;
		}
		
		
		
		
	}
	
}
