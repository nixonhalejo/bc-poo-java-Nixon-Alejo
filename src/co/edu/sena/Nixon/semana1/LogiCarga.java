package co.edu.sena.Nixon.semana1;

import java.util.ArrayList;

public class LogiCarga {

    private String nombre;
    private ArrayList<Envio> envios;

    public LogiCarga(String nombre) {
        this.nombre = nombre;
        this.envios = new ArrayList<>();
    }

    public void agregarEnvio(Envio envio) {
        envios.add(envio);
    }

    public void mostrarEnvios() {
        for (Envio e : envios) {
            System.out.println(e.obtenerResumen());
        }
    }

    public int totalEnvios() {
        return envios.size();
    }
}

