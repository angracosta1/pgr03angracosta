/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author angra
 */
public class ContaBanco {
    
    public String numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //construtor para determinar o status inicial da conta.
    public ContaBanco(String numConta, String dono){
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0.0;
        this.status = false;
    }
    
    //método de abrir conta.
    public void abrirConta(String tipo){
        if(this.isStatus()){
            System.out.println("A conta já está aberta!");
        }else{
            this.setTipo(tipo);
            this.setStatus(true);
            if(tipo.equals("cp")){//Verificação para cp.
                this.setSaldo(150.0);
            }else if (tipo.equals("cc")){//Verificação para cc.
                this.setSaldo(50.0);
            }
            System.out.println("Conta aberta com sucesso!");
            System.out.println("TITULAR: " + this.getDono());
            System.out.println("TIPO: " + this.getTipo());
            System.out.println("NÚMERO DA CONTA: " + this.getNumConta());
            System.out.println("-> SALDO INICIAL: " + this.getSaldo());
            System.out.println();
        }
    }
    
    //método de fechar conta.
    private void fecharConta(){
        if(this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
            System.out.println();
        }else{
            System.out.println("Não é possível fechar a conta. O saldo não é igual a zero.");
            System.out.println();
        }
    }
    
    //método para depositar na conta.
    private void depositar(double valor){
        if(this.isStatus()){
            if(valor > 0){
                this.setSaldo(this.getSaldo() + valor);
                System.out.println(valor + "R$ foi depositado com sucesso!");
                System.out.println("-> SALDO ATUAL: R$" + this.getSaldo());
                System.out.println();
            }else{
                System.out.println("Erro ao depositar. O valor é inválido para depósito.");
                System.out.println();
            }
        }else{
            System.out.println("Não foi possível depositar o valor. A conta está fechada.");
            System.out.println();
        }
    }
    
    //método para sacar dinheiro.
    private void sacar(double valor){
        if(this.isStatus()){
            if(valor <= this.getSaldo() && valor > 0){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println(valor + "R$ foi sacado com sucesso!");
                System.out.println("-> SALDO ATUAL: R$" + this.getSaldo());
                System.out.println();
            }else if(valor > this.getSaldo()){
                System.out.println("Erro ao sacar. Saldo insuficiente!");
                System.out.println();
            }else{
                System.out.println("Erro ao sacar. Valor inválido para saque!");
                System.out.println();
            }
        }else{
            System.out.println("Erro ao sacar. A conta está fechada!");
            System.out.println();
        }
    }
    
    //método para pagar mensalidade.
    public void pagarMensal(){
        if(this.isStatus()){
            double mensalidade = (this.getTipo().equals("cc")) ? 12.0 : 20.0;
            if(this.getSaldo() >= mensalidade){
                this.setSaldo(this.getSaldo() - mensalidade);
                System.out.println("A mensalidade foi paga com sucesso! Valor pago: R$" + mensalidade);
                System.out.println("-> SALDO ATUAL: R$" + this.getSaldo());
                System.out.println();
            }else{
                System.out.println("Erro ao pagar mensalidade. O saldo da conta é insuficiente.");
                System.out.println();
            }
        }else{
            System.out.println("Erro ao pagar mensalidade. A conta está fechada.");
            System.out.println();
        }
    }
    
    //método principal para testar as operações na conta.
    public static void main(String[] args) {
        
        ContaBanco conta1 = new ContaBanco("0001", "Angra");
        conta1.abrirConta("cc");
        conta1.depositar(150);
        conta1.sacar(50);
        conta1.pagarMensal();
        conta1.fecharConta();
        
        ContaBanco conta2 = new ContaBanco("0002", "Pedro");
        conta2.abrirConta("cp");
        conta2.depositar(100);
        conta2.sacar(50);
        conta2.pagarMensal();
        conta2.fecharConta();
        
    }
    
}
