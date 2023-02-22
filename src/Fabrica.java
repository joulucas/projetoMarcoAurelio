public class Fabrica {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setPlaca("DGT4058");
        carro1.setModelo("Civic");
        carro1.setCor("Cinza");
        carro1.setLigado(false);
        carro1.setAberto(true);
        carro1.setTetoSolar(true);

        carro1.ligar();
        carro1.mover();
        carro1.parar();

    }

}
