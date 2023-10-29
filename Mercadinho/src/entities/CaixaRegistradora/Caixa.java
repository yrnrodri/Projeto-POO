package entities.CaixaRegistradora;

import entities.estoque.Produto;

public class Caixa {
    private String nomeCliente;
    private String CPF;
    private double valorTotal;


    public Caixa(String nomeCliente, String cPF, double valorTotal) {
        this.nomeCliente = nomeCliente;
        CPF = cPF;
        this.valorTotal = valorTotal;
    }
    



    public boolean validaProdutoID(Produto[] produtos, String idProduto) {
        for (Produto produto : produtos) {
            if (produto != null && produto.getID().equals(idProduto)) {
                return true; 
            }
        }
        return false;
    }

    public boolean validaProdutoNome(Produto[] produtos, String nomeProduto) {
        for (Produto produto : produtos) {
            if (produto != null && produto.getNome().equals(nomeProduto)) {
                return true; 
            }
        }
        return false;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getCPF() {
        return CPF;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    

}
