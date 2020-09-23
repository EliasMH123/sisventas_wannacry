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
	private PersonaDao personaDao;
	@Test
	void contextLoads() {
		/*
		Rol r = new Rol();
		r.setNomrol("Administrador");
		System.out.println(rolDao.create(r));
		*/
		Persona p = new Persona();
		p.setNombres("Julio");
		p.setApellidos("Davila Cerron");
		p.setDni("12345678");
		System.out.println(personaDao.create(p));
	}

}
