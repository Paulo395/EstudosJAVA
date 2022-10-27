/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Random;

/**
 *
 * @author pauli
 */
public class Lutar {
    //RELACIONAMENTO DE AGREGAÇÃO!
    private Lutador desafiado; 
    private Lutador desafiante;
    
    Random aleatorio = new Random();
    private int raunds;
    private boolean aprovada;
    
    //MÉTODOS
    public void marcarLuta(Lutador l1,Lutador l2){
        /*
        
        NÃO TEM GETTER E SETTER PARA VARIAVEL DO TIPO ABSTRATO!? TEM
        
        if (!this.getDesafiado().equals(this.getDesafiante())) {
            System.out.println("A luta está marcada!\n");
            this.setAprovada(true);
        } else {
            System.out.println("Não foi possível marcar a luta pois "
                    + "os participantes são iguais!\n");
        }
        */
        if(l1.getCategoria().equals(l2.getCategoria())){
            if (!l1.getNome().equals(l2.getNome())) {
                System.out.println("A luta está marcada!\n");
                this.setAprovada(true);
                this.setDesafiado(l1);
                this.setDesafiante(l2);
            } else {
                System.out.println("Não foi possivel marcar a luta pois "
                        + "foi cadastrado o mesmo lutador!\n");
                this.setAprovada(true);
            }
        } else {
            System.out.println("Não foi possivel marcar a luta pois os "
                    + "lutadores não são da mesma categoria!\n");
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    
    public void lutar(){
        if (this.isAprovada()) {
            System.out.println("Senhoras e senhores, bem vindos ao UEF!\n\n!"
                    + "##### DESAFIADO! #####");
            this.desafiado.apresentar();
            System.out.println("##### DESAFIANTE! #####");
            this.desafiante.apresentar();
            System.out.println("LUTEM!!");
            
            this.setRaunds(aleatorio.nextInt(3));
            /*
            METODOS GANHAR, PERDER E EMPATAR FORAM DEFINIDOS NO LUTADOR!
            if (this.getRaunds()==0) {
                System.out.println("Deu Empate!!!");
                this.desafiado.setEmpates(this.desafiado.getEmpates() + 1);
                this.desafiante.setEmpates(this.desafiante.getEmpates() + 1);
            } else if(this.getRaunds()==1){
                System.out.println(this.desafiado.getNome() + 
                        " Ganhou a disputa!!");
                this.desafiado.setVitorias(this.desafiado.getVitorias() + 1);
                this.desafiante.setDerrotas(this.desafiante.getDerrotas() + 1);
            } else {
                System.out.println(this.desafiante.getNome() + 
                        " Ganhou a disputa!!");
                this.desafiante.setVitorias(this.desafiante.getVitorias() + 1);
                this.desafiado.setDerrotas(this.desafiado.getDerrotas() + 1);
            }
        } else {
            System.out.println("A luta não foi aprovada!\n");
        }*/
            
            //SWITCH É MAIS SOFISTICADO!
            System.out.println("====== RESULTADOS =======");
            switch(this.getRaunds()){
                case 0:
                    System.out.println("Deu Empate!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado.getNome() + 
                        " Ganhou a disputa!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante.getNome() + 
                        " Ganhou a disputa!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("<><><><><><><><><><><><>><><><><><>");
        }     
    }
    
    //MéTODOS ESPECIAIS
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRaunds() {
        return raunds;
    }

    public void setRaunds(int raunds) {
        this.raunds = raunds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
