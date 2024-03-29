package com.YLX.ReqServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//获取用户相关信息
		String username="张三";
		PrintWriter printWriter = response.getWriter();
		printWriter.write("用户名为："+username+ "<br>");
		//请求包含查询订单信息
		request.getRequestDispatcher("/OrderServlet").include(request, response);
		printWriter.write("查询结束");
	}
	public void doPost(HttpServletRequest request,
        HttpServletResponse response)throws ServletException, IOException {
		doGet(request, response);
	}
}