package app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BushoServlet
 */
@WebServlet("/BushoServlet")
public class BushoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BushoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		BushoInfo busho_info = new BushoInfo();
		busho_info.setId(1);
		busho_info.setName("営業部");
		request.setAttribute("busho_info", busho_info);

		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/Busho.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String action = request.getParameter("action");
		RequestDispatcher dispatcher = request.getRequestDispatcher("");
		if(action.equals("save")) {
			String busho_id = request.getParameter("busho_id");
			String busho_name = request.getParameter("busho_name");
			System.out.println("部署ID：" + busho_id + "部署名：" + busho_name + "を登録しました" );
			dispatcher = request.getRequestDispatcher("WEB-INF/success_busho_save.jsp");
		}
		if(action.equals("edit")) {
			System.out.println("編集しました");
			dispatcher = request.getRequestDispatcher("WEB-INF/success_busho_edit.jsp");
		}
		dispatcher.forward(request, response);
	}

}
