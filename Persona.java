/**
 * Clase que representa una persona que puede adquirir un boleto de museo.
 * 
 * @author Esteban Brenes Montoya
 * @version 1.0
 */
public class Persona {
    /** Nombre completo de la persona. */
    private String nombre;
    
    /** Número de identificación de la persona. */
    private String identificacion;
    
    /** Boleto asignado a la persona. */
    private BoletoMuseo miBoleto;

    /**
     * Constructor de Persona con nombre e identificación.
     * 
     * @param nombre El nombre de la persona.
     * @param ident La identificación de la persona.
     */
    public Persona(String nombre, String ident) {
        this(nombre);
        identificacion = ident;
    }

    /**
     * Constructor de Persona solo con nombre.
     * 
     * @param nombre El nombre de la persona.
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la identificación de la persona.
     * 
     * @param pIdentificacion La identificación a establecer.
     */
    public void setIdentificacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }

    /**
     * Asigna un boleto a la persona.
     * 
     * @param pMiBoleto El boleto a asignar.
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto = pMiBoleto;
    }

    /**
     * Consulta el número del boleto asignado a la persona.
     * 
     * @return El número del boleto asignado, o -1 si no tiene boleto.
     */
    public int consultarMiNumeroDeBoleto() {
        if (miBoleto != null) {
            return miBoleto.getNumeroBoleto();
        }
        return -1;
    }

    /**
     * Representación en String del objeto Persona.
     * 
     * @return String con los detalles de la persona y su boleto.
     */
    public String toString() {
        String msg = "Persona\n";
        msg += "  Nombre: " + nombre + "\n";
        msg += "  Identificacion: " + identificacion + "\n";
        if (miBoleto != null) {
            msg += "  Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
        } else {
            msg += "  Boleto asignado: (ninguno)\n";
        }
        return msg;
    }
} 