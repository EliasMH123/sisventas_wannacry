package pe.edu.upeu.sisventas_wannacry.dao;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.sisventas_wannacry.entity.Persona;
public interface PersonaDao{
	int create(Persona p);
	int update(Persona p);
	int delete(int id);
	Persona read(int id);
	List<Map<String,Object>>readAll();
}