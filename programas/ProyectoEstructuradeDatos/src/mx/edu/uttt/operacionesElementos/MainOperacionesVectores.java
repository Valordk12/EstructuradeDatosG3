package mx.edu.uttt.operacionesElementos;

public class MainOperacionesVectores {
    public static void main(String[] args) {
        OperacionesVectores op = new OperacionesVectores();
        int tamanio = op.obtenerTamanio();

        double[] vectorA = new double[tamanio];
        double[] vectorB = new double[tamanio];

        op.imprimir(vectorA, vectorB);
    }
}
