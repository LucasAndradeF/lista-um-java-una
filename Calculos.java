public class Calculos {
    private double numeroUm;
    private double numeroDois;
    private double numeroTres;

    public double getNumeroUm() {
        return numeroUm;
    }

    public void setNumeroUm(double numeroUm) {
        this.numeroUm = numeroUm;
    }

    public double getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(double numeroDois) {
        this.numeroDois = numeroDois;
    }

    public double getNumeroTres() {
        return numeroTres;
    }

    public void setNumeroTres(double numeroTres) {
        this.numeroTres = numeroTres;
    }

    public double mediaAritmetica(double numeroUm, double numeroDois) {
        return (numeroUm + numeroDois) / 2;
    }

    public double mediaAritmetica(double numeroUm, double numeroDois, double numeroTres) {
        return (numeroUm + numeroDois + numeroTres) / 3;
    }

    public static double VALOR = 0.10;

    public double valorProduto() {
        return (numeroUm * VALOR) + numeroUm;
    }

    public double conversorTemperatura() {
        return (numeroUm - 32) / 1.8;
    }

    public double salarioBruto(int horasTrabalhadas, double valorHoras, double salarioFamilia, int numeroFilhos) {
        return (horasTrabalhadas * valorHoras) + (salarioFamilia * numeroFilhos);
    }

    public double mediaHarmonica(double numeroUm, double numeroDois, double numeroTres) {
        return 3 / (1 / numeroUm + 1 / numeroDois + 1 / numeroTres);
    }

    public double mediaGeometrica(double numeroUm, double numeroDois, double numeroTres) {
        return Math.cbrt(numeroUm * numeroDois * numeroTres);
    }

    public void segundos(int segundos) {
        int horas = segundos / 3600;
        int restante = segundos % 3600;
        int minutos = restante / 60;
        segundos = restante % 60;
        System.out.println("O resultado é: " + horas + "h " + minutos + "min " + segundos + "segundos ");
    }

    public double jurosCompostos(double capital, double taxa, double prazo) {
        return capital * Math.pow((1 + taxa), prazo);
    }

    public void calcularVeiculos(int carros, int motos, int veiculos, int rodas) {
        motos = ((4 * veiculos) - rodas) / 2;
        carros = (veiculos - motos);
        System.out.println("A quantidade de carros é: " + carros);
        System.out.println("A quantidade de motos é: " + motos);
    }

    public double calcularLog() {
        return Math.log(numeroUm) / Math.log(numeroDois);
    }

    public double salarioTotal(double salarioFixo, double vendas, double percentualVendas) {
        return salarioFixo + ((vendas * percentualVendas) / 100);
    }
}