package cn.fcsca.aa;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * InputServlet
 *
 * @author Fcscanf
 * @description
 * @date 下午 14:27 2018-11-05
 */
public class InputServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String input = request.getParameter("input");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html><head><title>");
        printWriter.println("显示输入的内容");
        printWriter.println("</title><body>");
        printWriter.println(input);
        printWriter.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request,response);
    }
}
