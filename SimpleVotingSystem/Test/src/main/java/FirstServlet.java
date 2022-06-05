
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = resp.getWriter();
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(60*60*24);
        //Integer count = (Integer)session.getAttribute("count");
        Date date = (Date)session.getAttribute("date");
        //SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);

        pw.println("<html>");


        if(date==null)
            {
                pw.println("<h1>Success Vote! </h1>");
                date = new Date();

            }

            Date date1 = new Date();
            long diffInMillies = Math.abs(date1.getTime() - date.getTime());
            long difference = 86400000 - diffInMillies;
            long hours = TimeUnit.MILLISECONDS.toHours(difference);
            difference -= TimeUnit.HOURS.toMillis(hours);
            long minutes = TimeUnit.MILLISECONDS.toMinutes(difference);
            difference -= TimeUnit.MINUTES.toMillis(minutes);
            long seconds = TimeUnit.MILLISECONDS.toSeconds(difference);


            session.setAttribute("date", date);
            pw.println("<h1>Last Voting: " + date + "</h1>");
            pw.println("<h1> " + hours + ":"+minutes+":"+seconds + " till next voting </h1>");

        pw.println("</html>");
    }
}















