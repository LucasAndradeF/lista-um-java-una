public class Estacionamento {
    private int carros;
    private int rodas;
    private int veiculos;
    private int motos;

    public int getCarros() {
        return carros;
    }

    public void setCarros(int carros) {
        this.carros = carros;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(int veiculos) {
        this.veiculos = veiculos;
    }

    public int getMotos() {
        return motos;
    }

    public void setMotos(int motos) {
        this.motos = motos;
    }

    public void calcularVeiculos() {
        Calculos estacionamento = new Calculos();
        estacionamento.calcularVeiculos(carros, motos, veiculos, rodas);
    }
}
