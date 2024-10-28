package ar.edu.unju.escmi.dao;

import ar.edu.unju.escmi.entities.Producto;

public interface IProductoDao {
	public void guardarProducto(Producto producto);
	public void modificarPrecioProducto(Producto producto);
	public void eliminarProductoLogicamente(Producto producto);
}
