package ar.edu.unju.escmi.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Facturas")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fact_id")
	private long id; 
	
	@Column(name = "fact_fecha")
	private LocalDate fecha = LocalDate.now();
	
	@Column(name = "fact_cliente")
	private Cliente cliente; 
	
	@Column(name = "fact_total")
	private double total;
	
	@Column(name = "fact_estado")
	private boolean estado;
	
	
	public Factura(LocalDate fecha, Cliente cliente, double total) {
		super();
		this.fecha = fecha;
		this.cliente = cliente;
		this.total = total;
		this.estado = true;
	}
	
	
	public long getId() {
		return id;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	public void mostrarFactura() {
		System.out.println("\nID: "+id);
		System.out.println("Fecha: "+fecha);
		System.out.println("Cliente: "+cliente);
		System.out.println("Domicilio del cliente: "+cliente);
		System.out.println("Monto total: "+total);
	}
	
}
