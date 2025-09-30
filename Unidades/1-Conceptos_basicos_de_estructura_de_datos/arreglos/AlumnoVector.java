package mx.edu.uttt.arreglos;

import javax.swing.*;
import mx.edu.uttt.poo.Alumno;

public class AlumnoVector {
    public static void main(String[] args) {
        int tamanio = 0;
        tamanio = obtenerTamanio();
        Alumno alumnos [] = new Alumno[tamanio];

    }

    public static int obtenerTamanio (){
        return Integer.parseInt(JOptionPane.showInputDialog
                    ("Introduce el npumero de alumnos a registrar: "));

    }
    public static String menu (){
        return "===== MENU PRINCIPAL =====\n" +
                    "1)LLenar Arreglo \n" +
                    "2)Imprimir Arreglo \n" +
                    "3)Salir \n" +
                    "Elegir opción";

    }

    public static void operaciones ( Alumno [] alumnos){

        String opcion = "";
        boolean sentinel = true;

        do {
            opcion = JOptionPane.showInputDialog(menu());

            switch (opcion) {
                case "1":
                    //Llenar arreglo
                    break;
                case "2":
                    //Imprimir arreglo
                    break;
                case "3":
                    //Salir
                    JOptionPane.showMessageDialog(null, "bye");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog
                            (null, "Opción no valida");

            }// Cierra el switch
        }while (sentinel);


    }
    public static void llenarArrgelo (Alumno [] alumnos){
        int i = 0;
        boolean activo = true;
        while   (i<alumnos.length){
            Alumno alumno = new Alumno();
            alumno.setNombre(JOptionPane.showInputDialog
                        ("Introduce el nombre del Alumno [ " + i + "]"));
            alumno.setEdad(Integer.parseInt(JOptionPane.showInputDialog
                    ("Introduce la edad del Alumno [ " + i + "]")));
            alumno.setSexo(JOptionPane.showInputDialog
                    ("Introduce el sexo del Alumno [ " + i + "] ").charAt(0));
            activo = JOptionPane.showInputDialog("Introduce el status del Alumno [ " + i + "] Activo/Inactivo")
                    .equalsIgnoreCase("Activo")?true:false;

            alumno.setActivo(activo);
            alumno.setPromedio(Double.parseDouble
                    (JOptionPane.showInputDialog("Introduce el promedio del Alumno [ " + i + "]")));

            alumnos[i]= alumno;
            i++;
        }

    }
}
