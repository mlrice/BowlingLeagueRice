package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Team;




/**
 * Servlet implementation class editBowlingLeagueServlet
 */
@WebServlet("/editBowlingLeagueServlet")
public class editTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editTeamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
			
		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String act = request.getParameter("doThisToItem");
		TeamHelper dao = new TeamHelper();
		if (act == null) {
			//no button has been selected
			getServletContext().getRequestDispatcher("/editTeamServlet").forward(request, response);
		} else if (act.equals("Delete team")) {
			Integer tempId = Integer.parseInt(request.getParameter("id"));
			Team itemToDelete = dao.searchForItemById(tempId);
			dao.deleteItem(itemToDelete);

			getServletContext().getRequestDispatcher("/editTeamServlet").forward(request, response);
		} 
		else if (act.equals("Add a new team")) {
			getServletContext().getRequestDispatcher("/addTeam.html").forward(request, response);
		}
	}

}
