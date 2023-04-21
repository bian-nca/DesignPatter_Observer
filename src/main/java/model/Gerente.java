/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author Bianca
 */
public class Gerente implements Observer  {
    private String nome; 

    public Gerente() {
    } //construtor vazio
    
    @Override
    public void update(Estoque estoque) {
        BigDecimal valor = estoque.getValor();
        BigDecimal limite = new BigDecimal("1000.0");
        if(valor.compareTo(limite)>0){
            System.out.println("Gerente " +nome+ ": Valor do produto " + estoque.getProduto()+ " é maior que 1000");
        }
    }
    
     public Gerente(String nome) {
        this.nome = nome;
    }
     
     
    
}
