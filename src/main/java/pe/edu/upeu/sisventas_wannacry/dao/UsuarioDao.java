package pe.edu.upeu.sisventas_wannacry.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sisventas_wannacry.entity.Usuario;

public interface UsuarioDao {

	int create(Usuario p);
	int update(Usuario p);
	int delete(int id);
	Usuario read(int id);
	List<Map<String,Object>> readAll();
}
