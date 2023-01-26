package Ejercicio9U4;

//Desarrollar una lista de libros ordenada por título.
// La funcionalidad de la lista será la habitual:
// conocer el número de libros que hay en la lista,
// insertar un nuevo libro (en la posición que corresponda),
// eliminar el libro de una determinada posición
// y obtener el libro de una determinada posición.
// También incluirá un método para buscar un libro a partir de
// una parte de su título (sin distinguir entre mayúsculas y minúsculas);
// el método devolverá la posición en la que se
// encuentra el libro (-1 si no lo encuentra).

import java.util.ArrayList;

public class ListtaLibros {
    public static void main(String[] args) {

        ArrayList<Libro>libros = new ArrayList<>();

        libros.add(new Libro("Piratas del caribe"));
        System.out.println(libros);



    }
}