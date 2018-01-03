import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet",urlPatterns = "/login")
public class loginServlet extends HttpServlet {
    //@注解
    //name就是这个Servlet的名字,生成时默认使用类名
    //urlPatterns就是访问这个Servlet时使用的路径
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //获取用户传递的参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("zhangSan") && password.equals("123")){
            //要先跳转到主页,表示登录成功

            // 设置状态码,302表示重定向
            response.setStatus(302);

            //add是添加,header是头
            //这里就是添加响应头
            //add和set的区别
            //set是给某一个头,设置内容
            //add是给某一个头,添加内容
            //也就是说多个add,那么该头有多个内容
            //多个set,那么该头之前set的会被覆盖
            response.setHeader("location","http://localhost:8080/index.jsp");
//            //重定向快捷写法,直接一条语句即可
//            response.sendRedirect("http://localhost:8080/index.jsp");
        }else {
            //设置头ContentType的内容为....
//            response.setHeader("ContentType","text/html;charset=utf-8");
            response.setContentType("text/html;charset=utf-8");
            //跳转到错误页面提示失败
            response.getWriter().write("失败了");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referrer = request.getHeader("Referrer");
        System.out.println(referrer);
    }
}
