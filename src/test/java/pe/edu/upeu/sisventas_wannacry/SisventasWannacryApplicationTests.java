package pe.edu.upeu.sisventas_wannacry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.sisventas_wannacry.dao.PersonaDao;
import pe.edu.upeu.sisventas_wannacry.dao.RolDao;
import pe.edu.upeu.sisventas_wannacry.entity.Persona;
import pe.edu.upeu.sisventas_wannacry.entity.Rol;
import pe.edu.upeu.sisventas_wannacry.service.RolService;

@SpringBootTest
class SisventasWannacryApplicationTests {
	@Autowired
	private RolDao rolDao;
	@Test
	void contextLoads() {
		/*
		Rol r = new Rol();
		r.setNomrol("Administrador");
		System.out.println(rolDao.create(r));
		*/
		Rol r=new Rol();
		System.out.println(rolDao.delete(2));
		/*System.out.println(rolDao.read(1).getNomrol());*/
	}

}
