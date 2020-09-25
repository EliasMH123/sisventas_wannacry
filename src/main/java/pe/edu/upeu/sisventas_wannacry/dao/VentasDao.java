package pe.edu.upeu.sisventas_wannacry.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sisventas_wannacry.entity.Ventas;

public interface VentasDao {
	
	int create(Ventas v);
	int update(Ventas v);
	int delete(int id);
	Ventas read(int id);
	List<Map<String,Object>> readAll();
}
