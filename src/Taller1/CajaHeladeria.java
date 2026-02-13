package Taller1;

public class CajaHeladeria {
    private static CajaHeladeria instancia;

    private double totalVentas;

    private CajaHeladeria() {
        totalVentas = 0;
    }

    public static CajaHeladeria obtenerInstancia() {
        if (instancia == null) {
            instancia = new CajaHeladeria();
        }
        return instancia;
    }

    public void registrarVenta(double monto) {
        totalVentas += monto;
        System.out.println("Venta registrada por: $" + monto);
    }

    public void mostrarTotalVentas() {
        System.out.println("Total de ventas del día: $" + totalVentas);
    }

}


