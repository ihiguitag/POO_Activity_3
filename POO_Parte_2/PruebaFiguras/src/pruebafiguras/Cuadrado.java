package pruebafiguras;

/**
 * @author Isabel Higuita Giraldo
 */

public class Cuadrado {

    // Atributos

    public double lado; // El lado de un cuadrado

    // Métodos

    /**
     * Constructor de la clase Cuadrado
     * 
     * @param lado | Longitud de la base de un cuadrado
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    /**
     * Método que calcula y devuelve el área de un cuadrado como el
     * lado elevado al cuadrado
     * 
     * @return double | Área de un Cuadrado
     */
    public double calcularArea() {
        return this.lado * this.lado;
    }

    /**
     * Método que calcula y devuelve el perímetro de un cuadrado como
     * cuatro veces su lado
     * 
     * @return double | Perímetro de un cuadrado
     */
    public double calcularPerimetro() {
        return (4 * lado);
    }
    
}
