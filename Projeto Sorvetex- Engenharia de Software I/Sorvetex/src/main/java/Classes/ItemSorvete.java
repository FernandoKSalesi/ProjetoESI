/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author Fernando
 */
//Sorvetes presentes no catálogo de sorvetes
public class ItemSorvete {
    private String itemID;
    private String nome;

    public ItemSorvete(String itemID, String nome) {
        this.itemID = itemID;
        this.nome = nome;
    }
    
    public void alterarItem(String itemID, String nome){
        this.itemID = itemID;
        this.nome = nome;
    }

    public String getItemID() {
        return itemID;
    }

    public String getNome() {
        return nome;
    }
    
}

