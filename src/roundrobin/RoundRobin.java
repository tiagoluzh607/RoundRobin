/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roundrobin;

import Model.Tarefa;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class RoundRobin {

    /**
     * Roda um sistema simulando um round-robin
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Tarefa> tarefas = new ArrayList();
        
        
        Tarefa escovarOsDentes = new Tarefa("escovarOsDentes",11, 2);
        Tarefa jogarZelda = new Tarefa("jogarZelda",20, 2);
        Tarefa escutandoRock = new Tarefa("escutandoRock",20, 4);
        Tarefa fechandoUmaMarmita = new Tarefa("fechandoUmaMarmita",20, 8);
        
        tarefas.add(escovarOsDentes);
        tarefas.add(jogarZelda);
        tarefas.add(escutandoRock);
        tarefas.add(fechandoUmaMarmita);
        
        while(!TerminouAExecucaoDeTodasAsTarefas(tarefas)){
            for (Tarefa tarefa : tarefas) {
                tarefa.Executar();
                System.out.println("--------------------------------------------------------------");
            }
        }
        
            
    }
    
    /**
     * Verifica se todas as tarefas terminaram sua execução
     * @param tarefas recebe como parâmetro uma lista de tarefas para verificar se já executaram
     * @return 
     */
    private static boolean TerminouAExecucaoDeTodasAsTarefas(ArrayList<Tarefa> tarefas){
        
        for (Tarefa tarefa : tarefas) {
            if(!tarefa.TerminouAExecucao()){
                return false;
            }
        }
        
        return true;
        
    }
    
}
