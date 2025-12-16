package co.edu.sena.Nixon.semana1;

public class StandardShipment extends CargoShipment {

    public StandardShipment(String shipmentCode, String origin, String destination,
                            double weightKg, int distanceKm) {

        // Llamada correcta al constructor padre
        super(shipmentCode, origin, destination, weightKg, distanceKm, false);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tipo: Envío estándar");
        System.out.println("Costo estimado: $" + calculateEstimatedCost());
    }
}
