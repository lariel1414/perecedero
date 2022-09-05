
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Perecedero extends Producto{
    private int diasPorCaducar;


    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                '}';
    }
    @Override
    public double calcular(int cantidadDeProductos){
        double total;
        double subtotal = super.calcular(cantidadDeProductos);
        switch(diasPorCaducar){
            case 1:
                total = subtotal - (subtotal / 4);
                break;
            case 2:
                total = subtotal - (subtotal / 3);
                break;
            case 3:
                total = subtotal - (subtotal / 2);
                break;
            default:
                total = subtotal;
                break;
        }
        return total;
    }
}
