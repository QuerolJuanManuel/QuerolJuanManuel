package factura;

/**
 * Esta clase genera líneas de factura de un producto con precio y cantidad.
 * @version 8/3/2015
 * @author Juan Manuel Querol Dolz.  
 *
 */

public class LineaFactura {
		
	public String id_producto; 		// identificador (codigo) del producto
	public String nombre_producto; 	// nombre del producto
	
	public float precio; 			//precio por una unidad del producto
	public float cantidad; 			//cantidad de unidades compradas
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
	/**
	 * Constructor 
	 * @param idProducto Identificador <b>(código)</b> del producto.
	 * @param nombreProducto Nombre del producto.
	 * @param precio Precio por una unidad del producto.
	 * @param cantidad Cantidad de unidades compradas.
	 * @param descuento Descuento de la unidad.
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	/**
	 * Redefinimos el método toString para nuestra clase. 
	 * @return String Representa en una String el objeto.
	 */
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Método
	 * @return float Devuelve el precio total de una línea. 
	 * El precio de la unidad por la cantidad de productos pedidos de esa unidad.
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
