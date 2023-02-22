public class Carro extends Automovel{

    private boolean tetoSolar;
    private boolean aberto;

    public Carro(boolean tetoSolar, boolean aberto) {
        this.tetoSolar = tetoSolar;
        this.aberto = aberto;
    }

    public Carro(){}

    public void abrirFechar(Carro carro){
        if(carro.isAberto()){
            System.out.println("Carro aberto");
        }else{
            System.out.println("Carro fechado");
        }
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
