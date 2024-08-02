/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package poo_ejercicio_10;

/**
 * @author Isabel Higuita Giraldo
 */

public class Estudiante {
    
    // Atributos

    private final int numeroInscripcion;
    private final String nombres;
    private final double patrimonio;
    private final int estratoSocial;

    // Métodos

    /**
     * Constructor de la clase Estudiante
     * 
     * @param numeroInscripcion | Número de inscripción del estudiante
     * @param nombres           | Nombres del estudiante
     * @param patrimonio        | Patrimonio del estudiante
     * @param estratoSocial     | Estrato social del estudiante
     */
    public Estudiante(int numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    /**
     * Método para obtener el número de inscripción del estudiante
     * 
     * @return int  | Número de inscripción
     */
    public int getNumIns() {
        return this.numeroInscripcion;
    }
    
    /**
     * Método para obtener el nombre del estudiante
     * 
     * @return String   | Nombre completo
     */
    public String getName() {
        return this.nombres;
    }
    
    /**
     * Método para obtener el valor de patrimonio del estudiante
     * 
     * @return double   | Valor de patrimonio
     */
    public double getPatrimonio() {
        return this.patrimonio;
    }
    
    /**
     * Método para obtener el estrato social del estudiante
     * 
     * @return int  | Estrato social
     */
    public int getEstrato() {
        return this.estratoSocial;
    }
    
}
