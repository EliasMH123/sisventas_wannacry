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
import pe.edu.upeu.sisventas_wannacry.entity.Producto;
import pe.edu.upeu.sisventas_wannacry.service.ProductoService;
@RestController
@RequestMapping("/productos")
public class ProductoController{
	@Autowired
	private ProductoService productoService;
	@GetMapping("/lista")
	public List<Map<String,Object>>listar(){
	return productoService.readAll();
	}
	@GetMapping("/{id}")
	public Producto read(@PathVariable int id){
		return productoService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id){
		return productoService.delete(id);
	}
	@PostMapping("/producto")
	public int create(@RequestBody Producto producto){
		return productoService.create(producto);
	}
	@PutMapping("edit/{id}")
	public int update(@RequestBody Producto producto,@PathVariable int id){
		Producto p=productoService.read(id);
		p.setNomprod(producto.getNomprod());
		p.setPrecio(producto.getPrecio());
		p.setCantidad(producto.getCantidad());
		return productoService.update(p);
	}
}