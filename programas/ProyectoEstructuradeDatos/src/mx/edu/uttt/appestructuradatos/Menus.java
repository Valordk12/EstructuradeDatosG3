package mx.edu.uttt.appestructuradatos;

public class Menus {

    public static String obtenerMenusPrincipal(){
        String menu = "===== MENU PRINCIPAL =====" +
                      "\n1)Arreglos" +
                      "\n2)Recursividad" +
                      "\n3)Listas Enlazadas" +
                      "\n4)Pilas y Colas" +
                      "\n5)Árboles Binarios" +
                      "\n6)Salir" +
                      "\nElegir opción: ";

        return menu;
    }

    public static  String obtenerMenuArreglos(){
        return "===== MENU ARREGLOS =====" +
                "\n1)Vectores\n" +
                "2)Matrices\n" +
                "3)Regresar\n" +
                "Elegir Opción: ";

    }

}

