/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contaaula05;

/**
 *
 * @author pauli
 */
public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(){
        this.status = false;
        this.saldo = 0;
    }
    
    void EstadoAtual(){
        System.out.println("----------------------\n"
                + "Conta: " + this.getNumConta() + "\n"
                + "Tipo: " + this.getTipo() + "\n"
                + "Dono: " + this.getDono() + "\n"
                + "Saldo: " + this.getSaldo() + "\n"
                + "Status: " + this.isStatus() + "\n");
    }
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        if(tipo.equals("CC")){
            this.setSaldo(50);//O correto é sem + e sem f
        }
        
        if(tipo.equals("CP")){
            this.setSaldo(150);//Será que tinha algo errado com o metodo de Scanner?
        }
        
        System.out.println("Conta criada com sucesso!");
        this.setStatus(true);
    }
    
    public void fecharConta(){
        if (this.isStatus()) {
            if (this.getSaldo()>0) {
                System.out.println("Não podemos fechar sua conta pois você "
                        + "ainda possui saldo!");
            } else if(this.getSaldo()<0) {
                System.out.println("Não podemos fechar sua conta pois você "
                        + "ainda possui dividas!");
            } else {
                System.out.println("Conta fechada com sucesso!");
            }
        } else {
            System.out.println("Não podemos fechar a conta pois não existe "
                    + "uma conta aberta!");
        }
    }
    /*public void fecharConta(){
        if(this.status==false){
            System.out.println("Não podemos fechar a conta pois não exise "
                    + "uma conta aberta!");
        } else if(this.saldo!=0){
            System.out.println("Não podemos fechar a conta pois ainda a saldo "
                    + "disponivel!");
        } else {
            System.out.println("Conta fechada com sucesso!");
            this.status = false;
        }
    }*/
    
    public void depositar(float dinheiro){
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + dinheiro);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Não podemos depositar o dinheiro pois "
                    + "não a uma conta aberta!");
        }
    }
    
    /*public void depositar(float dinheiro){
        if(this.status==false){
            System.out.println("Não podemos depositar o dinheiro pois não "
                    + "existe uma conta aberta!");
        } else {
            System.out.println("Deposito feito com sucesso!");
            this.saldo += dinheiro;
        }
    }*/
    
    public void sacar(float dinheiro){
        if (this.isStatus()) {
            if (this.getSaldo()<dinheiro) {
                System.out.println("Não foi possivel sacar o dinheiro pois "
                        + "não a este valor dinponivel em conta!");
            } else {
                this.setSaldo(this.getSaldo() - dinheiro);
                System.out.println("Saque realizado com sucesso!");
            }
        } else {
            System.out.println("Não podemos sacar o dinheiro pois "
                    + "não a uma conta aberta!");
        }
    }
    
    /*public void sacar(float dinheiro){
        if(this.status==false){
            System.out.println("Não podemos sacar o dinheiro pois não "
                    + "existe uma conta aberta!");
        } else if(this.saldo<dinheiro){
            System.out.println("Não podemos sacar porque não a este valor "
                    + "disponivel em conta!");
        } else {
            System.out.println("Saque realizado com sucesso!");
            this.saldo -= dinheiro; -= Funciona perfeitamente
        }
    }*/
    
    public void pagarMensal(){
        float mensal;
        if(this.getTipo().equals("CC")){
            mensal = 12;
        } else {
            mensal = 20;
        }
        
        if (this.isStatus()) {
            if(this.getSaldo()<mensal){
                System.out.println("Não foi possivel pagar o valor mensal "
                        + "pois não a saldo o suficinete na conta!");
            }else{
                this.setSaldo(this.getSaldo() - mensal);
                System.out.println("Valor Mensal pago com sucesso!");
            }
        } else {
            System.out.println("Não foi possivel pagar o valor mensal pois "
                    + "não a uma conta aberta!");
        }
    }
    
    /*public void pagarMensal(){
        if(this.status==false){
            System.out.println("Não foi possivel para o valor mensal pois não "
                    + "existe uma conta aberta!");
        } else if(this.tipo.equals("CC")){
            if(this.saldo<12){
            System.out.println("Não foi possivel para o valor mensal pois não a "
                    + "este valor disponivel em conta!");
            } else {
            System.out.println("Valor mensal pago com sucesso!");
            this.saldo -= 12;
            }
        } else {
            if(this.saldo<20){
            System.out.println("Não foi possivel para o valor mensal pois não a "
                    + "este valor disponivel em conta!");
            } else {
            System.out.println("Valor mensal pago com sucesso!");
            this.saldo -= 20;
            }
        }
    }*/

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
