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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Tarefa> tarefas = new ArrayList();
        
        
        Tarefa escovarOsDentes = new Tarefa("escovarOsDentes",10, 2);
        tarefas.add(escovarOsDentes);
        
        
        while(escovarOsDentes.getTempoExecucao() > 0){
            for (Tarefa tarefa : tarefas) {
                tarefa.Executar();
            }
        }
        
            
    }
    
}
