package com.example.sd19303;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Demo", value = {
        "/home/index",
        "/trang-chu/hien-thi",
        "/trang-chu/them",
        "/khach-hang/xoa"
})

public class Demo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getRequestURI());
        String uri = request.getRequestURI();
        if(uri.contains("/home/index")){
            System.out.println("Ban dang mo trang index");
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }else if(uri.contains("/trang-chu/hien-thi")){
            String tenKhachHang = "Nguyen Van A";
            request.setAttribute("khachhang",tenKhachHang);
            request.getRequestDispatcher("/home.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Đã chạy vào post");
    }
}
