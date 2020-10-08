package pe.edu.upeu.sisventas_wannacry.entity;
public class DetalleVentas{
	private int iddetalle_ventas;
	private double precio;
	private int cantidad;
	private double subtotal;
	private int idventas;
	private int idproducto;
	public DetalleVentas(){
	}
	public DetalleVentas(int iddetalle_ventas,double precio,int cantidad,double subtotal,int idventas,int idproducto){
		super();
		this.iddetalle_ventas=iddetalle_ventas;
		this.precio=precio;
		this.cantidad=cantidad;
		this.subtotal=subtotal;
		this.idventas=idventas;
		this.idproducto=idproducto;
	}
	public int getIddetalle_ventas(){
		return iddetalle_ventas;
	}
	public void setIddetalle_ventas(int iddetalle_ventas){
		this.iddetalle_ventas=iddetalle_ventas;
	}
	public double getPrecio(){
		return precio;
	}
	public void setPrecio(double precio){
		this.precio=precio;
	}
	public int getCantidad(){
		return cantidad;
	}
	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	public double getSubtotal(){
		return subtotal;
	}
	public void setSubtotal(double subtotal){
		this.subtotal=subtotal;
	}
	public int getIdventas(){
		return idventas;
	}
	public void setIdventas(int idventas){
		this.idventas=idventas;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto){
		this.idproducto=idproducto;
	}
}