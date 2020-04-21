package com.luna.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.luna.model.Producto;

public class ProductoDao {

	public List<Producto> productoLista(){
		 
		List<Producto> listapr = new ArrayList<>();
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("PROGRAIII");
		em = emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
			
			listapr = em.createQuery("from Producto").getResultList();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return listapr;
	}

	public void agregarDatos(Producto pr) {
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("PROGRAIII");
		em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(pr);
		em.flush();
		em.getTransaction().commit(); 
	}
	
	public void actualizarDatos(Producto pr) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("PROGRAIII");
		em = emf.createEntityManager();
		
		pr.getId();
		pr.getNombre_producto();
		pr.getCantidad_producto();
		pr.getPrecio_producto();
		pr.getTotal_precio();
		
		em.getTransaction().begin();
		em.merge(pr);
		em.flush();
		em.getTransaction().commit();
		
	}
	
	public void eliminarDatos(Producto pr) {
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("PROGRAIII");
		em = emf.createEntityManager();
		
		pr = em.getReference(Producto.class, pr.getId());
		em.getTransaction().begin();
		em.remove(pr);
		em.flush();
		em.getTransaction().commit();
	}

	}