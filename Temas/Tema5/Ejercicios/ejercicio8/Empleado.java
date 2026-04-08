package Ejercicios.ejercicio8;

// clase empleado
class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSalario() {
        return 0.0;
    }

    // PMétodo para subir salario común (definiendo el contrato)
    public void aumentarSalario(double porcentaje) {

    }

    // Uso de toString para mostrar la información
    @Override
    public String toString() {
        return String.format("Nombre: %s - Salario: %.2f", nombre, calcularSalario());
    }
}

// clase hija de empleado
class EmpleadoFijo extends Empleado {
    private double salarioMensual;

    public EmpleadoFijo(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }
    @Override
    public double calcularSalario() {
        return salarioMensual;
    }

    // implementar la subida
    @Override
    public void aumentarSalario(double porcentaje) {
        this.salarioMensual += this.salarioMensual * (porcentaje / 100);
    }
}

// clase hija del empleado por horas
class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double precioHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double precioHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * precioHora;
    }

    // implementar la subida por horas
    @Override
    public void aumentarSalario(double porcentaje) {
        this.precioHora += this.precioHora * (porcentaje / 100);
    }
}

// Empleado a comision
class EmpleadoComision extends Empleado {
    private double ventasTotales;
    private double porcentajeComision;

    public EmpleadoComision(String nombre, double ventasTotales, double porcentajeComision) {
        super(nombre);
        this.ventasTotales = ventasTotales;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return ventasTotales * porcentajeComision;
    }

    // subir el porcentaje de la comision
    @Override
    public void aumentarSalario(double porcentaje) {
        this.porcentajeComision += this.porcentajeComision * (porcentaje / 100);
    }
}