package cn.fcsca.servlet;

import cn.fcsca.model.LyTable;
import cn.fcsca.model.User;
import cn.fcsca.utils.DB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("UTF-8");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        User user = (User) request.getSession().getAttribute("user");
        LyTable lyTable = new LyTable();
        lyTable.setUserId(user.getId());
        lyTable.setDate(new Date(System.currentTimeMillis()));
        lyTable.setTitle(title);
        lyTable.setContent(content);
        if (new DB().addInfo(lyTable)) {
            response.sendRedirect("/jsp/success.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
