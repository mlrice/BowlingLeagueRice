package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Player;


/**
 * Servlet implementation class editPlayerServlet
 */
@WebServlet("/editPlayerServlet")
public class editPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editPlayerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String act = request.getParameter("doThisToItem");
		PlayerHelper dao = new PlayerHelper();
		if (act == null) {
			//no button has been selected
			getServletContext().getRequestDispatcher("/ViewAllPlayersServlet").forward(request, response);
		} else if (act.equals("Delete Selected Player")) {
			Integer tempId = Integer.parseInt(request.getParameter("id"));
			Player itemToDelete = dao.searchForItemById(tempId);
			dao.deleteItem(itemToDelete);
			getServletContext().getRequestDispatcher("/ViewAllPlayersServlet").forward(request, response);
		} 
		else if (act.equals("Add New Player")) {
			getServletContext().getRequestDispatcher("/addPlayer.html").forward(request, response);
		}
		else if (act.equals("Back To Menu")) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
	}

}
