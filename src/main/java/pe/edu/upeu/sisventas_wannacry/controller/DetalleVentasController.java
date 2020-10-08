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
import pe.edu.upeu.sisventas_wannacry.entity.DetalleVentas;
import pe.edu.upeu.sisventas_wannacry.service.DetalleVentasService;
@RestController
@RequestMapping("/detallesventas")
public class DetalleVentasController {
	@Autowired
	private DetalleVentasService detalleVentasService;
	@GetMapping("/lista")
	public List<Map<String,Object>>listar(){
		return detalleVentasService.readAll();
	}
	@GetMapping("/{id}")
	public DetalleVentas read(@PathVariable int id){
		return detalleVentasService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id){
		return detalleVentasService.delete(id);
	}
	@PostMapping("/detalleventa")
	public int create(@RequestBody DetalleVentas detalleVentas) {
		return detalleVentasService.create(detalleVentas);
	}
	@PutMapping("edit/{id}")
	public int update(@RequestBody DetalleVentas detalleVentas,@PathVariable int id){
		DetalleVentas d=detalleVentasService.read(id);
		d.setPrecio(detalleVentas.getPrecio());
		d.setCantidad(detalleVentas.getCantidad());
		d.setSubtotal(detalleVentas.getSubtotal());
		d.setIdventas(detalleVentas.getIdventas());
		d.setIdproducto(detalleVentas.getIdproducto());
		return detalleVentasService.update(d);
	}
}