// ServletReference.java
// Reference implementation showing how the static list would be returned
// by a real Java Servlet, called via AJAX from 01-city-dropdown.html/js.
// Not runnable here (no server) - included for reference to wire into
// your actual Eclipse/Tomcat project.

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CityServlet extends HttpServlet {

    private static final Map<String, String[]> CITY_DATA = new HashMap<>();
    static {
        CITY_DATA.put("Andhra Pradesh", new String[]{"Vijayawada", "Visakhapatnam", "Guntur", "Tirupati"});
        CITY_DATA.put("Telangana", new String[]{"Hyderabad", "Warangal", "Karimnagar", "Nizamabad"});
        CITY_DATA.put("Karnataka", new String[]{"Bengaluru", "Mysuru", "Mangaluru", "Hubballi"});
        CITY_DATA.put("Tamil Nadu", new String[]{"Chennai", "Coimbatore", "Madurai", "Salem"});
        CITY_DATA.put("Maharashtra", new String[]{"Mumbai", "Pune", "Nagpur", "Nashik"});
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String state = request.getParameter("state");
        response.setContentType("application/json");

        String[] cities = CITY_DATA.getOrDefault(state, new String[0]);

        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < cities.length; i++) {
            json.append("\"").append(cities[i]).append("\"");
            if (i < cities.length - 1) json.append(",");
        }
        json.append("]");

        PrintWriter out = response.getWriter();
        out.print(json.toString());
        out.flush();
    }
}
