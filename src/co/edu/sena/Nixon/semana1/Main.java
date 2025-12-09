package co.edu.sena.Nixon.semana1;

// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DOMINIO: LogiCarga ===\n");

        // Crear clientes (Clase secundaria) - mínimo 2 objetos
        Cliente cliente1 = new Cliente("CL001", "Transportes S.A.", "900123456", "3101234567", "Bogotá, Fontibón");
        Cliente cliente2 = new Cliente("CL002", "Alimentos Fríos Ltda.", "900654321", "3107654321", "Medellín, Centro");

        // Mostrar info de clientes
        System.out.println("--- CLIENTES ---");
        cliente1.showInfo();
        System.out.println();
        cliente2.showInfo();
        System.out.println();

        // Crear envíos (Clase principal) - mínimo 2 objetos (aquí creamos 3 para robustez)
        CargoShipment envio1 = new CargoShipment("CARGO-001", "Bogotá", "Medellín", 1500.0, 420, false);
        CargoShipment envio2 = new CargoShipment("CARGO-002", "Bogotá", "Cali", 800.0, 450, true);
        CargoShipment envio3 = new CargoShipment("CARGO-003", "Bogotá", "Cartagena", 1200.0, 1000, false);

        // Mostrar información y cálculos
        System.out.println("--- ENVÍOS ---");
        envio1.printInfo();
        System.out.println("Costo estimado: $" + envio1.calculateEstimatedCost());
        System.out.println();

        envio2.printInfo();
        System.out.println("Costo estimado: $" + envio2.calculateEstimatedCost());
        System.out.println();

        envio3.printInfo();
        System.out.println("Costo estimado: $" + envio3.calculateEstimatedCost());
        System.out.println();

        // Usar getters/setters y otros métodos para demostrar funcionalidad
        System.out.println("--- OPERACIONES SOBRE ENVÍOS ---");

        System.out.println("Resumen envío1: " + envio1.getSummary());
        envio1.setDelivered(true); // marca como entregado
        System.out.println("Después de marcar entregado:");
        envio1.printInfo();
        System.out.println();

        System.out.println("Cambio de destino en envio3...");
        envio3.changeDestination("Barranquilla");
        envio3.printInfo();
        System.out.println();

        // Cliente realiza pago
        System.out.println("--- PAGOS ---");
        boolean pago1 = cliente1.makePayment(envio1.calculateEstimatedCost(), "Transferencia");
        boolean pago2 = cliente2.makePayment(envio2.calculateEstimatedCost(), "Tarjeta");

        // Contactar cliente
        cliente1.contact("Su envío " + envio1.getShipmentCode() + " ha sido despachado.");
        cliente2.contact("Su envío " + envio2.getShipmentCode() + " está en tránsito.");

        System.out.println("\n=== FIN DEMOSTRACIÓN ===");
    }
}