/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.designpatter_observer;

import java.math.BigDecimal;
import java.util.Observer;
import model.Estoque;
import model.Gerente;

/**
 *
 * @author Bianca
 */
public class DesignPatter_Observer {

    public static void main(String[] args) {
       BigDecimal valorInicial = new BigDecimal("1900.0");
       BigDecimal desconto = new BigDecimal("10.0");
       Gerente gerente = new Gerente("Bianca");
       Estoque estoque = new Estoque("Calça-jeans", valorInicial, desconto);
       estoque.attach((Observer) gerente); //attach significa anexar
       estoque.setValor(valorInicial);
       

    }
}
