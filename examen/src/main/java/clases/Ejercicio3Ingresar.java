package clases;

import java.util.Scanner;

public class Ejercicio3Ingresar {

    private String nombre;
    private int codigo;
    private int numeroPaginas;
    private int cantidadLibros;
    private  String autor;

    public Ejercicio3Ingresar() {
    }

    public Ejercicio3Ingresar(String nombre, int codigo, int numeroPaginas, int cantidadLibros, String autor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numeroPaginas = numeroPaginas;
        this.cantidadLibros = cantidadLibros;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void ingresarLibro(){

        Scanner lea = new Scanner(System.in);

        System.out.println("digite el nombre del libro");
        setNombre(lea.next());
        System.out.println("Digite el codigo del libro");
        setCodigo(lea.nextInt());
        System.out.println("Digite el numero de paginas");
        setNumeroPaginas(lea.nextInt());
        System.out.println("Digite el numero de ejemplares");
        setCantidadLibros(lea.nextInt());
        System.out.println("Digite el autor ");
        setAutor(lea.next());

    }
}
