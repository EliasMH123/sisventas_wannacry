package pe.edu.upeu.sisventas_wannacry.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sisventas_wannacry.entity.Usuario;

public interface UsuarioService {

	int create(Usuario u);
	int update(Usuario u);
	int delete(int id);
	Usuario read(int id);
	List<Map<String,Object>> readAll();
}
