package mx.edu.uttt.Ejercicios;

public class Producto {
//Variables de instancia
private String nombre;
private double precio;
private int existencia;

    public Producto(){
        this.nombre= "Sin nombre";

    }
    public Producto(String nombre, int existencia, double precio) {
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setExistencia(existencia);
    }

    //Metodo accesor de nombre
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public int getExistencia() {
        return this.existencia;
    }

    public void setExistencia(int existencia) {
        if (existencia>=0)
            this.existencia=existencia;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0.0){
            this.precio=precio;
        }
    }

    @Override
    public String toString (){
        return "Nombre: " + this.nombre +
                "\nPrecio: " + this.getPrecio() +
                "\nExistencia: " + this.existencia;

    }




}
