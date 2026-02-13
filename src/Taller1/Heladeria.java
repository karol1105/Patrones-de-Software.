package Taller1;

public class Heladeria {

    public static void main(String[] args) {

        CajaHeladeria caja1 = CajaHeladeria.obtenerInstancia();
        CajaHeladeria caja2 = CajaHeladeria.obtenerInstancia();

        caja1.registrarVenta(5000);
        caja2.registrarVenta(8000);

        caja1.mostrarTotalVentas();
        if (caja1 == caja2) {
            System.out.println("Ambas variables apuntan a la misma caja (Singleton funcionando)");
        }
    }
}