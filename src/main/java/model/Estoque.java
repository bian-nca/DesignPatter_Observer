/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Bianca
 */
public class Estoque extends Observable{
    private String produto;
    private BigDecimal valor; 
    private BigDecimal desconto;
    private List<Observer> observers = new ArrayList<>(); 
    
    public Estoque() {}; //construtor vazio da minha classe estoque

    public Estoque(String produto, BigDecimal valor, BigDecimal desconto) {
        this.produto = produto;
        this.valor = valor;
        this.desconto = desconto;
    }
    
   public void attach(Observer observer) {
       observers.add(observer);
   }
   
    public void notifyObservers() {
       for(Observer observer:observers) {
           observer.update(this); //update onde o método dentro da interface Observer trabalhará
       }
   }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

   
   
}
