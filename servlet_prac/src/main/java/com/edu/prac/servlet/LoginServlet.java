package com.edu.prac.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append("<head>")
                .append("<title>Login</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>Login</h1>")
                .append("<form action='login' method='post'>")
                .append("<label>사용자명 : </label>")
                .append("<input type='text' name='username'>")
                .append("<br>")
                .append("<label>비밀번호 : </label>")
                .append("<input type='password' name='password'>")
                .append("<br>")
                .append("<input type='submit' value='로그인'>")
                .append("</body>")
                .append("</html>");

        writer.print(sb);
        writer.flush();
        writer.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String name = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter writer = resp.getWriter();

        if("admin".equals(name) && "1234".equals(password)) {
            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h1>로그인 성공!</h1>");
            writer.println("</body>");
            writer.println("</html>");
        } else {
            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h1>로그인 실패ㅠㅠ</h1>");
            writer.println("</body>");
            writer.println("</html>");
        }

        writer.flush();
        writer.close();

    }
}
