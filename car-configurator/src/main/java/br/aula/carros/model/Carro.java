package br.aula.carros.model;

public class Carro {

    private String tipo;
    private String modelo;
    private String motor;

    private boolean importado;
    private boolean ar;
    private boolean cambio;
    private boolean alarme;
    private boolean pintura;
    private boolean teto;
    private boolean multimidia;

    private double precoBase;

    public Carro() {
    }

    private void definirPrecoBase() {

        if (modelo == null) {
            precoBase = 0;
            return;
        }

        switch (modelo) {

            case "Gol": precoBase = 35000; break;
            case "Celta": precoBase = 32000; break;
            case "Uno": precoBase = 30000; break;

            case "Fiesta": precoBase = 40000; break;
            case "Palio": precoBase = 38000; break;
            case "Fox": precoBase = 42000; break;

            case "Fremmont": precoBase = 80000; break;
            case "Jeep": precoBase = 90000; break;
            case "HRV": precoBase = 95000; break;

            case "Strada": precoBase = 60000; break;
            case "Saveiro": precoBase = 58000; break;
            case "S10": precoBase = 120000; break;

            case "Corolla": precoBase = 130000; break;
            case "Fusion": precoBase = 150000; break;
            case "Civic": precoBase = 140000; break;

            default: precoBase = 0;
        }
    }

    public double calcularTotal() {
        definirPrecoBase();

        double total = precoBase;

        if (ar) total += 3000;
        if (cambio) total += 5000;
        if (alarme) total += 800;
        if (pintura) total += 2500;
        if (teto) total += 4000;
        if (multimidia) total += 1800;

        double ipi = "1.0".equals(motor) ? 0.10 : 0.20;
        total += total * ipi;

        if (importado) {
            total += total * 0.30;
        }

        return total;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public boolean isImportado() {
        return importado;
    }

    public void setImportado(boolean importado) {
        this.importado = importado;
    }

    public boolean isAr() {
        return ar;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public boolean isCambio() {
        return cambio;
    }

    public void setCambio(boolean cambio) {
        this.cambio = cambio;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public boolean isPintura() {
        return pintura;
    }

    public void setPintura(boolean pintura) {
        this.pintura = pintura;
    }

    public boolean isTeto() {
        return teto;
    }

    public void setTeto(boolean teto) {
        this.teto = teto;
    }

    public boolean isMultimidia() {
        return multimidia;
    }

    public void setMultimidia(boolean multimidia) {
        this.multimidia = multimidia;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
