package pruebafiguras;

/**
 * @author Isabel Higuita Giraldo
 */

public class Rectangulo {

    // Atributos

    public double base; // Base de un rectángulo
    public double altura; // Altura de un rectángulo

    // Métodos

    /**
     * Constructor de la clase Rectangulo
     * 
     * @param base   | Parámetro que define la base de un rectángulo
     * @param altura | Parámetro que define la altura de un rectángulo
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula y devuelve el área de un rectángulo como la
     * multiplicación de la base por la altura
     * 
     * @return double | Área de un rectángulo
     */
    public double calcularArea() {
        return this.base * this.altura;
    }

    /**
     * Método que calcula y devuelve el perímetro de un rectángulo como
     * (2 * base) + (2 * altura)
     * 
     * @return double | Perímetro de un rectángulo
     */
    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
    
}
