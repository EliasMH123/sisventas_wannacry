package pe.edu.upeu.sisventas_wannacry.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sisventas_wannacry.entity.Persona;

public interface PersonaService {
	
	int create(Persona r);
	int update(Persona r);
	int delete(int id);
	Persona read(int id);
	List<Map<String,Object>> readAll();
}
