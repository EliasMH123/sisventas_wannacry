package pe.edu.upeu.sisventas_wannacry.daoImpl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.sisventas_wannacry.dao.PersonaDao;
import pe.edu.upeu.sisventas_wannacry.entity.Persona;
@Repository
public class PersonaDaoImpl implements PersonaDao{
@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Persona p){
		// TODO Auto-generated method stub
		String sql="insert into persona(nombres,apellidos,dni)values(?,?,?)";
		return jdbcTemplate.update(sql,p.getNombres(),p.getApellidos(),p.getDni());
	}
	@Override
	public int update(Persona p){
		// TODO Auto-generated method stub
		String sql="update persona set nombres=?,apellidos=?,dni=? where idpersona=?";
		return jdbcTemplate.update(sql,p.getNombres(),p.getApellidos(),p.getDni(),p.getIdpersona());
	}
	@Override
	public int delete(int id){
		// TODO Auto-generated method stub
		String sql="delete from persona where idpersona=?";
		return jdbcTemplate.update(sql,id);
	}

	@Override
	public Persona read(int id){
		// TODO Auto-generated method stub
		String sql="select *from persona where idpersona=?";
		return jdbcTemplate.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<Persona>(Persona.class));
	}
	@Override
	public List<Map<String, Object>>readAll(){
		// TODO Auto-generated method stub
		String sql="select *from persona";
		return jdbcTemplate.queryForList(sql);
	}
}