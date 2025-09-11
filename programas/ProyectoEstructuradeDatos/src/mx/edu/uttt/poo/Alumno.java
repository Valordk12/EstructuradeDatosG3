package mx.edu.uttt.poo;

public class Alumno {

    //Variables de instancia

    private String nombre;
    private int edad;
    private char sexo;
    private boolean activo;
    private double promedio;

    //Constructor vaio
    public Alumno(){
     this.nombre = "Sin Nombre";
     this.edad = 17;
     this.sexo = 'x';
     this.activo = false;
     this.promedio = 0.0;

    }
    //Constructor que recibe parametros

    public Alumno (String nombre, int edad, char sexo, boolean activo, double promedio){
    this.nombre = nombre;


    this.edad = edad>=17 && edad <=50?edad:17;
    this.sexo = sexo == 'h' || sexo == 'H'?sexo:'h';
    this.activo = activo;
    this.promedio = promedio>= 1.0 && promedio <=10.0?promedio:0.0;


    }

    //Metodo Mutador (Set)
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    //Metodo Accesor (get)
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;

    }

    public int getEdad(){
        return this.edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean getActivo() {
        return activo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", activo=" + activo +
                ", promedio=" + promedio +
                '}';
    }

}


