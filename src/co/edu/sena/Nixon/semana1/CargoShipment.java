package co.edu.sena.Nixon.semana1;

// CargoShipment.java
public class CargoShipment {

    // Atributos encapsulados
    private String shipmentCode;
    private String origin;
    private String destination;
    private double weightKg;
    private int distanceKm;
    private boolean refrigerated;
    private boolean delivered;

    // Constructor completo (usa setters con validación)
    public CargoShipment(String shipmentCode, String origin, String destination,
                         double weightKg, int distanceKm, boolean refrigerated) {

        setShipmentCode(shipmentCode);
        setOrigin(origin);
        setDestination(destination);
        setWeightKg(weightKg);
        setDistanceKm(distanceKm);
        setRefrigerated(refrigerated);
        this.delivered = false; // estado inicial
    }

    // Constructor parcial (sobrecarga)
    public CargoShipment(String shipmentCode, String origin, String destination) {
        this(shipmentCode, origin, destination, 1.0, 1, false);
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
    public double calculateEstimatedCost() {
        double base = 50000;
        double tarifaPorKg = 1200;
        double tarifaPorKm = 150;

        double costo = base + (weightKg * tarifaPorKg) + (distanceKm * tarifaPorKm);

        if (refrigerated) {
            costo *= 1.25; // recargo 25%
        }
        return costo;
    }

    // Getters
    public String getShipmentCode() {
        return shipmentCode;
    }

    public boolean isDelivered() {
        return delivered;
    }

    // Setters con validación
    public void setShipmentCode(String shipmentCode) {
        if (shipmentCode != null && !shipmentCode.trim().isEmpty()) {
            this.shipmentCode = shipmentCode;
        } else {
            throw new IllegalArgumentException("Código de envío inválido");
        }
    }

    public void setOrigin(String origin) {
        if (origin != null && !origin.trim().isEmpty()) {
            this.origin = origin;
        } else {
            throw new IllegalArgumentException("Origen inválido");
        }
    }

    public void setDestination(String destination) {
        if (destination != null && !destination.trim().isEmpty()) {
            this.destination = destination;
        } else {
            throw new IllegalArgumentException("Destino inválido");
        }
    }

    public void setWeightKg(double weightKg) {
        if (weightKg > 0) {
            this.weightKg = weightKg;
        } else {
            throw new IllegalArgumentException("El peso debe ser mayor a cero");
        }
    }

    public void setDistanceKm(int distanceKm) {
        if (distanceKm > 0) {
            this.distanceKm = distanceKm;
        } else {
            throw new IllegalArgumentException("La distancia debe ser mayor a cero");
        }
    }

    public void setRefrigerated(boolean refrigerated) {
        this.refrigerated = refrigerated;
    }

    // Método setter específico para cambiar estado
    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    // Método adicional: cambiar destino
    public void changeDestination(String newDestination) {
        setDestination(newDestination);
    }

    // Método adicional: obtener resumen corto
    public String getSummary() {
        return shipmentCode + ": " + origin + " -> " + destination + " | " + weightKg + "kg";
    }
}
