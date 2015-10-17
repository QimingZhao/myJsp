package controller;
import myJsp.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String userName;
	private String userPassword;
	
	private User myUser;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        myUser = new User();
        userName = "";
        userPassword = "";
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getParameter("action");
		Service(action, request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String action = request.getParameter("action");
		Service(action, request, response);
	}
	
	public void Service(String action, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		if(action == null){
			request.getRequestDispatcher("/homePage.html").forward(request, response);
		}
		else if(action.equals("userLogin")){
			userName = request.getParameter("userName");
			userPassword = request.getParameter("userPassword");
			myUser.setUserName(userName);
			myUser.setUserPassword(userPassword);
			checkValidation(request, response, "/homePage.jsp", "/formPage.jsp");			
		}
		else if(action.equals("registerSubmit")){
			userName = request.getParameter("userName");
			userPassword = request.getParameter("userPassword");
			myUser.setUserName(userName);
			myUser.setUserPassword(userPassword);
			checkValidation(request, response, "/registerPage.jsp", "/formPage.jsp");			
		}
		else if(action.equals("formSubmit")){
			myUser.setAllParameters(userName, 
									userPassword, 
									request.getParameter("firstName"), 
									request.getParameter("lastName"),
									request.getParameter("iDNumber"), 
									request.getParameter("homeAddress"), 
									request.getParameter("zipCode"), 
									request.getParameter("foreignCountry"), 
									request.getParameter("foreignState"), 
									request.getParameter("foreignZip"), 
									request.getParameter("maritalStatus_1"), 
									request.getParameter("maritalStatus_2"), 
									request.getParameter("fill_3"), 
									request.getParameter("fill_4"), 
									request.getParameter("fill_5"), 
									request.getParameter("fill_6"), 
									request.getParameter("fill_7"), 
									request.getParameter("fill_8"), 
									request.getParameter("fill_9"), 
									request.getParameter("fill_10"), 
									request.getParameter("fill_11"), 
									request.getParameter("fill_12"), 
									request.getParameter("fill_13"), 
									request.getParameter("fill_14"), 
									request.getParameter("fill_15"), 
									request.getParameter("fill_16_check_1"), 
									request.getParameter("fill_16_check_2"), 
									request.getParameter("fill_16"), 
									request.getParameter("fill_17"), 
									request.getParameter("fill_18_a"), 
									request.getParameter("fill_18_b"), 
									request.getParameter("fill_19"), 
									request.getParameter("fill_20"), 
									request.getParameter("fill_21"), 
									request.getParameter("fill_22"), 
									request.getParameter("fill_23_a"), 
									request.getParameter("fill_23_b"), 
									request.getParameter("fill_23_c_check_1"), 
									request.getParameter("fill_23_c_check_2"), 
									request.getParameter("fill_23_d"), 
									request.getParameter("fill_23_e"), 
									request.getParameter("fill_24"));
			
			request.setAttribute("myUser", myUser);
			request.getServletContext().getRequestDispatcher("/inputJavabean.jsp").forward(request, response);
		}
		else if(action.equals("register")){
			request.getRequestDispatcher("/registerPage.jsp").forward(request, response);
		}
		else if(action.equals("registerReset")){
			userName = "";
			userPassword = "";
			request.setAttribute("userName", userName);
			request.setAttribute("userPassword", userPassword);
			request.getRequestDispatcher("/registerPage.jsp").forward(request, response);
		}		
		else if(action.equals("search")){

		}		
		else if(action.equals("backtohomepage")){
			request.getRequestDispatcher("/homePage.jsp").forward(request, response);
		}
		else if(action.equals("getDownloadPdfUrl")){
			request.getRequestDispatcher("/pdfPage.html").forward(request, response);
		}
		else ;
	}
	
	public void checkValidation(HttpServletRequest request, HttpServletResponse response, String hUrl, String fUrl) throws ServletException, IOException{
		if(myUser.validate() == -1){
			userName="用户名不可为空";
			userPassword="密码不可为空";
			request.setAttribute("userName", userName);
			request.setAttribute("userPassword", userPassword);				
			request.getServletContext().getRequestDispatcher(hUrl).forward(request, response);				
		}
		else if(myUser.validate() == -2){
			userName="用户名不可为空";
			userPassword="";
			request.setAttribute("userName", userName);
			request.setAttribute("userPassword", userPassword);	
			request.getServletContext().getRequestDispatcher(hUrl).forward(request, response);					
		}
		else if(myUser.validate() == -3){
			userName="";
			userPassword="密码不可为空";
			request.setAttribute("userName", userName);
			request.setAttribute("userPassword", userPassword);
			request.getServletContext().getRequestDispatcher(hUrl).forward(request, response);
		}
		else if(myUser.validate() == -4){
			userName="用户名应大于2个字符";
			userPassword="密码应大于2个字符";
			request.setAttribute("userName", userName);
			request.setAttribute("userPassword", userPassword);
			request.getRequestDispatcher(hUrl).forward(request, response);
		}
		else if(myUser.validate() == -5){
			userName="用户名应大于2个字符";
			userPassword="";
			request.setAttribute("userName", userName);
			request.setAttribute("userPassword", userPassword);
			request.getRequestDispatcher(hUrl).forward(request, response);
		}
		else if(myUser.validate() == -6){
			userName="";
			userPassword="密码应大于2个字符";
			request.setAttribute("userName", userName);
			request.setAttribute("userPassword", userPassword);
			request.getRequestDispatcher(hUrl).forward(request, response);
		}
		else {
			request.setAttribute("userName", userName);
			request.getRequestDispatcher(fUrl).forward(request, response);
		}
	}

}
