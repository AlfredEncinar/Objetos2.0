package Ejercicio9U4;

public class Libro {


    private String titulo;


    public Libro(String titulo) {

        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    @Override
    public String toString() {
        String salida = "Titulo : " + this.titulo;
        return salida;
    }


}
