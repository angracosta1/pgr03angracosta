/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author angra
 */
public class Cubo extends FormaTridimensional{
    
    private final double aresta;

    public Cubo(double aresta) {
        if (aresta < 0) throw new IllegalArgumentException("Aresta nao pode ser negativa.");
        this.aresta = aresta;
    }

    @Override
    public double obterArea() {
        return 6.0 * aresta * aresta;
    }

    @Override
    public double obterVolume() {
        return aresta * aresta * aresta;
    }

    @Override
    public String toString() {
        return String.format("Cubo (aresta = %.4f)", aresta);
    }
}
