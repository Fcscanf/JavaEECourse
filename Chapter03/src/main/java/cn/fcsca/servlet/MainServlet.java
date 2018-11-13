package cn.fcsca.servlet;

import cn.fcsca.model.User;
import cn.fcsca.utils.DB;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class MainServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("UTF-8");
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        DB db = new DB();
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            user = db.checkUser(username, pwd);
        }
        session.setAttribute("user", user);
        if (user != null) {
            ArrayList arrayList = db.findinfo();
            session.setAttribute("arrayList", arrayList);
            response.sendRedirect("/jsp/main.jsp");
        } else {
            response.sendRedirect("/jsp/login.jsp");
        }
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
