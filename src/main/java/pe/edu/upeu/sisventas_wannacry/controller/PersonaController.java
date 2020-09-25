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
import pe.edu.upeu.sisventas_wannacry.entity.Persona;
import pe.edu.upeu.sisventas_wannacry.service.PersonaService;
@RestController
@RequestMapping("/personas")
public class PersonaController{
	@Autowired
	private PersonaService personaService;
	@GetMapping("/lista")
	public List<Map<String,Object>> listar(){
		return personaService.readAll();
	}
	@GetMapping("/{id}")
	public Persona read(@PathVariable int id){
		return personaService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id){
		return personaService.delete(id);
	}
	@PostMapping("/persona")
	public int create(@RequestBody Persona persona){
		return personaService.create(persona);
	}
	@PutMapping("edit/{id}")
	public int update(@RequestBody Persona persona,@PathVariable int id){
		Persona p=personaService.read(id);
		p.setNombres(persona.getNombres());
		p.setApellidos(persona.getApellidos());
		p.setDni(persona.getDni());
		return personaService.update(p);
	}
}