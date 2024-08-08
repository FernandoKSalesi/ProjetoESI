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
public class Sorvetex {
    private CatalogoSorvetes catalogo; //Catalogo de sorvetes
    private ArrayList<Pedido> pedidos; //pedidos feito pelo Sorvetex
    private ArrayList<Cliente> clientes; //Clientes cadastrados
    
    public Sorvetex() {
        this.catalogo = new CatalogoSorvetes();
        this.pedidos = new ArrayList<Pedido>();
        this.clientes = new ArrayList<Cliente>();
    }
    
    
    public void iniciarSistema() {
        System.out.println("Histórico de pedidos.");
    }

    public void exibirCatalogo(){
        catalogo.exibirCatalogo();
    }
    
    public void criaCadastroCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado: " + cliente.getNome());
    }
    
    public void registrarPedidoPersonalizado(Pedido sorveteP) {
        pedidos.add(sorveteP);
        System.out.println("Pedido Personalizado registrado.");
    }

    public void registrarPedido(Pedido sorvete) {
        pedidos.add(sorvete);
        System.out.println("Pedido de sorvete do catalogo registrado.");
    }

    public void alugarCarrinhoDeSorvete(Cliente cliente, CarrinhoDeSorvete carrinho) {
        System.out.println("Aluguel registrado para cliente: " + cliente.getNome());
    }
    
    public void confirmarIniciar(){
        System.out.println("Sistema iniciado para operar.");
    }
    
    public void criaPedido(){
    //cria um pedido
    }
    
    public void alteraAluguel(AluguelCarrinho aluguel){
    //altera o aluguel
    }
    
    public void selecionaCarrinho(CarrinhoDeSorvete carrinho){
    //seleciona carrinho para alteraçao
    }
    
    public void selecionaSolicitacao(Pedido pedido){
    //seleciona solicitacao de sorvete personalizado
    }
    
    public void alterarItemSorvete(ItemSorvete sorvete){
    //altera um sorvete do catalogo
    }
    
    public void avancaSolicitacaoStatus(Cliente cliente){
    //avança o status da solicitaçao personalizada de um Cliente
    }
    
    public void listarSorvetesAVencer(){
    //lista sorvetes que estao pertos de vencer
    }
    
    public void inserePagamento(float valor){
    //pagamento do pedido realizado
    }
    
    public void desligarSistema() {
        System.out.println("Sistema desligado.");
    }
}
