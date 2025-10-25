/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author angra
 */
public class Main {
    public static void main(String[] args) {
        
        Forma[] formas = new Forma[] {
            new Circulo(3.0),         
            new Quadrado(4.0),         
            new Triangulo(3.0, 4.0),   
            new Esfera(2.5),            
            new Cubo(3.0),               
            new PiramideQuadrada(4.0, 6.0) 
        };

        
        for (int i = 0; i < formas.length; i++) {
            Forma f = formas[i];
            System.out.println("===== Forma " + (i+1) + " =====");
            System.out.println(f.toString());

            if (f instanceof FormaTridimensional) {
                FormaTridimensional f3 = (FormaTridimensional) f;
                System.out.printf("Area (superficie): %.4f%n", f3.obterArea());
                System.out.printf("Volume: %.4f%n", f3.obterVolume());
            } else if (f instanceof FormaBidimensional) {
                FormaBidimensional f2 = (FormaBidimensional) f;
                System.out.printf("Area: %.4f%n", f2.obterArea());
            } else {
                System.out.println("Tipo desconhecido.");
            }

            System.out.println();
        }
    }
}