package entities.estoque;

public abstract class Produto {
    private String nome;
    private String ID;
    private String marca;
    private int quantidade;
    private double preco;

    public Produto(String nome, String iD, String marca, int quantidade, double preco) {
        this.nome = nome;
        this.ID = iD;
        this.marca = marca;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void vender(){}  //Tem que ser implementado pelas filhas

    public void adicionar(){  }      //na real esse metodo la na parte do front vai ser redundante pois é so repetir esta mesma classe para ser instanciada, pensem ai pedreiros pq nao sei nao

    



    ///////////////////Getters//////////////////////////
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    ///////////////////Setters//////////////////////////
    public String getNome() {
        return nome;
    }
    public String getID() {
        return ID;
    }
    public String getMarca() {
        return marca;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }

    

}
