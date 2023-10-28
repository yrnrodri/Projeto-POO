package entities.estoque;

public abstract class Produto {
    private String nome;
    private boolean tipo;   //true se comida //false se objeto
    private String ID;
    private int quantidade;
    private double preco;
    public static final double TAXACOMIDA = 1.30;
    public static final double TAXAOBJ = 1.20;


    public Produto(String nome,boolean tipo, String iD, int quantidade, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.ID = iD;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double precoFinal(){
        if(tipo == true){
            System.out.println("Este produto é um alimento");
            return (quantidade * preco) * TAXACOMIDA;
        }else{
            return (quantidade * preco) * TAXAOBJ;

        }
    }

    ///////////////////Setters//////////////////////////
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setID(String iD) {
        ID = iD;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    ///////////////////Getters//////////////////////////
    public String getNome() {
        return nome;
    }
    public String getID() {
        return ID;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }

    

}
