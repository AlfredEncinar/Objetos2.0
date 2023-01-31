package Ejercicio10U4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLibros {

    public static void main(String[] args) {

        ArrayList<Libro>libros = new ArrayList<>();

        libros = insertar(new Libro("jose"));
        insertar(new Libro("pepe"));
        insertar(new Libro("cars"));

        int cantidad = contadorLibros(libros);
        System.out.println(cantidad);



    }

    public static int contadorLibros(ArrayList<Libro>libros){

        return libros.size();
    }

    public static ArrayList  insertar(Libro li){

        Scanner sc = new Scanner(System.in);



        return  insertar(new Libro(sc.next()));

    }
}
