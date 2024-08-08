/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */

public class CatalogoSorvetes {
    private float Preco;
    private String Validade;
    private int Estoque;
    private String Descricao;
    private ArrayList<ItemSorvete> sorvetes; //lista de sorvetes pré-estabelecidos

    public CatalogoSorvetes(float Preco, String Validade, int Estoque, String Descricao, ArrayList<ItemSorvete> sorvetes) {
        this.Preco = Preco;
        this.Validade = Validade;
        this.Estoque = Estoque;
        this.Descricao = Descricao;
        this.sorvetes = sorvetes;
    }

    public CatalogoSorvetes() {
    }
    
    //exibe catalogo de itens de sorvetes disponíveis
    public void exibirCatalogo() {
        for (int i = 0; i < sorvetes.size(); i++) {
            System.out.println(sorvetes.get(i));
        }
    }
    
    public void alterarItemCatalogo(ItemSorvete sorvete, float preco, String validade, int quantidade){
        //altera as informaçoes do sorvete do catalogo
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    public String getValidade() {
        return Validade;
    }

    public void setValidade(String Validade) {
        this.Validade = Validade;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int Estoque) {
        this.Estoque = Estoque;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public ArrayList<ItemSorvete> getSorvetes() {
        return sorvetes;
    }

    public void setSorvetes(ArrayList<ItemSorvete> sorvetes) {
        this.sorvetes = sorvetes;
    }
    
    
}

