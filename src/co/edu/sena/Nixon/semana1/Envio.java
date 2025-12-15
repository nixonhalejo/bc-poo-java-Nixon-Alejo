package co.edu.sena.Nixon.semana1;

public class Envio {

    // Atributos encapsulados
    private String codigo;
    private double peso;
    private String destino;
    private Vehiculo vehiculo;

    // Constructor completo (usa setters con validación)
    public Envio(String codigo, double peso, String destino, Vehiculo vehiculo) {
        setCodigo(codigo);
        setPeso(peso);
        setDestino(destino);
        setVehiculo(vehiculo);
    }

    // Constructor parcial (sobrecarga)
    public Envio(String codigo, double peso) {
        this(codigo, peso, "Destino no definido", null);
    }

    // Método de negocio: cálculo de costo
    public double calcularCosto() {
        return peso * 1500;  // costo por kg
    }

    // Método que retorna resumen del envío
    public String obtenerResumen() {
        String placaVehiculo = (vehiculo != null) ? vehiculo.getPlaca() : "Sin vehículo asignado";
        return "Envio " + codigo +
                " | Destino: " + destino +
                " | Peso: " + peso +
                " kg | Vehículo: " + placaVehiculo;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getDestino() {
        return destino;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    // Setters con validación
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("Código de envío inválido");
        }
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("El peso debe ser mayor a cero");
        }
    }

    public void setDestino(String destino) {
        if (destino != null && !destino.trim().isEmpty()) {
            this.destino = destino;
        } else {
            throw new IllegalArgumentException("Destino inválido");
        }
    }

    public void setVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
            this.vehiculo = vehiculo;
        } else {
            throw new IllegalArgumentException("Debe asignarse un vehículo al envío");
        }
    }
}
