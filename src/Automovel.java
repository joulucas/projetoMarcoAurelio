public class Automovel {

    private String cor;
    private String placa;
    private String modelo;
    private boolean ligado;

    public Automovel(String cor, String placa, String modelo, boolean ligado) {
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.ligado = ligado;
    }

    public Automovel() {
    }

    public boolean ligar(){
        if(isLigado()){
            System.out.println("Automovel ligado");
            return true;
        }else{
            System.out.println("Automovel desligado");
            return false;
        }
    }

    public boolean mover(){
        if(isLigado()){
            System.out.println("Carro se movendo");
            return true;
        }else{
            return false;
        }
    }

    public boolean parar(){
        if(!mover()){
            System.out.println("Carro parado");
            return true;
        }else{
            return false;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
