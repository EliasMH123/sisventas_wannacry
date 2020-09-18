package pe.edu.upeu.sisventas_wannacry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.sisventas_wannacry.dao.RolDao;
import pe.edu.upeu.sisventas_wannacry.entity.Rol;
import pe.edu.upeu.sisventas_wannacry.service.RolService;

@SpringBootTest
class SisventasWannacryApplicationTests {
	@Autowired
	private RolService rolDao;
	@Test
	void contextLoads() {
		/*
		Rol r = new Rol();
		r.setNomrol("Administrador");
		System.out.println(rolDao.create(r));
		*/
		System.out.println(rolDao.readAll());
	}

}
