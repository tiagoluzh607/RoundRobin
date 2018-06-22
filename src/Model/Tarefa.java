/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta classe cria Tarefas do Dia a Dia
 * @author tiago
 */
public class Tarefa {
    
    private String nome;
    private int tempoExecucao;
    private int quantum;

    /**
     * Construtor padrao de uma tarefa
     * @param nome é o nome da tarefa
     * @param tempoExecucao é o tempo de execução que a tarefa demora para terminar
     * @param quantum tempo que o processo é executado de cada vez
     */
    public Tarefa(String nome, int tempoExecucao, int quantum) {
        this.nome = nome;
        this.tempoExecucao = tempoExecucao;
        this.quantum = quantum;
    }
    
    /**
     * Método Responsavel por faze a Execução da tarefa conforme o tempo de quantum
     */
    public void Executar(){
        
        for (int i = 0; i < this.quantum; i++) {
            
            if(!TerminouAExecucao()){
                tempoExecucao--;
                System.out.println("Nome: "+ this.nome + " | TempoRestante: " +tempoExecucao);
                Dormir();
            }
        }
        
    }

    /**
     * Método responsavel por verificar se a execucao da tarefa já acabou
     * @return 
     */
    public boolean TerminouAExecucao(){
        return (tempoExecucao == 0);
    }
    
    /**
     * faz o processamento dormir um pouco
     */
    private void Dormir() {
        try {
            Thread.sleep(700);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
