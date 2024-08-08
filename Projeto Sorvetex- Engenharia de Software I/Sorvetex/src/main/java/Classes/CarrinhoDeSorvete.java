/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Fernando
 */
public class CarrinhoDeSorvete {
    private int Tamanho;
    private float preco;
    private int Quantidade;

    public void alteraCarrinho(int tamanho, float preco, int quantidade){
        this.Tamanho = tamanho;
        this.preco = preco;
        this.Quantidade = quantidade;
    }
    
    
    public CarrinhoDeSorvete(int Tamanho, float preco, int Quantidade) {
        this.Tamanho = Tamanho;
        this.preco = preco;
        this.Quantidade = Quantidade;
    }

    public int getTamanho() {
        return Tamanho;
    }

    public void setTamanho(int Tamanho) {
        this.Tamanho = Tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }


}
