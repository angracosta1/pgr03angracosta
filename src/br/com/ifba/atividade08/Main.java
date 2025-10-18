/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 *
 * @author angra
 */
public class Main {
    public static void main(String[] args) {
      
 System.out.println("1. CRIANDO PERFIS DE USUÁRIO:");
        PerfilUsuario perfilAdmin = new PerfilUsuario(1L, "Administrador", 
            Arrays.asList("LOGIN", "ALTERAR_SENHA", "GERENCIAR_USUARIOS", "VISUALIZAR_LOGS", "CADASTRAR_USUARIOS"));
        
        PerfilUsuario perfilUsuario = new PerfilUsuario(2L, "Usuário Comum", 
            Arrays.asList("LOGIN", "ALTERAR_SENHA", "VISUALIZAR_DADOS"));
        
        PerfilUsuario perfilAuditor = new PerfilUsuario(3L, "Auditor", 
            Arrays.asList("LOGIN", "VISUALIZAR_LOGS", "GERAR_RELATORIOS"));
        
        System.out.println(perfilAdmin);
        System.out.println(perfilUsuario);
        System.out.println(perfilAuditor);
        
        System.out.println("\n2. CRIANDO USUÁRIOS:");
        Usuario usuarioAdmin = new Usuario(1L, perfilAdmin, "admin", "admin@sistema.com", 
                                          "senha123", LocalDateTime.now().minusHours(2), true);
        
        Usuario usuarioComum = new Usuario(2L, perfilUsuario, "joao.silva", "joao@empresa.com", 
                                          "senha456", LocalDateTime.now().minusDays(1), true);
                
        System.out.println(usuarioAdmin);
        System.out.println(usuarioComum);
    }
}
