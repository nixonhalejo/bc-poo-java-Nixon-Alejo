package co.edu.sena.Nixon.semana1;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA LOGICARGA ===\n");

        // 1. Crear cliente (encapsulación + constructores)
        Cliente cliente1 = new Cliente(
                "C001",
                "Juan Pérez",
                "123456789",
                "3001234567",
                "Calle 10 #20-30"
        );

        cliente1.showInfo();
        cliente1.makePayment(250000, "Tarjeta");
        cliente1.contact("Su envío está en proceso");

        System.out.println("\n-----------------------------\n");

        // 2. Crear vehículo
        Vehiculo vehiculo1 = new Vehiculo(
                "ABC123",
                "Camión",
                5000
        );

        System.out.println("Vehículo creado:");
        System.out.println("Placa: " + vehiculo1.getPlaca());
        System.out.println("Tipo: " + vehiculo1.getTipo());
        System.out.println("Capacidad: " + vehiculo1.getCapacidadKg() + " kg");

        System.out.println("\n-----------------------------\n");

        // 3. Crear envío asociado a vehículo
        Envio envio1 = new Envio(
                "E001",
                1200,
                "Medellín",
                vehiculo1
        );

        System.out.println("Resumen del envío:");
        System.out.println(envio1.obtenerResumen());
        System.out.println("Costo del envío: $" + envio1.calcularCosto());

        // Validar capacidad del vehículo
        boolean capacidadOk = vehiculo1.validarCapacidad(envio1.getPeso());
        System.out.println("¿Capacidad suficiente? " + (capacidadOk ? "Sí" : "No"));

        System.out.println("\n-----------------------------\n");

        // 4. Crear CargoShipment (caso más completo)
        CargoShipment cargo1 = new CargoShipment(
                "CS001",
                "Bogotá",
                "Cali",
                2000,
                460,
                true
        );

        cargo1.printInfo();
        System.out.println("Costo estimado: $" + cargo1.calculateEstimatedCost());

        // Cambiar estado y destino
        cargo1.setDelivered(true);
        cargo1.changeDestination("Palmira");

        System.out.println("\nResumen actualizado:");
        System.out.println(cargo1.getSummary());

        System.out.println("\n=== FIN DEL SISTEMA LOGICARGA ===");
    }
}
