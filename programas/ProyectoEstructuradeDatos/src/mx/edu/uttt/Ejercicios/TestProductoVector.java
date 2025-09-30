package mx.edu.uttt.Ejercicios;

import javax.swing.*;

public class TestProductoVector {
    public static void main(String[] args) {
      iniciar();

    }

    public static void iniciar(){
        int tamanio = Integer.parseInt(
                JOptionPane.
                        showInputDialog("Introduce el número de productos: "));
        boolean sentinel = true;
        String opcion = "";
        ProductoVector pv = new ProductoVector(tamanio);

        do {
           opcion = JOptionPane.showInputDialog(obtenerMenu());

           switch (opcion){
               case "1":
                   //Insertar el Producto
                   if (pv.estalleno()){
                       JOptionPane.showMessageDialog(null, "Ya no hay espacion para insertar un nuevo producto");
                   }else{
                       pv.agregarProducto(llenarProducto());
                   }
                   break;

               case "2":
                   //Eliminar el Producto
                   break;

               case "3":
                   //Modificar Producto (Nombre, precio o existencia)
                   break;

               case "4":
                   //Buscar producto
                   break;

               case "5":
                   //Imprimir
                   JOptionPane.showMessageDialog(null,
                           pv.imprimir());
                   break;

               case "6":
                   //Salir
                   sentinel= false;
                   JOptionPane.showMessageDialog(null, "Hasta pronto");
                   break;
               default: JOptionPane.showMessageDialog(null, "Opción no Válida");

           }
        }while(sentinel);

    }

    public static String obtenerMenu () {
    return "Menu Principal\n" +
            "1)Insertar Producto" +
            "\n2)Eliminar Producto" +
            "\n3)Modificar Producto" +
            "\n4)Buscar Producto" +
            "\n5)Imprimir Productos" +
            "\n6)Salir" +
            "\nElegir Opción: ";

    }

    public static Producto llenarProducto (){
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del producto: ");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto: "));
        int existencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce la existencia del producto: "));

        Producto p1 =new Producto();
        p1.setNombre(nombre);
        p1.setPrecio(precio);
        p1.setExistencia(existencia);

        return p1;
    }
}
