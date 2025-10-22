/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;



/**
 *
 * @author angra
 */
public class PagamentoPix implements Pagamento{
    private final double CASHBACK = 0.2;

    @Override
    public double calcularTotal(double valor) {
      
      return valor * (1 - CASHBACK );
    }

    @Override
    public void imprimirRecibo(double valorOriginal, double valorFinal) {
       
        System.out.println("---Recibo pagamento via pix---");
        System.out.println("Valor Original:R$"+ String.format("%.2f",valorOriginal));
        System.out.println("CASHBACK recebido (2%):R$"+ String.format("%.2f",valorOriginal * CASHBACK));
        System.out.println("Valor Final a pagar:R$"+ String.format("%.2f",valorFinal));
        System.out.println("----------------");
    }
    
}
