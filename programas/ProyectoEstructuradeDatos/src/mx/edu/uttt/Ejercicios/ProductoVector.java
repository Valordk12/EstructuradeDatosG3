package mx.edu.uttt.Ejercicios;

import javax.sound.sampled.Port;
import javax.swing.*;

public class ProductoVector {

    //Variable de instancia
    private Producto [] productos;
    private final int TAMANIO = 3;

    public ProductoVector (){
        productos = new Producto[TAMANIO];

    }

    public ProductoVector(int tamanio){
        if (tamanio>0){
            productos = new Producto[tamanio];
        }else{
            productos = new Producto[TAMANIO];
        }
    }
    public void agregarProducto (Producto producto){
        if (estalleno()){
            JOptionPane.showMessageDialog(null,
                    "El arreglo esta lleno no se pueden agregar mas productos");
        }else{
            this.productos[obtenerPosicion()] = producto;
            JOptionPane.showMessageDialog(null, "Se inserto el Producto");
        }

    }

    public String imprimir () {
        String salida = "Lista de Productos ";
        if (productos[0] != null) {
            for (int i = 0; i < productos.length; i++) {
                if (productos[i]!=null) {
                    salida += "Nombre: " + productos[i].getNombre() +
                            "\nPrecio: " + productos[i].getPrecio() +
                            "\nExistecia: " + productos[i].getExistencia() +
                            "\nImporte Inventario: " + productos[i].getPrecio() * productos[i].getExistencia()
                            + "\n";
                }
        }
    }
        return salida;
    }

    public boolean estalleno () {
        boolean sentinel = true;

        for (Producto producto : this.productos){
         if (producto == null){
             sentinel = false;
             break;
         }
        }

        return sentinel;
    }

    private int obtenerPosicion(){
        int posicion = 0;
        for (int i = 0; i < this.productos.length ; i++) {
            if (this.productos[i] == null){
                posicion = i;
                break;
            }
        }
        return posicion;
    }


}































