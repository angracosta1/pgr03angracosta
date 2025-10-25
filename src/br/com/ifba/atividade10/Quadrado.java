/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author angra
 */
public class Quadrado extends FormaBidimensional{
    
    private final double lado;

    public Quadrado(double lado) {
        if (lado < 0) throw new IllegalArgumentException("Lado nao pode ser negativo.");
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return String.format("Quadrado (lado = %.4f)", lado);
    }
}
