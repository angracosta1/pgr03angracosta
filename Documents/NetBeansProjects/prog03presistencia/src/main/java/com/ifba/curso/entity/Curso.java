/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifba.curso.entity;

import com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.*;
import java.io.Serializable;
/**
 *
 * @author angra
 */

@Entity
@Table(name = "curso")
public class Curso extends PersistenceEntity implements Serializable{

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "duracao")
    private String duracao; // ex: "3 meses"
    
    @Column(name = "descricao", length = 2000)
    private String descricao;

    // caminho para a imagem (pode ser caminho absoluto ou relativo ao resources)
    private String imagemPath;

    public Curso() {}

    // getters e setters

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDuracao() { return duracao; }
    public void setDuracao(String duracao) { this.duracao = duracao; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getImagemPath() { return imagemPath; }
    public void setImagemPath(String imagemPath) { this.imagemPath = imagemPath; }

    @Override
    public String toString() {
        return nome + (duracao != null ? " (" + duracao + ")" : "");
    }
}
