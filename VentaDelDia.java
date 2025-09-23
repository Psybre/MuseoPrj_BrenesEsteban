import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa las ventas de boletos realizadas en un día específico.
 * 
 * @author Esteban Brenes Montoya
 * @version 1.0
 */
public class VentaDelDia {
    /** Fecha en que se realizaron las ventas. */
    private String fechaDeLaVenta;
    
    /** Lista de boletos vendidos en el día. */
    private List<BoletoMuseo> boletosVendidos;

    /**
     * Constructor de VentaDelDia que inicializa la fecha y la lista de boletos.
     */
    public VentaDelDia() {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }

    /**
     * Registra un boleto vendido en el día.
     * 
     * @param boleto El boleto a registrar.
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }

    /**
     * Calcula el total de ventas del día sumando los precios de todos los boletos vendidos.
     * 
     * @return El total de ventas del día.
     */
    public double calcularTotalVentaDelDia() {
        double total = 0.0;
        for (BoletoMuseo boleto : boletosVendidos) {
            total += boleto.getPrecio();
        }
        return total;
    }

    /**
     * Establece la fecha de la venta en formato YYYY-MM-DD.
     * 
     * @return La fecha actual formateada.
     */
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(formatter);
    }

    /**
     * Representación en String del objeto VentaDelDia.
     * 
     * @return String con el detalle completo de las ventas del día.
     */
    public String toString() {
        String msg = "VentaDelDia\n";
        msg += "  Fecha: " + fechaDeLaVenta + "\n";
        msg += "  Cantidad de boletos: " + boletosVendidos.size() + "\n";
        msg += "  Detalle:\n";
        for (BoletoMuseo boleto : boletosVendidos) {
            msg += "    - Boleto #" + boleto.getNumeroBoleto() + " | " + boleto.getPrecio() + "\n";
        }
        msg += "  Total: " + calcularTotalVentaDelDia();
        return msg;
    }
} 