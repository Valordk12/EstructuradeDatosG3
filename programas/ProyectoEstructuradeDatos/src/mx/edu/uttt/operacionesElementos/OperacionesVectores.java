package mx.edu.uttt.operacionesElementos;

import javax.swing.*;
import java.util.Random;


public class OperacionesVectores {
    private double[] vectorC;

    public OperacionesVectores() {

    }

    public int obtenerTamanio() {
        int tamanio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingresa el tamaño para los vectores: "));
        vectorC = new double[tamanio];
        return tamanio;
    }

    public String llenarVectorA(double[] vectorA) {
        Random random = new Random();
        String salida = "Vector A:\n";
        if (vectorC.length <= 5) {
            for (int i = 0; i < vectorC.length; i++) {
                vectorA[i] = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingresa el valor del vector A [" + i + "]: "));
                salida += "[" + vectorA[i] + "] ";
            }
        } else {
            for (int i = 0; i < vectorC.length; i++) {
                vectorA[i] = random.nextInt(10) + 1;
                salida += "[" + vectorA[i] + "] ";
            }
        }
        return salida + "\n\n";
    }

    public String llenarVectorB(double[] vectorB) {
        Random random = new Random();
        String salida = "Vector B:\n";
        if (vectorC.length <= 5) {
            for (int i = 0; i < vectorC.length; i++) {
                vectorB[i] = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingresa el valor B[" + i + "]: "));
                salida += "[" + vectorB[i] + "] ";
            }
        } else {
            for (int i = 0; i < vectorC.length; i++) {
                vectorB[i] = random.nextInt(10) + 1;
                salida += "[" + vectorB[i] + "] ";
            }
        }
        return salida + "\n\n";
    }

    public String suma(double[] vectorA, double[] vectorB) {
        String salida = "Suma (C):\n";
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            salida += vectorC[i] + "  ";
        }
        return salida + "\n\n";
    }

    public String restar(double[] vectorA, double[] vectorB) {
        String salida = "Resta (C):\n";
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] - vectorB[i];
            salida += vectorC[i] + "  ";
        }
        return salida + "\n\n";
    }

    public String multiplicar(double[] vectorA, double[] vectorB) {
        String salida = "Multiplicación (C):\n";
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = vectorA[i] * vectorB[i];
            salida += vectorC[i] + "  ";
        }
        return salida + "\n\n";
    }

    public String dividir(double[] vectorA, double[] vectorB) {
        String salida = "División (C):\n";
        for (int i = 0; i < vectorC.length; i++) {
            if (vectorB[i] != 0) {
                vectorC[i] = vectorA[i] / vectorB[i];
            } else {
                vectorC[i] = 0;
            }
            salida += vectorC[i] + "  ";
        }
        return salida + "\n\n";
    }

    public String potencia(double[] vectorA, double[] vectorB) {
        String salida = "Potencia (C):\n";
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i] = Math.pow(vectorA[i], vectorB[i]);
            salida += vectorC[i] + "  ";
        }
        return salida + "\n\n";
    }

    public void imprimir(double[] vectorA, double[] vectorB) {
        String salida = "";
        salida += llenarVectorA(vectorA);
        salida += llenarVectorB(vectorB);
        salida += suma(vectorA, vectorB);
        salida += restar(vectorA, vectorB);
        salida += multiplicar(vectorA, vectorB);
        salida += dividir(vectorA, vectorB);
        salida += potencia(vectorA, vectorB);

        JOptionPane.showMessageDialog(null, salida);
    }




}
