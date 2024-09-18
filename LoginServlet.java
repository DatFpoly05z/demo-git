package com.example.sd19303;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = {
        "/hien-thi/dang-nhap",
        "/dang-nhap"
})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if(uri.contains("/hien-thi/dang-nhap")){
            request.getRequestDispatcher("/dangnhap.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if(uri.equals("/dang-nhap")){
            String username = request.getParameter("username");
            String password = request.getParameter("pass");
            System.out.println("Thong tin la:"+ username +"---"+password);
            if(username.equals("datkc") && password.equals("123456")){
                System.out.println("Dang nhap thanh cong");
                request.setAttribute("username",username);
                request.getRequestDispatcher("/home.jsp").forward(request,response);
            }
        }
    }







}
