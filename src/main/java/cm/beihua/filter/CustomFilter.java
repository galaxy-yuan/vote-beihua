package cm.beihua.filter;

import java.io.IOException;



import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomFilter implements Filter {

  private	FilterConfig config=null;
	
	@Override
	public void destroy() {
       this.config = null;
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse= (HttpServletResponse) response;
		
		httpResponse.setHeader("Access-Control-Max-Age",
                config.getInitParameter("AccessControlMaxAge"));
		httpResponse.setHeader("Access-Control-Allow-Origin",
        		config.getInitParameter("AccessControlAllowOrigin"));
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		
		this.config = config;
		System.out.print("con");
 
	}

}
