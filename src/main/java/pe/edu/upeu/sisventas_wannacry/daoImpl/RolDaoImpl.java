package pe.edu.upeu.sisventas_wannacry.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sisventas_wannacry.dao.RolDao;
import pe.edu.upeu.sisventas_wannacry.entity.Rol;
@Repository
public class RolDaoImpl implements RolDao{
@Autowired
private JdbcTemplate jdbcTemplate;

@Override
public int create(Rol r) {
	// TODO Auto-generated method stub
	String sql="insert into rol(nomrol) values(?)";
	return jdbcTemplate.update(sql,r.getNomrol());
}
@Override
public int update(Rol r) {
	// TODO Auto-generated method stub
	String sql="update rol set nomrol=? where idrol=?";
	return jdbcTemplate.update(sql,r.getNomrol(),r.getIdrol());
}
@Override
public int delete(int id) {
	// TODO Auto-generated method stub
	String sql="delete from rol where idrol=?";
	return jdbcTemplate.update(sql,id);
}
@Override
public Rol read(int id) {
	// TODO Auto-generated method stub
	String sql="select *from rol where idrol=?";
	return jdbcTemplate.queryForObject(sql,new Object[] {id},new BeanPropertyRowMapper<Rol>(Rol.class));
}
@Override
public List<Map<String, Object>> readAll() {
	// TODO Auto-generated method stub
	String sql="select *from rol";
	return jdbcTemplate.queryForList(sql);
}

}
