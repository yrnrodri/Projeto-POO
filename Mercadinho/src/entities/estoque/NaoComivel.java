package entities.estoque;

public class NaoComivel extends Produto{
    public NaoComivel(String nome, String iD, String marca, int quantidade, double preco) {
        super(nome, iD, marca, quantidade, preco);
    }

    public double vender(int quantidade){
        return quantidade -= quantidade;
    }


}
