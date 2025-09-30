package mx.edu.uttt.promedio;

import javax.swing.*;

public class calcularPromedio {
    //Declarar variables
    private double [] vector;

    //Constructor
    public calcularPromedio(){

    }

    public void obtenerTamanio(){
        int tamanio = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingresa el tamaño del arreglo: "));
        vector = new double [tamanio];
    }

    public void llenarArreglo(){
        for (int i = 0; i < vector.length ; i++) {
            vector[i] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Ingresa el valor [" + i + " ]"));
        }
    }

    public double calcularPromedio(){
        double suma = 0.0;
        for(double s: vector) {
            suma += s;
        }
        return suma / vector.length;
    }

    public String listaMenores (){
        double promedio = calcularPromedio();
        int contador = 0;
        String lista = "";
        for (double valor : vector){
            if (valor < promedio)
                lista += valor + "\n";
                contador ++;
        }
        return lista;
        }


        public String listaMayores (){
        double promedio = calcularPromedio();
        String lista = "";
        int contador = 0;
        for (double valor : vector){
            if (valor > promedio){
                lista += valor + "\n";
                contador++;
            }
        }
        return lista;
        }

    public void imprimir (){
        String salida = "Calculo de Promedio\n";
        for(double valor: vector){
            salida += "calificacion: " + " | " + valor + " | \n";
        }
        salida += "\nEl promedio de la suma de las calificaciones es de: \n" + calcularPromedio()+ "\n";
        salida += "\nLista de numeros menores al promedio: \n" + listaMenores();
        salida += "\nLista de números mayores al promedio: \n" + listaMayores();
        JOptionPane.showMessageDialog(null, salida);

    }

    }


