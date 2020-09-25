package pe.edu.upeu.sisventas_wannacry.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sisventas_wannacry.dao.VentasDao;
import pe.edu.upeu.sisventas_wannacry.entity.Ventas;
import pe.edu.upeu.sisventas_wannacry.service.VentasService;
@Service
public class VentasServiceImpl implements VentasService{
	
	@Autowired
	private VentasDao ventasDao;
	@Override
	public int create(Ventas v) {
		// TODO Auto-generated method stub
		return ventasDao.create(v);
	}

	@Override
	public int update(Ventas v) {
		// TODO Auto-generated method stub
		return ventasDao.update(v);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return ventasDao.delete(id);
	}

	@Override
	public Ventas read(int id) {
		// TODO Auto-generated method stub
		return ventasDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ventasDao.readAll();
	}
}
