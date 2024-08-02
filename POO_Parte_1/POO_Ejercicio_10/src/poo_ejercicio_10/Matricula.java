/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poo_ejercicio_10;

/**
 * @author Isabel Higuita Giraldo
 */

public class Matricula {
    
    // Atributos

    private final Estudiante estudiante;
    private double valueMatricula;
    public int valueBase;

    // Métodos

    /**
     * Constructor de la clase Matricula
     * 
     * @param estudiante | Objeto de tipo Estudiante
     */
    public Matricula(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.valueBase = 50000;
    }

    /**
     * Método para calcular el pago de la matrícula
     */
    public void calcularPagoMatricula() {

        double pagoMatricula = this.valueBase;
        int estrato = this.estudiante.getEstrato();
        double patrimonio = this.estudiante.getPatrimonio();
        
        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += patrimonio * 0.03;
        }

        this.valueMatricula = pagoMatricula;
    }
    
    /**
     * Método para obtener el valor de la matrícula del estudiante
     * 
     * @return double   | Valor de matrícula
     */
    public double getMatricula() {
        return this.valueMatricula;
    }
}
