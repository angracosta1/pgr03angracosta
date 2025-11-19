/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author angra
 */
public class PagamentoDinheiro implements Pagamento{
  private final double Desconto = 0.10;
    @Override
    public double calcularTotal(double valor) {
       
        return (1 - Desconto) * valor;
    }

    @Override
    public void imprimirRecibo(double valorOriginal, double valorFinal) {
        
        System.out.println("---Recibo pagamento");
        System.out.println("Valor Original:R$"+ String.format("%.2f",valorOriginal));
        System.out.println("DescontoAplicado (10%):R$"+ String.format("%.2f",valorOriginal * Desconto));
        System.out.println("Valor Final a pagar:R$"+ String.format("%.2f",valorFinal));
        System.out.println("----------------");
    }
    
}
