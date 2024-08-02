/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_18;

/**
 * @author Isabel Higuita Giraldo
 */

public class Salary {
    
    // Atributos
    
    private final Employee employee;
    private final int hoursWorked;
    private final double reteFuente;
    private double salaryBruto;
    private double salaryNeto;
    
    // Métodos
    
    /**
     * Constructor de la clase Salario
     * 
     * @param employee  | El empleado al que se le calculará el salario
     * @param hours     | Las horas trabajadas
     * @param percent   | El porcentaje de retención
     */
    public Salary(Employee employee, int hours, double percent) {
        this.employee = employee;
        this.hoursWorked = hours;
        this.reteFuente = percent;
    }
    
    /**
     * Calcula el salario bruto del empleado
     */
    public void calculateSalaryBruto() {
        double hourPrice = this.employee.getHourPrice();
        this.salaryBruto = this.hoursWorked * hourPrice;
    }
    
    /**
     * Calcula el salario neto del empleado
     */
    public void calculateSalaryNeto() {
        if (this.salaryBruto == 0) {
            this.calculateSalaryBruto();
        }
        double percent = this.reteFuente / 100;
        double discountReteFuente = this.salaryBruto * percent;
        this.salaryNeto = this.salaryBruto - discountReteFuente;
    }
    
    /**
     * Devuelve el salario bruto del empleado
     * 
     * @return double   | El salario bruto del empleado
     */
    public double getSalaryBruto() {
        if (this.salaryBruto == 0) {
            this.calculateSalaryBruto();
        }
        return this.salaryBruto;
    }
      
    /**
     * Devuelve el salario neto del empleado
     * 
     * @return double   | El salario neto del empleado
     */
    public double getSalaryNeto() {
        if (this.salaryNeto == 0) {
            this.calculateSalaryNeto();
        }
        return this.salaryNeto;
    }
    
    /**
     * Devuelve la cantidad de horas trabajadas por el empleado
     * 
     * @return Integer  | La cantidad de horas trabajadas
     */
    public Integer getHoursWorked() {
        return this.hoursWorked;
    }
    
    /**
     * Devuelve el porcentaje de retención en la fuente
     * 
     * @return double   | El porcentaje de retefuente
     */
    public double getReteFuente() {
        return this.reteFuente;
    }
}
