package org.example;

import clases.Ejercicio1Empleado;
import clases.Ejercicio2Tienda;
import clases.Ejercicio3Ingresar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejercicio1Empleado ejercicio1 = new Ejercicio1Empleado();
        //Scanner lea=new Scanner(System.in);

        //System.out.println("Digite su Nombre: ");
        //ejercicio1.setNombre(lea.next());
        //System.out.println("Digite su identificacion: ");
        //ejercicio1.setIdentificacion(lea.next());
        //System.out.println("Digite el numero de Ventas Realizadas: ");
        //ejercicio1.setNumeroVentas(lea.nextInt());
        //System.out.println("Digite su Salario Mensual: ");
        //ejercicio1.setSalario(lea.nextInt());
        //System.out.println("Digite el valor de la comision: ");
        //ejercicio1.setValorComision(lea.nextInt());
        //System.out.println("Digite el valor  de las Deducciones: ");
        //ejercicio1.setDeducciones(lea.nextDouble());

        //ejercicio1.calcularSalario();

      //  System.out.println(ejercicio1.calcularSalario());


       // Ejercicio2Tienda tienda=new Ejercicio2Tienda();


        //double total =tienda.calcularProducto();
        //System.out.println("el costo total del producto es "+total);

        Scanner lea=new Scanner(System.in);



        int centinela =100;

        while (centinela!=4){
            System.out.println("***MENU***");
            System.out.println("1. Ingresar un libro");
            System.out.println("2. Conusltar un libro");
            System.out.println("3. Modificar Libro ");
            System.out.println("4. Salir");
            System.out.println();
            System.out.println("Elija una opcion : ");
            centinela= lea.nextInt();

            if (centinela==1){
                System.out.println("eligio la opcion 1");

                Ejercicio3Ingresar libro =new Ejercicio3Ingresar();








            }else if(centinela==2){
                System.out.println("eligio la opcion 2");

            }else if (centinela==3) {
                System.out.println("eligio la opcion 3");

            } else if (centinela == 4) {
                System.out.println("eligio la opcion 4");

            }else{
                System.out.println("la opcion elegida no es valida ");

            }

        }



    }
}