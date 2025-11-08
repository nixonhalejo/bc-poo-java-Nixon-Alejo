package co.edu.sena.Nixon.semana1;

// Cliente.java
public class Cliente {
    // Atributos (mín. 4)
    private String clientId;
    private String name;
    private String nitOrId;
    private String phone;
    private String address;

    // Constructor
    public Cliente(String clientId, String name, String nitOrId, String phone, String address) {
        this.clientId = clientId;
        this.name = name;
        this.nitOrId = nitOrId;
        this.phone = phone;
        this.address = address;
    }

    // Método void que muestra datos del cliente
    public void showInfo() {
        System.out.println("Cliente: " + name + " (ID: " + clientId + ")");
        System.out.println("NIT/Cédula: " + nitOrId);
        System.out.println("Tel: " + phone + " | Dirección: " + address);
    }

    // Método que simula pago y retorna boolean si fue exitoso
    public boolean makePayment(double amount, String paymentMethod) {
        // Lógica simplificada: si amount > 0, pago OK
        System.out.println("Procesando pago de " + amount + " por " + name + " vía " + paymentMethod + "...");
        boolean success = amount > 0;
        System.out.println("Pago " + (success ? "OK" : "FALLIDO"));
        return success;
    }

    // Método para contactar (retorna un String con mensaje de confirmación)
    public String contact(String message) {
        // En sistema real habría envío de email/llamada; aquí devolvemos confirmación
        String confirmation = "Mensaje enviado a " + name + ": \"" + message + "\"";
        System.out.println(confirmation);
        return confirmation;
    }

    // Getters (ejemplo)
    public String getClientId() {
        return clientId;
    }
}
