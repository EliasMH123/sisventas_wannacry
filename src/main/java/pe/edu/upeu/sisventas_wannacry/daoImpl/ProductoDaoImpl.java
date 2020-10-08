package pe.edu.upeu.sisventas_wannacry.daoImpl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.sisventas_wannacry.dao.ProductoDao;
import pe.edu.upeu.sisventas_wannacry.entity.Producto;
@Repository
public class ProductoDaoImpl implements ProductoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	@Override
	public int create(Producto p){
		// TODO Auto-generated method stub
		String sql="insert into producto(nomprod,precio,cantidad)values(?,?,?)";
		return jdbcTemplate.update(sql,p.getNomprod(),p.getPrecio(),p.getCantidad());
	}
	@Override
	public int update(Producto p){
		// TODO Auto-generated method stub
		String sql="update producto set nomprod=?,precio=?,cantidad=? where idproducto=?";
		return jdbcTemplate.update(sql,p.getNomprod(),p.getPrecio(),p.getCantidad(),p.getIdproducto());
	}
	@Override
	public int delete(int id){
		// TODO Auto-generated method stub
		String sql="delete from producto where idproducto=?";
		return jdbcTemplate.update(sql,id);
	}
	@Override
	public Producto read(int id){
		// TODO Auto-generated method stub
		String sql="select *from producto where idproducto=?";
		return jdbcTemplate.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<Producto>(Producto.class));
	}
	@Override
	public List<Map<String, Object>>readAll(){
		// TODO Auto-generated method stub
		String sql="select *from producto";
		return jdbcTemplate.queryForList(sql);
	}
}