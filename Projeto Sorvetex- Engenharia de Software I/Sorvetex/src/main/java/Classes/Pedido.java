/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Fernando
 */
public class Pedido {
    
    private String Data;
    private float ValorTotal;
    
    //constructor
    public Pedido(String data, float ValorTotal) {
        this.Data = data;
        this.ValorTotal = ValorTotal;
    }
    
    public void criaPedido(){
        //Cria o pedido para Venda de itens do catalogo, Aluguel de carrinho ou sorvete personalizado
    }
    
    public void finalizaPedido(){
        //finaliza pedido
    }
    
    //calcula o troco do pagamento
    public float calculaTroco(float valor){
      if (valor > ValorTotal){
          return valor - ValorTotal;
      }  return 0;
    }

    // getters and setters
    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
    
}
