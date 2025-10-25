/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author angra
 */
public class Triangulo extends FormaBidimensional{
   
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        if (base < 0 || altura < 0) throw new IllegalArgumentException("Base/altura nao podem ser negativos.");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        return (base * altura) / 2.0;
    }

    @Override
    public String toString() {
        return String.format("Triangulo (base = %.4f, altura = %.4f)", base, altura);
    }
}
