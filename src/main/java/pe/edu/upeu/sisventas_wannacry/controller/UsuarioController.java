package pe.edu.upeu.sisventas_wannacry.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sisventas_wannacry.entity.Usuario;
import pe.edu.upeu.sisventas_wannacry.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/lista")
	public List<Map<String,Object>> listar(){
		return usuarioService.readAll();
		
	}
	@GetMapping("/{id}")
	public Usuario read(@PathVariable int id) {
		return usuarioService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return usuarioService.delete(id);
	}
	@PostMapping("/usuario")
	public int create(@RequestBody Usuario usuario) {
		return usuarioService.create(usuario);
	}
	@PutMapping("edit/{id}")
	public int update(@RequestBody Usuario usuario,@PathVariable int id) {
		Usuario u=usuarioService.read(id);
		u.setNomuser(usuario.getNomuser());
		u.setClave(usuario.getClave());
		u.setEstado(usuario.getEstado());
		u.setIdrol(usuario.getIdrol());
		return usuarioService.update(u);
	}
}
