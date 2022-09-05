import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Producto {
    protected String nombre;
    protected double precio;
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
    public double calcular(int cantidadDeProductos){
        return precio * cantidadDeProductos;
    }
}
