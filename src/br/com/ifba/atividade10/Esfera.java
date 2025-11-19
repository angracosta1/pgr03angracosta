/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author angra
 */
public class Esfera extends FormaTridimensional{
    
    private final double raio;

    public Esfera(double raio) {
        if (raio < 0) throw new IllegalArgumentException("Raio nao pode ser negativo.");
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return 4.0 * Math.PI * raio * raio;
    }

    @Override
    public double obterVolume() {
        return (4.0/3.0) * Math.PI * raio * raio * raio;
    }

    @Override
    public String toString() {
        return String.format("Esfera (raio = %.4f)", raio);
    }
}
