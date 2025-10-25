/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author angra
 */
public class PiramideQuadrada extends FormaTridimensional{
    private final double ladoBase;
    private final double altura;

    public PiramideQuadrada(double ladoBase, double altura) {
        if (ladoBase < 0 || altura < 0) throw new IllegalArgumentException("Dimensoes nao podem ser negativas.");
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        double baseArea = ladoBase * ladoBase;
        double apotema = Math.sqrt((ladoBase / 2.0) * (ladoBase / 2.0) + altura * altura); // slant height
        double lateral = 2.0 * ladoBase * apotema;
        return baseArea + lateral;
    }

    @Override
    public double obterVolume() {
        double baseArea = ladoBase * ladoBase;
        return (baseArea * altura) / 3.0;
    }

    @Override
    public String toString() {
        return String.format("Piramide Quadrada (lado da base = %.4f, altura = %.4f)", ladoBase, altura);
    }
}
