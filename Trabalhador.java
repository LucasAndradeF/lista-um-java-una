public class Trabalhador {
    private int horasTrabalhadas;
    private double valorHoras;
    private double salarioFamilia;
    private int numeroFilhos;
    private double salarioFixo;
    private double vendas;
    private double percentualVendas;
    private double salarioFinal;
    
    public Trabalhador() {
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getValorHoras() {
        return valorHoras;
    }
    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }
    public double getSalarioFamilia() {
        return salarioFamilia;
    }
    public void setSalarioFamilia(double salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }
    public int getNumeroFilhos() {
        return numeroFilhos;
    }
    public void setNumeroFilhos(int numeroFilhos) {
        this.numeroFilhos = numeroFilhos;
    }
    public double getSalarioFixo() {
        return salarioFixo;
    }
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    public double getVendas() {
        return vendas;
    }
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    public double getPercentualVendas() {
        return percentualVendas;
    }
    public void setPercentualVendas(double percentualVendas) {
        this.percentualVendas = percentualVendas;
    }
    public double getSalarioFinal() {
        return salarioFinal;
    }
    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    public double salarioBruto() {
        Calculos salario = new Calculos();
         return salario.salarioBruto(horasTrabalhadas, valorHoras, salarioFamilia, numeroFilhos);
    }
    public double salarioTotal() {
        Calculos salario = new Calculos();
         return salario.salarioTotal(salarioFixo, vendas, percentualVendas);
    }
        
}
