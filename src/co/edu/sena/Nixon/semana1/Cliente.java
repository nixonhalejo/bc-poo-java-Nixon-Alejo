package co.edu.sena.Nixon.semana1;

// Cliente.java
public class Cliente {

    // Atributos (encapsulación)
    private String clientId;
    private String name;
    private String nitOrId;
    private String phone;
    private String address;

    // Constructor completo (usa setters con validación)
    public Cliente(String clientId, String name, String nitOrId, String phone, String address) {
        setClientId(clientId);
        setName(name);
        setNitOrId(nitOrId);
        setPhone(phone);
        setAddress(address);
    }

    // Constructor parcial (sobrecarga)
    public Cliente(String clientId, String name) {
        this(clientId, name, "N/A", "0000000", "Sin dirección");
    }

    // Setters con validación
    public void setClientId(String clientId) {
        if (clientId != null && !clientId.trim().isEmpty()) {
            this.clientId = clientId;
        } else {
            throw new IllegalArgumentException("ClientId inválido");
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Nombre inválido");
        }
    }

    public void setNitOrId(String nitOrId) {
        if (nitOrId != null && !nitOrId.trim().isEmpty()) {
            this.nitOrId = nitOrId;
        } else {
            throw new IllegalArgumentException("NIT/Cédula inválido");
        }
    }

    public void setPhone(String phone) {
        if (phone != null && phone.trim().length() >= 7) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Teléfono inválido");
        }
    }

    public void setAddress(String address) {
        if (address != null && !address.trim().isEmpty()) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Dirección inválida");
        }
    }

    // Getters
    public String getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public String getNitOrId() {
        return nitOrId;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Método void que muestra datos del cliente
    public void showInfo() {
        System.out.println("Cliente: " + name + " (ID: " + clientId + ")");
        System.out.println("NIT/Cédula: " + nitOrId);
        System.out.println("Tel: " + phone + " | Dirección: " + address);
    }

    // Método que simula pago y retorna boolean si fue exitoso
    public boolean makePayment(double amount, String paymentMethod) {
        System.out.println("Procesando pago de " + amount + " por " + name + " vía " + paymentMethod + "...");
        boolean success = amount > 0;
        System.out.println("Pago " + (success ? "OK" : "FALLIDO"));
        return success;
    }

    // Método para contactar (retorna un String con mensaje de confirmación)
    public String contact(String message) {
        String confirmation = "Mensaje enviado a " + name + ": \"" + message + "\"";
        System.out.println(confirmation);
        return confirmation;
    }
}
