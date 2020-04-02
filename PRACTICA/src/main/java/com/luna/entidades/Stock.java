package com.luna.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stock database table.
 * 
 */
@Entity
@NamedQuery(name="Stock.findAll", query="SELECT s FROM Stock s")
public class Stock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int cantidad_producto;

	private String nombre_producto;

	private double precio_producto;

	private double total_precio;

	public Stock() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad_producto() {
		return this.cantidad_producto;
	}

	public void setCantidad_producto(int cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}

	public String getNombre_producto() {
		return this.nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public double getPrecio_producto() {
		return this.precio_producto;
	}

	public void setPrecio_producto(double precio_producto) {
		this.precio_producto = precio_producto;
	}

	public double getTotal_precio() {
		return this.total_precio;
	}

	public void setTotal_precio(double total_precio) {
		this.total_precio = total_precio;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", cantidad_producto=" + cantidad_producto + ", nombre_producto=" + nombre_producto
				+ ", precio_producto=" + precio_producto + ", total_precio=" + total_precio + "]";
	}

	
}