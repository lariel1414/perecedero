
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoPerecedero extends Producto{
    private String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
    @Override
    public double calcular(int cantidadDeProductos) {
        return super.calcular(cantidadDeProductos);
    }
}
