/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author angra
 */
public class PagamentoCartao implements Pagamento {
 private final double TAXA = 0.05;
    @Override
    public double calcularTotal(double valor) {
       
        return valor * (1 + TAXA);
    }

    @Override
    public void imprimirRecibo(double valorOriginal, double valorFinal) {
        
        
        System.out.println("---Pagamento com cartao");
        System.out.println("Valor Original:R$"+ String.format("%.2f",valorOriginal));
        System.out.println("ValorComTaxa (5%):R$"+ String.format("%.2f",valorOriginal * TAXA));
        System.out.println("Valor Final a pagar:R$"+ String.format("%.2f",valorFinal));
        System.out.println("----------------");
    }
    
}
