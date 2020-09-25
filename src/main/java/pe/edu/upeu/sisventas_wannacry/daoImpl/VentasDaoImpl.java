package pe.edu.upeu.sisventas_wannacry.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sisventas_wannacry.dao.VentasDao;
import pe.edu.upeu.sisventas_wannacry.entity.Ventas;
@Repository
public class VentasDaoImpl implements VentasDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	
@Override
public int create(Ventas v) {
	// TODO Auto-generated method stub
	String SQL = "insert into ventas(fecha,tipodoc,numdoc,idpersona,idcliente)values(?,?,?,?,?)";
	return jdbcTemplate.update(SQL, v.getFecha(),v.getTipodoc(),v.getNumdoc(),v.getIdpersona(),v.getIdcliente());
	
}

@Override
public int update(Ventas v) {
	// TODO Auto-generated method stub
	String SQL = "update ventas set fecha=?, tipodoc=?, numdoc=?, idpersona=?, idcliente=? where idventas=?";
	return jdbcTemplate.update(SQL, v.getFecha(),v.getTipodoc(),v.getNumdoc(),v.getIdpersona(),v.getIdcliente(),v.getIdventas());
}

@Override
public int delete(int id) {
	// TODO Auto-generated method stub
	String SQL = "delete from ventas where idventas=?";
	return jdbcTemplate.update(SQL, id);
}

@Override
public Ventas read(int id) {
	// TODO Auto-generated method stub
	String SQL = "select *from ventas where idventas=?";
	return jdbcTemplate.queryForObject(SQL,new Object[] {id},new BeanPropertyRowMapper<Ventas>(Ventas.class));
}

@Override
public List<Map<String, Object>> readAll() {
	// TODO Auto-generated method stub
	String SQL = "select *from ventas";
	return jdbcTemplate.queryForList(SQL);
}
}
