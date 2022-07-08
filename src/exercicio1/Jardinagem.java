package src.exercicio1;

public class Jardinagem {
    private String nomeJardim;
    private double quantidadeMetros;
    private int quantidadePlantas;
    private double quantidadeMetrosGrama;
    private double quilosAdubo;
    private double calculoGramasMetroGrama;
    private double valorAdubo;
    private double valorMetroGrama;
    private double valorCorteGrama;

    public Jardinagem(String nomeJardim, double quantidadeMetros, int quantidadePlantas, double quantidadeMetrosGrama, double quilosAdubo, double calculoGramasMetroGrama, double valorAdubo, double valorMetroGrama, double valorCorteGrama) {
        this.nomeJardim = nomeJardim;
        this.quantidadeMetros = quantidadeMetros;
        this.quantidadePlantas = quantidadePlantas;
        this.quantidadeMetrosGrama = quantidadeMetrosGrama;
        this.quilosAdubo = quilosAdubo;
        this.calculoGramasMetroGrama = calculoGramasMetroGrama;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
        this.valorCorteGrama = valorCorteGrama;
    }

    public String getNomeJardim() {
        return nomeJardim;
    }

    public void setNomeJardim(String nomeJardim) {
        this.nomeJardim = nomeJardim;
    }

    public double getQuantidadeMetros() {
        return quantidadeMetros;
    }

    public void setQuantidadeMetros(double quantidadeMetros) {
        this.quantidadeMetros = quantidadeMetros;
    }

    public int getQuantidadePlantas() {
        return quantidadePlantas;
    }

    public void setQuantidadePlantas(int quantidadePlantas) {
        this.quantidadePlantas = quantidadePlantas;
    }

    public double getQuantidadeMetrosGrama() {
        return quantidadeMetrosGrama;
    }

    public void setQuantidadeMetrosGrama(double quantidadeMetrosGrama) {
        this.quantidadeMetrosGrama = quantidadeMetrosGrama;
    }

    public double getQuilosAdubo() {
        return quilosAdubo;
    }

    public void setQuilosAdubo(double quilosAdubo) {
        this.quilosAdubo = quilosAdubo;
    }

    public double getCalculoGramasMetroGrama() {
        return calculoGramasMetroGrama;
    }

    public void setCalculoGramasMetroGrama(double calculoGramasMetroGrama) {
        this.calculoGramasMetroGrama = calculoGramasMetroGrama;
    }

    public double getValorAdubo() {
        return valorAdubo;
    }

    public void setValorAdubo(double valorAdubo) {
        this.valorAdubo = valorAdubo;
    }

    public double getValorMetroGrama() {
        return valorMetroGrama;
    }

    public void setValorMetroGrama(double valorMetroGrama) {
        this.valorMetroGrama = valorMetroGrama;
    }

    public double getValorCorteGrama() {
        return valorCorteGrama;
    }

    public void setValorCorteGrama(double valorCorteGrama) {
        this.valorCorteGrama = valorCorteGrama;
    }

    public void usarAdubo() {
        double gramasAdubo = quilosAdubo * 1000;
        calculoGramasMetroGrama = quantidadeMetrosGrama / 2 * 100;
        gramasAdubo -= calculoGramasMetroGrama;
        quilosAdubo = gramasAdubo / 1000;
    }

    public void precoAdubo() {
        valorAdubo *= calculoGramasMetroGrama;
    }

    public double precoCorteGrama() {
        valorCorteGrama = quantidadeMetrosGrama * valorMetroGrama;
        return valorCorteGrama;
    }
}
