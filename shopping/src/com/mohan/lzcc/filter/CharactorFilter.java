package com.mohan.lzcc.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class CharactorFilter
 */
@WebFilter(
		description = "编码过滤器", 
		urlPatterns = { "/*" }, 
		initParams = { 
				@WebInitParam(name = "reqchar", value = "GB18030", description = "客户端请求编码"), 
				@WebInitParam(name = "respchar", value = "GB18030", description = "服务器响应数据编码")
		})
public class CharactorFilter implements Filter {
	private String reqChar;
	private String respChar;

    /**
     * Default constructor. 
     */
    public CharactorFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		request.setCharacterEncoding(reqChar);
		response.setCharacterEncoding(respChar);
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		reqChar = fConfig.getInitParameter("reqchar");
		respChar = fConfig.getInitParameter("respchar");
		System.out.println("没有在web.xml中配置的过滤器启动初始化了..."+reqChar+"=="+respChar);
	}

}
