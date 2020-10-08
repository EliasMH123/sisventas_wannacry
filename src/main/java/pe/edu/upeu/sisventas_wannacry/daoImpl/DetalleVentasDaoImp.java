package pe.edu.upeu.sisventas_wannacry.daoImpl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.sisventas_wannacry.dao.DetalleVentasDao;
import pe.edu.upeu.sisventas_wannacry.entity.DetalleVentas;
@Repository
public class DetalleVentasDaoImp implements DetalleVentasDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(DetalleVentas d){
		// TODO Auto-generated method stub
		String sql="insert into detalle_ventas(precio,cantidad,subtotal,idventas,idproducto)values(?,?,?,?,?)";
		return jdbcTemplate.update(sql,d.getPrecio(),d.getCantidad(),d.getSubtotal(),d.getIdventas(),d.getIdproducto());
	}
	@Override
	public int update(DetalleVentas d){
		// TODO Auto-generated method stub
		String sql="update detalle_ventas set precio=?,cantidad=?,subtotal=?,idventas=?,idproducto=? where iddetalle_ventas=?";
		return jdbcTemplate.update(sql,d.getPrecio(),d.getCantidad(),d.getSubtotal(),d.getIdventas(),d.getIdproducto(),d.getIddetalle_ventas());
	}
	@Override
	public int delete(int id){
		// TODO Auto-generated method stub
		String sql="delete from detalle_ventas where iddetalle_ventas=?";
		return jdbcTemplate.update(sql,id);
	}
	@Override
	public DetalleVentas read(int id){
		// TODO Auto-generated method stub
		String sql="select *from detalle_ventas where iddetalle_ventas=?";
		return jdbcTemplate.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<DetalleVentas>(DetalleVentas.class));
	}
	@Override
	public List<Map<String, Object>>readAll(){
		// TODO Auto-generated method stub
		String sql="select *from detalle_ventas";
		return jdbcTemplate.queryForList(sql);
	}
}