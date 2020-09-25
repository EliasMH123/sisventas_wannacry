package pe.edu.upeu.sisventas_wannacry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.upeu.sisventas_wannacry.dao.PersonaDao;
import pe.edu.upeu.sisventas_wannacry.dao.ProductoDao;
import pe.edu.upeu.sisventas_wannacry.dao.RolDao;
import pe.edu.upeu.sisventas_wannacry.entity.Persona;
import pe.edu.upeu.sisventas_wannacry.entity.Producto;
import pe.edu.upeu.sisventas_wannacry.entity.Rol;
import pe.edu.upeu.sisventas_wannacry.service.RolService;
@SpringBootTest
class SisventasWannacryApplicationTests {
	@Autowired
	private ProductoDao productoDao;
	@Test
	void contextLoads() {
		/*
		Rol r = new Rol();
		r.setNomrol("Administrador");
		System.out.println(rolDao.create(r));
		*/
		/*Rol r=new Rol();
		System.out.println(rolDao.delete(2));*/
		/*System.out.println(rolDao.read(1).getNomrol());*/
		Producto p=new Producto();
		/*p.setNomprod("yogurt");
		p.setPrecio(5.30);
		p.setCantidad(12);
		System.out.println(productoDao.create(p));*/
		p.setIdproducto(1);
		p.setNomprod("leche");
		p.setPrecio(3.50);
		p.setCantidad(24);
		System.out.println(productoDao.update(p));
		//System.out.println(productoDao.delete(4));
	}
}