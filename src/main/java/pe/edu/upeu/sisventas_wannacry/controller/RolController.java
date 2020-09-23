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

import pe.edu.upeu.sisventas_wannacry.entity.Rol;
import pe.edu.upeu.sisventas_wannacry.service.RolService;

@RestController
@RequestMapping("/roles")
public class RolController {
	
	@Autowired
	private RolService rolService;
	
	@GetMapping("/lista")
	public List<Map<String,Object>> listar(){
		return rolService.readAll();
		
	}
	@GetMapping("/{id}")
	public Rol read(@PathVariable int id) {
		return rolService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return rolService.delete(id);
	}
	@PostMapping("/rol")
	public int create(@RequestBody Rol rol) {
		return rolService.create(rol);
	}
	@PutMapping("edit/{id}")
	public int update(@RequestBody Rol rol,@PathVariable int id) {
		Rol r=rolService.read(id);
		r.setNomrol(rol.getNomrol());
		return rolService.update(r);
	}
}
