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
		description = "���������", 
		urlPatterns = { "/*" }, 
		initParams = { 
				@WebInitParam(name = "reqchar", value = "GB18030", description = "�ͻ����������"), 
				@WebInitParam(name = "respchar", value = "GB18030", description = "��������Ӧ���ݱ���")
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
		System.out.println("û����web.xml�����õĹ�����������ʼ����..."+reqChar+"=="+respChar);
	}

}
