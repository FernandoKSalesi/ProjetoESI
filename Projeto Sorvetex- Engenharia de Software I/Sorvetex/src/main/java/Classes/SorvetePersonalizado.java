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

public class SorvetePersonalizado {
    private Cliente clienteSolicita; //Um pedido para cada cliente
    private String Status; //Status do pedido
    private String Massa;
    private String Flocos;
    private String TamanhoPote;
    private float Preco;
    private String DataEntrega;

    public SorvetePersonalizado(Cliente cliente) {
        this.clienteSolicita = cliente;
        this.Status = "Em produção";
    }
    
    public void personalizaSorvete(String massa, String flocos, String tamanho, String data){
        this.Massa = massa;
        this.Flocos = flocos;
        this.TamanhoPote = tamanho;
        this.DataEntrega = data;
    }
    
    
    public void avancaSolicitacaoStatus (){
        if (this.Status.equals("Em produção"))
            this.Status = "Pronto para entrega";
        else this.Status = "Finalizado";
    }

    public Cliente getCliente() {
        return clienteSolicita;
    }

    public void setCliente(Cliente cliente) {
        this.clienteSolicita = cliente;
    }

    public String getMassa() {
        return Massa;
    }

    public void setMassa(String Massa) {
        this.Massa = Massa;
    }

    public String getFlocos() {
        return Flocos;
    }

    public void setFlocos(String Flocos) {
        this.Flocos = Flocos;
    }

    public float getPreco() {
        return Preco;
    }

    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    public String getDataEntrega() {
        return DataEntrega;
    }

    public void setDataEntrega(String DataEntrega) {
        this.DataEntrega = DataEntrega;
    }

    public String getStatus() {
        return Status;
    }

    public String getTamanhoPote() {
        return TamanhoPote;
    }

    public void setTamanhoPote(String TamanhoPote) {
        this.TamanhoPote = TamanhoPote;
    }
}

