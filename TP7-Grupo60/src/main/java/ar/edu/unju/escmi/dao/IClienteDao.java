package ar.edu.unju.escmi.dao;

import ar.edu.unju.escmi.entities.Cliente;

public interface IClienteDao {
	public void guardarCliente(Cliente cliente);
	public void modificarCliente(Cliente cliente);
	public void borrarCliente(Cliente cliente);
	public void mostrarTodosLosClientes(Cliente cliente);
}
