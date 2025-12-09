package co.edu.sena.Nixon.semana1;

public class Vehiculo {
    private String placa;
    private String tipo;
    private double capacidadKg;

    public Vehiculo(String placa, String tipo, double capacidadKg) {
        this.placa = placa;
        this.tipo = tipo;
        this.capacidadKg = capacidadKg;
    }

    public boolean validarCapacidad(double peso) {
        return peso <= capacidadKg;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCapacidadKg() {
        return capacidadKg;
    }

    public void setCapacidadKg(double capacidadKg) {
        this.capacidadKg = capacidadKg;
    }
}

