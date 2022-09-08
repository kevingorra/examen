package clases;

public class Ejercicio1Empleado {

    private String identificacion;
    private String nombre;
    private int salario;
    private int numeroVentas;
    private int valorComision;
    private double deducciones;

    public Ejercicio1Empleado() {
    }

    public Ejercicio1Empleado(String identificacion, String nombre, int salario, int numeroVentas, int valorComision, double deducciones) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.salario = salario;
        this.numeroVentas = numeroVentas;
        this.valorComision = valorComision;
        this.deducciones = deducciones;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public int getValorComision() {
        return valorComision;
    }

    public void setValorComision(int valorComision) {
        this.valorComision = valorComision;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones/100;
    }

    public double calcularSalario(){
        int salarioVentas=this.numeroVentas*this.valorComision;
        int salarioTotal=salarioVentas+this.salario;
        double salarioDeducido=salarioTotal*this.deducciones;
        double salarioNeto=salarioTotal-salarioDeducido;
        return salarioNeto;
    }
}
