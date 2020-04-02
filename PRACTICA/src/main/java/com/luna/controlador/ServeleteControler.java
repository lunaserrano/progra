package com.luna.controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luna.entidades.Stock;

/**
 * Servlet implementation class ServeleteControler
 */
public class ServeleteControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeleteControler() {
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
		doGet(request, response);
		
		String acction = request.getParameter("btn");
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("PRACTICA");
		em =  emf.createEntityManager();
		Stock sk = new Stock();
		
		try {
			String id = request.getParameter("Id");
			String nombre = request.getParameter("Pnombre");
			String precio = request.getParameter("Pprecio");
			String cantidad = request.getParameter("Pcantidad");
			String total = request.getParameter("Ptotal");
			
			
			sk.setId(Integer.parseInt(id));
			sk.setNombre_producto(nombre);
			sk.setPrecio_producto(Double.parseDouble(precio));
			sk.setCantidad_producto(Integer.parseInt(cantidad));
			sk.setTotal_precio(Double.parseDouble(total));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(acction.equals("agregar"))
		{
			//begin() hace referencia a que vamos a inicializar las transacciones
			em.getTransaction().begin();
			//merge se utiliza para actializar los datos
			//em.merge(sk);
			//persist se utiliza para guarar los datos
			em.persist(sk);
			
			// flush() lo utilizamos para enviar las transacciones a nuesto servicio de jpa si no se guarda nada indica el error
			em.flush();
			em.getTransaction().commit();
			
			
			
			response.sendRedirect("index.jsp");
		}
		else if(acction.equals("eliminar"))
		{
			
			sk = em.getReference(Stock.class, sk.getId());
			em.getTransaction().begin();
			em.remove(sk);
			em.flush();
			em.getTransaction().commit();
			
			response.sendRedirect("index.jsp");
		}
		else if(acction.equals("modificar"))
		{
			em.getTransaction().begin();
			em.merge(sk);
			em.flush();
			em.getTransaction().commit();
			
			response.sendRedirect("index.jsp");
		}
		
		
	}

}
