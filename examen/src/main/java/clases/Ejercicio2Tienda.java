package clases;

import java.util.Scanner;

public class Ejercicio2Tienda {
    private int cantidad;
    private final double IVA=0.19;

    public Ejercicio2Tienda() {
    }

    public Ejercicio2Tienda(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getIVA() {
        return IVA;
    }

    public double calcularProducto(){
        Ejercicio2Producto ejercicio2Producto=new Ejercicio2Producto();
        Scanner lea =new Scanner(System.in);
        System.out.println("Ingrese el nombre del Producto: ");
        ejercicio2Producto.setNombre(lea.next());
        System.out.println("Ingrese la Marca del Producto: ");
        ejercicio2Producto.setMarca(lea.next());
        System.out.println("Ingrese el Precio del Producto: ");
        ejercicio2Producto.setPrecio(lea.nextInt());
        System.out.println("Ingrese la cantidad del Producto: ");
        int cantidad = lea.nextInt();
        this.cantidad=cantidad;
        double valorInicial=ejercicio2Producto.getPrecio()*this.cantidad;
        double valorIVA= valorInicial*this.IVA;
        double valorNeto=valorInicial+valorIVA;
        return valorNeto;

    }
}
