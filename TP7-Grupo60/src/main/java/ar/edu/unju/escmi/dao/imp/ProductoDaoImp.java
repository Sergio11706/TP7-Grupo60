package ar.edu.unju.escmi.dao.imp;

import javax.persistence.EntityManager;

import ar.edu.unju.escmi.config.EmfSingleton;
import ar.edu.unju.escmi.dao.IProductoDao;
import ar.edu.unju.escmi.entities.Producto;

public class ProductoDaoImp implements IProductoDao {
	private static EntityManager manager = EmfSingleton.getInstance().getEmf().createEntityManager();
	
	@Override
	public void guardarProducto(Producto producto) {
		try {
			manager.getTransaction().begin();
			manager.persist(producto);
			manager.getTransaction().commit();
		}catch(Exception e) {
			if(manager.getTransaction() != null) {
				manager.getTransaction().rollback();
			}
			System.out.println("No se pudo guardar el producto");	
		}finally {
			manager.close();
		}
	}

	@Override
	public void modificarPrecioProducto(Producto producto) {
		try {
			manager.getTransaction().begin();
			manager.merge(producto);
			manager.getTrasaction().commit();
		}catch(Exception e){
			if(manager.getTransaction() != null) {
				manager.getTransaction().rollback();
			}
		}finally {
			manager.close();
		}
	}

	@Override
	public void eliminarProductoLogicamente(Producto producto) {
		try {
			manager.getTransaction().begin();
			manager.remove(producto);
			manager.getTransaction().commit();
		}catch(Exception e) {
			if(manager.getTransaction() != null) {
				manager.getTransaction().rollback();
			}
		}finally {
			manager.close();
		}
	}
}
