import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Scanner scanner = new Scanner(new File("C:\\Users\\Сабина\\Downloads\\sample.txt"));
        String t = username + "=" + password;
        boolean check = false;
        while (scanner.hasNext()) {
            String user = scanner.next();
            if (user.equals(t)) {
                pw.println("<h1>Hello, " + username + "</h1>");
                    check=true;
            }
        }
        if(!check)
        {
            pw.println("<h1>Wrong username or password</h1>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Scanner scanner = new Scanner(new File("C:\\Users\\Сабина\\Downloads\\sample.txt"));
        boolean ch = false;
        while(scanner.hasNext()) {
            String user = scanner.next();
            if (user.substring(0,5).equals(username)) {
                ch = true;
            }
        }

        if(ch)
        {
            pw.println("<h1>Registration failed</h1>");
        }
        else
        {
            PrintWriter out = null;
            try {
                out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Сабина\\Downloads\\sample.txt", true)));
                out.println("\n"+username+"="+password);
            } catch (IOException e) {
                System.err.println(e);
            } finally {
                if (out != null) {
                    out.close();
                }
            }
            pw.println("<h1>Registration successful</h1>");

        }


    }
}
