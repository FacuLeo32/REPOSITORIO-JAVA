package ClasesYObjetos;

public class Carrito {
    // Atributos
    Producto[] productos = new Producto[3];
    String[] productos2 = new String[3];

    // Metodo
    public int PrecioTotal() {
        int total = 0;
        for (int i = 0; i < productos.length; i++) {
            total += productos[i].Precio;
        }
        return total;
    }
}

