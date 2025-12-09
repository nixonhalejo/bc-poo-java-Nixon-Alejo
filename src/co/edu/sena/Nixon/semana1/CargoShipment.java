package co.edu.sena.Nixon.semana1;

// CargoShipment.java
public class CargoShipment {
    // Atributos (mín. 5)
    private String shipmentCode;    // String
    private String origin;          // String
    private String destination;     // String
    private double weightKg;        // double
    private int distanceKm;         // int
    private boolean refrigerated;   // boolean
    private boolean delivered;      // boolean (estado)

    // Constructor que inicializa los atributos
    public CargoShipment(String shipmentCode, String origin, String destination,
                         double weightKg, int distanceKm, boolean refrigerated) {
        this.shipmentCode = shipmentCode;
        this.origin = origin;
        this.destination = destination;
        this.weightKg = weightKg;
        this.distanceKm = distanceKm;
        this.refrigerated = refrigerated;
        this.delivered = false; // por defecto al crear no está entregado
    }

    // Método void que imprime información
    public void printInfo() {
        System.out.println("=== ENVÍO " + shipmentCode + " ===");
        System.out.println("Origen: " + origin);
        System.out.println("Destino: " + destination);
        System.out.println("Peso (kg): " + weightKg);
        System.out.println("Distancia (km): " + distanceKm);
        System.out.println("Refrigerado: " + (refrigerated ? "Sí" : "No"));
        System.out.println("Entregado: " + (delivered ? "Sí" : "No"));
    }

    // Método que retorna un valor calculado: costo estimado
    // Ejemplo simple: tarifa base + (peso * tarifaPorKg) + (distancia * tarifaPorKm)
    public double calculateEstimatedCost() {
        double base = 50000; // tarifa base (ej. en COP)
        double tarifaPorKg = 1200; // por kg
        double tarifaPorKm = 150; // por km
        double costo = base + (weightKg * tarifaPorKg) + (distanceKm * tarifaPorKm);
        if (refrigerated) {
            costo *= 1.25; // recargo 25% si requiere refrigeración
        }
        return costo;
    }

    // Método getter (ejemplo)
    public String getShipmentCode() {
        return shipmentCode;
    }

    // Método setter (ejemplo: cambiar estado entregado)
    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    // Método adicional: asignar nuevo destino (ej. para reprogramación)
    public void changeDestination(String newDestination) {
        this.destination = newDestination;
    }

    // Método adicional: obtener resumen corto
    public String getSummary() {
        return shipmentCode + ": " + origin + " -> " + destination + " | " + weightKg + "kg";
    }
}

