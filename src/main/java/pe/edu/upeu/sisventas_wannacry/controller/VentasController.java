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

import pe.edu.upeu.sisventas_wannacry.entity.Ventas;
import pe.edu.upeu.sisventas_wannacry.service.VentasService;

@RestController
@RequestMapping("/ventas")
public class VentasController {
	
	@Autowired
	private VentasService ventasService;
	
	@GetMapping("/lista")
	public List<Map<String,Object>> listar(){
		return ventasService.readAll();
		
	}
	@GetMapping("/{id}")
	public Ventas read(@PathVariable int id) {
		return ventasService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return ventasService.delete(id);
	}
	@PostMapping("/venta")
	public int create(@RequestBody Ventas ventas) {
		return ventasService.create(ventas);
	}
	@PutMapping("edit/{id}")
	public int update(@RequestBody Ventas ventas,@PathVariable int id) {
		Ventas v=ventasService.read(id);
		v.setFecha(ventas.getFecha());
		v.setTipodoc(ventas.getTipodoc());
		v.setNumdoc(ventas.getNumdoc());
		v.setIdpersona(ventas.getIdpersona());
		v.setIdcliente(ventas.getIdcliente());
		return ventasService.update(v);
	}
}
