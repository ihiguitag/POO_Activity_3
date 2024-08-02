/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_18;

/**
 * @author Isabel Higuita Giraldo
 */

public class Employee {
    
    // Atributos
    
    private final int code;
    private final String name;
    private final double hourPrice;
    
    // Métodos
    
    /*
    * Constructor de la clase Empleado
    *
    * @param code   | El código del empleado
    * @param name   | Los nombres del empleado
    * @param price  | Las horas trabajadas por el empleado
    */
    public Employee(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.hourPrice = price;
    }
    
    /**
     * Devuelve el código del empleado
     * 
     * @return Integer   | El código del empleado
     */
    public Integer getCode() {
        return this.code;
    }
    
    /**
     * Devuelve el nombre del empleado
     * 
     * @return String   | El nombre del empleado
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Devuelve el valor por hora del empleado
     * 
     * @return double   | El valor por hora del empleado
     */
    public double getHourPrice() {
        return this.hourPrice;
    }
    
}
