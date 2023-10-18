package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class ejercicio5 {
	
		class Producto {
	    private String nombre;
	    private double precioUnitario;

	    public Producto(String nombre, double precioUnitario) {
	        this.setNombre(nombre);
	        this.precioUnitario = precioUnitario;
	    }

	    public double getPrecioUnitario() {
	        return precioUnitario;
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	}

	class ItemCarrito {
	    private Producto producto;
	    private int cantidad;

	    public ItemCarrito(Producto producto, int cantidad) {
	        this.producto = producto;
	        this.cantidad = cantidad;
	    }

	    public double calcularSubtotal() {
	        return producto.getPrecioUnitario() * cantidad;
	    }
	}

	public static Object items;

	class Carrito {
	    private List<ItemCarrito> items = new ArrayList<>();

	    public void agregarItem(ItemCarrito item) {
	        extracted().add(item);
	    }

		@SuppressWarnings("unchecked")
		private List<ItemCarrito> extracted() {
			return (List<ItemCarrito>) ejercicio5.items;
		}

	    public double calcularTotal() {
	        double total = 0;
	        for (ItemCarrito item : items) {
	            total += item.calcularSubtotal();
	        }
	        return total;
	    }
	}

	class Descuento {
	    // Puedes implementar descuentos generales aquí si es necesario.
	}

	class DescuentoFijo extends Descuento {
	    private double montoDescuento;

	    public DescuentoFijo(double montoDescuento) {
	        this.montoDescuento = montoDescuento;
	    }

	    public double aplicarDescuento(double precio) {
	        return precio - montoDescuento;
	    }
	}

	class DescuentoPorcentaje extends Descuento {
	    private double porcentajeDescuento;

	    public DescuentoPorcentaje(double porcentajeDescuento) {
	        this.porcentajeDescuento = porcentajeDescuento;
	    }

	    public double aplicarDescuento(double precio) {
	        return precio * (1 - porcentajeDescuento / 100);
	    }
	}
}
