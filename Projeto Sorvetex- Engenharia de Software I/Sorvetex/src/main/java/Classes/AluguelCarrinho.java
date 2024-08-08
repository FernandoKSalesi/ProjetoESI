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
public class AluguelCarrinho {
    private ArrayList<CarrinhoDeSorvete> carrinho;
    private String LocalEntrega; //em caso de locaçao
    private String DataEntrega; // data de entrega
    private int Prazo; //quantidade de dias de locacao
    private Cliente clienteAluga; //Cliente que alugou
    private float SubTotal;

    
    public void alteraAluguelCarrinho(){
    //altera os valores do aluguel
    }
    
    public void obterSubTotal(){
    //total em relaçao ao prazo fornecido
    }
    
    public void exibeCarrinhoDeSorvete(){
    //exibe as opçoes diponíveis
    }
    
    public void selecionaCarrinhoDeSorvete(Cliente cliente, int prazo, String local, String data){
    //seleciona carrinho de sorvete para alteraçao
    }
    
    
    public AluguelCarrinho(ArrayList<CarrinhoDeSorvete> carrinho, String LocalEntrega, String DataEntrega, int Prazo, Cliente clienteAluga, float SubTotal) {
        this.carrinho = carrinho;
        this.LocalEntrega = LocalEntrega;
        this.DataEntrega = DataEntrega;
        this.Prazo = Prazo;
        this.clienteAluga = clienteAluga;
        this.SubTotal = SubTotal;
    }

    public AluguelCarrinho() {
    }

    public String getLocalEntrega() {
        return LocalEntrega;
    }

    public void setLocalEntrega(String LocalEntrega) {
        this.LocalEntrega = LocalEntrega;
    }

    public String getDataEntrega() {
        return DataEntrega;
    }

    public void setDataEntrega(String DataEntrega) {
        this.DataEntrega = DataEntrega;
    }

    public int getPrazo() {
        return Prazo;
    }

    public void setPrazo(int Prazo) {
        this.Prazo = Prazo;
    }

    public Cliente getClienteAluga() {
        return clienteAluga;
    }

    public void setClienteAluga(Cliente clienteAluga) {
        this.clienteAluga = clienteAluga;
    }
    
    
}
