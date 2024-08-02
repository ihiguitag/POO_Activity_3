/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poo_ejercicio_22;

/**
 * @author Isabel Higuita Giraldo
 */

public class Empleado {
    
    // Atributos

    private final String nombre;
    private final double salarioBasico;
    private final double horasTrabajadas;
    private final double salario;

    // Métodos

    /**
     * Constructor de la clase Empleado
     * 
     * @param nombre          | El nombre del empleado
     * @param salarioBasico   | El salario básico por hora
     * @param horasTrabajadas | El número de horas trabajadas en el mes
     */
    public Empleado(String nombre, double salarioBasico, double horasTrabajadas) {
        this.nombre = nombre;
        this.salarioBasico = salarioBasico;
        this.horasTrabajadas = horasTrabajadas;

        // Crear un objeto de tipo Salario
        Salario salary = new Salario(this.salarioBasico, this.horasTrabajadas);

        // Calcular el salario mensual
        this.salario = salary.calcularSalarioMensual();
    }

    /**
     * Método para comparar el salario
     * 
     * @param value    | El valor de comparación
     * @return boolean  | Si el salario es mayor o menor a 450.000
     */
    public boolean comparateSalary(double value) {
        return this.salario > value;
    }
    
    /**
     * Método para obtener el nombre del empleado
     * 
     * @return String   | El nombre del empleado
     */
    public String getName() {
        return this.nombre;
    }
    
    /**
     * Método para obtener el valor del salario
     * 
     * @return double  | El valor del salario
     */
    public double getSalary() {
        return this.salario;
    }
}
