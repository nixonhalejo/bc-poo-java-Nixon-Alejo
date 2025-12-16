package co.edu.sena.Nixon.semana1;

public class RefrigeratedShipment extends CargoShipment {

    public RefrigeratedShipment(String shipmentCode, String origin, String destination,
                                double weightKg, int distanceKm) {

        super(shipmentCode, origin, destination, weightKg, distanceKm, true);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tipo: Envío refrigerado");
        System.out.println("Costo estimado (con refrigeración): $" + calculateEstimatedCost());
    }
}
