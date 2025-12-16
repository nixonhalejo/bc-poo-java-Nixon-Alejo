package co.edu.sena.Nixon.semana1;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" SISTEMA LOGICARGA - DEMOSTRACIÓN ");
        System.out.println("=================================\n");

        // Cliente
        Cliente cliente = new Cliente(
                "C001",
                "Alimentos del Norte S.A.",
                "900123456",
                "3205558899",
                "Calle 45 #12-30, Bogotá"
        );

        cliente.showInfo();
        System.out.println();

        // Vehículo
        Vehiculo vehiculo = new Vehiculo(
                "ABC-123",
                "Camión",
                1200
        );

        System.out.println("Vehículo asignado: " + vehiculo.getPlaca());
        System.out.println();

        // Polimorfismo: clase padre referencia subclases
        CargoShipment envioEstandar = new StandardShipment(
                "STD-001",
                "Bogotá",
                "Medellín",
                500,
                420
        );

        CargoShipment envioRefrigerado = new RefrigeratedShipment(
                "REF-002",
                "Cali",
                "Barranquilla",
                300,
                900
        );

        // Mostrar información de envíos
        System.out.println("=== ENVÍO ESTÁNDAR ===");
        envioEstandar.printInfo();

        System.out.println("\n=== ENVÍO REFRIGERADO ===");
        envioRefrigerado.printInfo();

        // Simular pago
        System.out.println("\n=== PROCESO DE PAGO ===");
        cliente.makePayment(envioEstandar.calculateEstimatedCost(), "Transferencia");

        // Cambio de estado
        envioEstandar.setDelivered(true);
        System.out.println("\nEstado actualizado del envío:");
        envioEstandar.printInfo();

        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
