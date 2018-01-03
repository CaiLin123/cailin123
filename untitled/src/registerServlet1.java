import org.apache.commons.beanutils.BeanUtils;
import zuoye.User;
import zuoye.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

@WebServlet(name = "registerServlet1",urlPatterns = "/r")
public class registerServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        Map<String, String[]> parameterMap = request.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user,parameterMap);
            System.out.println(user.getUsername());
            User user1 = UserDao.select(user.getUsername());
            if(user1 == null){
                int i = UserDao.add(user);
                System.out.println("注册成功,"+i+"行受到影响" );
                response.sendRedirect("http://localhost:8080/登录.html");
            }else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/注册.html");
                dispatcher.forward(request,response);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
