package mx.edu.uttt.arreglos;

import javax.swing.*;

public class OperacionesArreglos {
    private double[] vector;
    private final int TAMANIO = 5;

    public OperacionesArreglos() {
        this.vector = new double[TAMANIO];

    }

    public OperacionesArreglos(int tamanio) {
        this.vector = new double[tamanio];

    }

    public OperacionesArreglos(double[] vector) {
        this.vector = new double[vector.length];
        this.llenarArreglo(vector);
    }

    public void llenarArreglo(double[] vector) {
        int i = 0;
        while (i < this.vector.length) {
            this.vector[i] = vector[i];
            i++;
        }

    }

    public void llenarArreglo() {
        //or (int i = 0; i < vector.length; i++) {
        //vector[i]= Double.parseDouble(JOptionPane.showInputDialog
        //      ("Introduce el valor de la posición [" + i + "] "));
        //}
        int i = 0;
        do {
            this.vector[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor decimal: "));
            i++;
        } while (i < this.vector.length);
    }

    public double sumarValores() {
        double suma = 0.0;

        for (int i = 0; i < this.vector.length; i++) {
            suma += this.vector[i];
        }
        //for (double v : this.vector) {
        //suma+=v;
        //}
        //JOptionPane.showMessageDialog(null,"la suma de los valores es: " + suma);
        return suma;

    }

    public double obtenerValorMaximo() {
        double maximo = 0.0;
        //for (double v  : this.vector ){
        //if (v>maximo){
        //  maximo=v;
        int i = 0;
        while (i < this.vector.length) {
            if (maximo < this.vector[i])
                maximo = this.vector[i];
            i++;
        }

        //}
        return maximo;

    }

    public double obtenerValorMinimo() {
        double minimo = this.vector[0];
        for (double v : this.vector) {
            if (v < minimo) {
                minimo = v;
            }
        }
        return minimo;
    }

    public boolean compararArreglos(double[] vector) {
        boolean isEquals = true;

        if (vector.length != this.vector.length) {
            isEquals = false;
        } else {
            for (int i = 0; i < this.vector.length && isEquals; i++) {
                if (this.vector[i] != vector[i]) {
                    isEquals = false;
                }
            }

        }
        return isEquals;
    }

    public void cambiarTamanio(int tamanio) {
    /*double [] cambiar = new double [tamanio];
        for (int i =0; i < this.vector.length && i<tamanio ; i++) {
        cambiar[i] = this.vector[i];
        }
        this.vector = cambiar;
    }*/
        double temp[] = new double[tamanio];

        for (int i = 0; i < this.vector.length; i++) {
            temp[i] = this.vector[i];
        }
        this.vector = temp;
        temp = null;
    }

    public String buscarValor(double valor) {
        /*String posicion = "";
        for (int i = 0; i < vector.length ; i++) {
            if (vector [i] == valor){
             posicion += i + " ";

            }
        }

        if (posicion.equals(" ")){
            JOptionPane.showMessageDialog(null, "El valor " + valor + " no se encontro");
            return "No encontrado";
        }else {
            JOptionPane.showMessageDialog(null, "El valor " + valor + " se encontro en la posición: " + posicion);
            return posicion;
        }
    }*/
        String salida = "";
        boolean sentinel = false;
        for (int i = 0; i < this.vector.length; i++) {
            if (valor == this.vector[i]) {
                sentinel = true;
                salida = "El valor: " + valor + " esta en la posicion " + i;
                break;
            }
        }
        if (!sentinel)
            salida = "El valor no se encontro en el arreglo";
        return salida;
    }


    public void imprimir (){
        String salida1 = "";
        for (double valor : vector){
            salida1 += "| " + valor + " |";
        }
        JOptionPane.showMessageDialog(null, salida1);

        String salida2 = "";
        for (int i = 0; i < vector.length ; i++) {
            salida2 += "| " + vector[i] + " |";
        }
        JOptionPane.showMessageDialog(null, salida2);

        String salida3 = "";
        int i = 0;
        while   (i<vector.length){
            salida3 += "| " + vector[i] + " |";
            i++;
        }

        JOptionPane.showMessageDialog(null,salida3);
    }

}
