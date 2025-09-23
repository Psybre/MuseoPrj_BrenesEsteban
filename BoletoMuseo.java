import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa un boleto de museo con información de precio, número y fecha de emisión.
 * 
 * @author Esteban Brenes Montoya
 * @version 1.0
 */
public class BoletoMuseo {
    /** Precio del boleto del museo. */
    private double precio;
    
    /** Número único identificador del boleto. */
    private int numeroBoleto;
    
    /** Fecha de emisión del boleto en formato YYYY-MM-DD. */
    private String fechaEmision;
    
    /** Contador estático de boletos creados. */
    private static int contador = 0;

    /**
     * Constructor de la clase BoletoMuseo.
     * 
     * @param precio El precio del boleto.
     */
    public BoletoMuseo(double precio) {
        this.precio = precio;
        contador++;
        this.numeroBoleto = contador;
        this.fechaEmision = establecerFechaEmisionBoleto();
    }

    /**
     * Establece la fecha de emisión del boleto en formato YYYY-MM-DD.
     * 
     * @return La fecha actual formateada.
     */
    private String establecerFechaEmisionBoleto() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(formatter);
    }

    /**
     * Obtiene el contador global de boletos creados.
     * 
     * @return El número total de boletos creados.
     */
    public static int getContador() {
        return contador;
    }

    /**
     * Obtiene el número único del boleto.
     * 
     * @return El número del boleto.
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    /**
     * Obtiene el precio del boleto.
     * 
     * @return El precio del boleto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Representación en String del objeto BoletoMuseo.
     * 
     * @return String con los detalles del boleto.
     */
    public String toString() {
        String msg = "BoletoMuseo\n";
        msg += "  Numero: " + numeroBoleto + "\n";
        msg += "  Precio: " + precio + "\n";
        msg += "  Fecha Emision: " + fechaEmision;
        return msg;
    }
}