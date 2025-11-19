/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author angra
 */
public class Circulo extends FormaBidimensional{
   private final double raio;

    public Circulo(double raio) {
        if (raio < 0) throw new IllegalArgumentException("Raio nao pode ser negativo.");
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return String.format("Circulo (raio = %.4f)", raio);
    } 
}
