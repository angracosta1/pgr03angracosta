/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author angra
 */
public interface Pagamento {
  double calcularTotal(double valor);
  
  void imprimirRecibo(double valorOriginal,double valorFinal);
}
