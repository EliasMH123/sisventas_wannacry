package pe.edu.upeu.sisventas_wannacry.serviceImpl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sisventas_wannacry.dao.DetalleVentasDao;
import pe.edu.upeu.sisventas_wannacry.entity.DetalleVentas;
import pe.edu.upeu.sisventas_wannacry.service.DetalleVentasService;
@Service
public class DetalleVentasServiceImp implements DetalleVentasService{
	@Autowired
	private DetalleVentasDao detalleVentasDao;
	@Override
	public int create(DetalleVentas d){
		// TODO Auto-generated method stub
		return detalleVentasDao.create(d);
	}
	@Override
	public int update(DetalleVentas d){
		// TODO Auto-generated method stub
		return detalleVentasDao.update(d);
	}
	@Override
	public int delete(int id){
		// TODO Auto-generated method stub
		return detalleVentasDao.delete(id);
	}
	@Override
	public DetalleVentas read(int id){
		// TODO Auto-generated method stub
		return detalleVentasDao.read(id);
	}
	@Override
	public List<Map<String, Object>> readAll(){
		// TODO Auto-generated method stub
		return detalleVentasDao.readAll();
	}
}