package pe.edu.upeu.sisventas_wannacry.service;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.sisventas_wannacry.entity.DetalleVentas;
public interface DetalleVentasService{
	int create(DetalleVentas d);
	int update(DetalleVentas d);
	int delete(int id);
	DetalleVentas read(int id);
	List<Map<String,Object>>readAll();
}