package Servlets;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class KathyServlet extends HttpServlet{

    public void doGet (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
         String title="PhraseOMatic has generated the phollowing phrase:";
 response.setContentType("text/html");
 PrintWriter out=response.getWriter();
  out.println("<HTML><HEAD><TITLE>");   
  out.println("PhraseOMatic");   
  out.println("</TITLE></HEAD><BODY>");
  out.println("<H1>"+title+"</H1>");  
    out.println("<P>"+PhraseOMatic.makePhrase());  
    out.println("<P><a href=\"getServletA\">make another phrase</a></p>");  
 out.println("</BODY></HTML>");   
out.close();
}

}

// class PhraseOMatic{
// public static String makePhrase(){

// // make three sets of words o choose from
// String[] wordListOne={"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
// String[] wordListTwo={"empowered", "sticky", "vlued-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
//  "targeted", "shared", "cooperative", "accelerated"};
// String[] wordListThree={"process", "tipping point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

// // find out how many words are in each list
// int oneLength=wordListOne.length;
// int twoLength=wordListTwo.length;
// int threeLength=wordListThree.length;

// // generate three random numbers, to pull random words from each list
// int rand1=(int) (Math.random()*oneLength);
// int rand2=(int) (Math.random()*twoLength);
// int rand3=(int) (Math.random()*threeLength);

// // now build a phrase
// String phrase=wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];

// // now return it
// return ("What we need is a "+phrase);
// }

// }