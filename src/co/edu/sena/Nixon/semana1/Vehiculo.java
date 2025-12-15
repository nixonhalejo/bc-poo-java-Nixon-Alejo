package co.edu.sena.Nixon.semana1;

public class Vehiculo {

    // Atributos encapsulados
    private String placa;
    private String tipo;
    private double capacidadKg;

    // Constructor completo (usa setters con validación)
    public Vehiculo(String placa, String tipo, double capacidadKg) {
        setPlaca(placa);
        setTipo(tipo);
        setCapacidadKg(capacidadKg);
    }

    // Constructor parcial (sobrecarga)
    public Vehiculo(String placa) {
        this(placa, "No definido", 0.1);
    }

    // Método de negocio
    public boolean validarCapacidad(double peso) {
        return peso <= capacidadKg;
    }

    // Getters
    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCapacidadKg() {
        return capacidadKg;
    }

    // Setters con validación (encapsulación real)
    public void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
        } else {
            throw new IllegalArgumentException("Placa inválida");
        }
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.trim().isEmpty()) {
            this.tipo = tipo;
        } else {
            throw new IllegalArgumentException("Tipo de vehículo inválido");
        }
    }

    public void setCapacidadKg(double capacidadKg) {
        if (capacidadKg > 0) {
            this.capacidadKg = capacidadKg;
        } else {
            throw new IllegalArgumentException("La capacidad debe ser mayor a cero");
        }
    }
}
