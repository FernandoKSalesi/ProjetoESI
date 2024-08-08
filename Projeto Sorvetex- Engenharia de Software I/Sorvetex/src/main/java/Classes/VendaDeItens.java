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
public class VendaDeItens extends Pedido{    
    private ArrayList<ItemSorvete> sorvetes; //Lista de sorvetes do catálogo
    private float SubTotal; //SubTotal da venda
    private int Quantidade;

    public VendaDeItens(String data, float valorTotal, float subTotal, int quantidade) {
        super(data, valorTotal);
        this.SubTotal = subTotal;
        this.Quantidade = quantidade;
        this.sorvetes = new ArrayList<>();
    }
    
    public void obterSubTotal(){
        //subtotal de todos os itens inseridos para comprar
    }
    
    public void adicionarItem(ItemSorvete sorvete) {
        sorvetes.add(sorvete);
        obterSubTotal();
    }  
    
    public ArrayList<ItemSorvete> getSorvetes() {
        return sorvetes;
    }

    public void setSorvetes(ArrayList<ItemSorvete> sorvetes) {
        this.sorvetes = sorvetes;
    }

    public float getSubTotal() {
        return SubTotal;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = sorvetes.size();
    }  
    
}
