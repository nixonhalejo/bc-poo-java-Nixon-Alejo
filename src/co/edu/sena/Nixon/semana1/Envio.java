package co.edu.sena.Nixon.semana1;

public class Envio {
    private String codigo;
    private double peso;
    private String destino;
    private Vehiculo vehiculo;

    public Envio(String codigo, double peso, String destino, Vehiculo vehiculo) {
        this.codigo = codigo;
        this.peso = peso;
        this.destino = destino;
        this.vehiculo = vehiculo;
    }

    public double calcularCosto() {
        return peso * 1500;  // costo por kg
    }

    public String obtenerResumen() {
        return "Envio " + codigo +
                " | Destino: " + destino +
                " | Peso: " + peso +
                "kg | Vehículo: " + vehiculo.getPlaca();
    }

    // getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}

