package ClasesYObjetos;

public class inicio {
    public static void main(String[] args) {
        System.out.println("-----------EJERCICIO 1-----------");
        System.out.println("---------------------------------");
        System.out.println("-----------OBJETO PERSONA-----------");
        Persona persona1 = new Persona();
        persona1.Nombre = "Facundo";
        persona1.Apellido = "Suarez";
        persona1.Edad = 19;
        System.out.println("El nombre de la persona1 es: " + persona1.Nombre);
        System.out.println("El apellido de la persona1 es: " + persona1.Apellido);
        System.out.println("La edad de la persona1 es: " + persona1.Edad);
        System.out.println(" ");
        System.out.println("///////////////////////////////////////////////");
        System.out.println(" ");
        System.out.println("-----------OBJETO CARRITO-----------");
        Carrito carrito1 = new Carrito();
        carrito1.productos2[0] = "Coca-Cola 2L";
        carrito1.productos2[1] = "3 Chorizos";
        carrito1.productos2[2] = "3 Morcillas";
        System.out.println("Los productos del carrito 1 son: " + String.join(" /-/ ", carrito1.productos2));
        System.out.println(" ");
        System.out.println("///////////////////////////////////////////////");
        System.out.println(" ");
        System.out.println("-----------OBJETO PRODUCTO-----------");
        System.out.println("Ver en Producto.java");
        System.out.println(" ");
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();
        producto1.Nombre = "Jabón en polvo";
        producto1.Precio = 40;
        producto2.Nombre = "Esponja";
        producto2.Precio = 10;
        producto3.Nombre = "Chocolates";
        producto3.Precio = 100;

        carrito1.productos[0] = producto1;
        carrito1.productos[1] = producto2;
        carrito1.productos[2] = producto3;
        System.out.println(" ");
        System.out.println("-----------EJERCICIO 2-----------");
        System.out.println(carrito1.productos[0].Nombre + " $" + carrito1.productos[0].Precio);
        System.out.println(carrito1.productos[1].Nombre + " $" + carrito1.productos[1].Precio);
        System.out.println(carrito1.productos[2].Nombre + " $" + carrito1.productos[2].Precio);
        System.out.println("El precio total es: " + carrito1.PrecioTotal());
    }
}
