import java.util.ArrayList;

public class Distribuidora {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Perecedero("Leche", 220, 1));
        productos.add(new Perecedero("Huevos", 360, 3));
        productos.add(new NoPerecedero("Arroz", 190, "Alimento"));
        productos.add(new NoPerecedero("Azucar", 260, "Alimento"));
        productos.add(new Perecedero("Queso", 680, 5));
        productos.add(new NoPerecedero("Yerba", 300, "Alimento"));
        productos.add(new NoPerecedero("Cafe", 580, "Alimento"));
        productos.add(new Perecedero("Jamon", 960, 2));

        for(Producto prod: productos){
            System.out.println(prod.toString() +
                    ", Total a pagar por 5 productos: $" +
                    prod.calcular(5));
        }
    }
}
