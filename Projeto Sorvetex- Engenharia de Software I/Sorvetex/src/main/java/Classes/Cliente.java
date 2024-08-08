/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Fernando
 */

    //Clientes cadastrados no sistema

public class Cliente {
    private String nome; //nome completo Cliente
    private String cpf; //cpf do Cliente
    private String telefone; //telefone do Cliente
    private String descricao;
    
    public void cadastrar(String nome, String cpf, String telefone, String descricao){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.descricao = descricao;
    }
    
    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}

