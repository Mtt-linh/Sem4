package com.exemple.controller;

import com.exemple.model.LoginBean;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginController")
public class LoginController extends HttpServlet {
//    @Override
//    public void init() throws ServletException {
//        super.init();
//        //create request and respone objects
//    }
//
//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        super.service(req, res);
//        //request and response di qua service()
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     //step 1
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //step 2 call instance of omdel
        LoginBean loginBean= new LoginBean();
        loginBean.setUsername(username);
        loginBean.setPassword(password);

        boolean status = loginBean.checkloging();
        HttpSession session = request.getSession();
        if (status){
            session.setAttribute("bean",loginBean);
            //step 3 redirect toview
            response.sendRedirect("success.jsp");
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("success,jsp");

        }else {
             response.sendRedirect("fail.jsp");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
//    public  void  myBiz(){
//        LoginBean loginBean = new LoginBean();
//        loginBean.checkloging();
//    }
//
//    @Override
//    public void destroy() {
//        super.destroy();
//    }
}
