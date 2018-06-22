/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiago
 */
public class Tarefa {
    
    private String nome;
    private int tempoExecucao;
    private int quantum;

    public Tarefa(String nome, int tempoExecucao, int quantum) {
        this.nome = nome;
        this.tempoExecucao = tempoExecucao;
        this.quantum = quantum;
    }
        
    public void Executar(){
        
        for (int i = 0; i < this.quantum; i++) {
            
            if(!TerminouAExecucao()){
                tempoExecucao--;
                System.out.println("Nome: "+ this.nome + " | TempoRestante: " +tempoExecucao);
                Dormir();
            }
        }
        
    }

    public boolean TerminouAExecucao(){
        return (tempoExecucao == 0);
    }
    
    private void Dormir() {
        try {
            Thread.sleep(700);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
