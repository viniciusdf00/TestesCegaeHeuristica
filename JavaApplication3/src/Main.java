import espacoDeEstados.*;
import java.util.Scanner;
import estrategiasDeBusca.cega.BuscaEmLargura;
import estrategiasDeBusca.cega.BuscaEmProfundidade;
import estrategiasDeBusca.cega.BuscaEmProfundidadeLimitada;
import estrategiasDeBusca.heuristica.*;

    


        
public class Main {

	@SuppressWarnings("rawtypes")
	
        static Scanner menu = new Scanner (System.in);
public static void MenuInicial(){
        System.out.println("\tEscolha o método");
        System.out.println("0. Fim");
        System.out.println("1. Busca Cega");
        System.out.println("2. Busca Heuristica");
        System.out.println("Opcao:");     
}

public static void MenuBuscaCega(){
        System.out.println("\tBusca Cega");
        System.out.println("0. Fim");
        System.out.println("1. Busca em Larguda");
        System.out.println("2. Busca em Profundidade");
        System.out.println("3. Busca em Profundidade Limitada");
        System.out.println("Opcao:");     
}

public static void MenuBuscaHeuristica(){
        System.out.println("\tBusca Heuristica");
        System.out.println("0. Fim");
        System.out.println("1. Astar");
        System.out.println("2. BestFirst");
        System.out.println("3. BranchAndBound");
        System.out.println("4. HillClimbing");
        System.out.println("Opcao:");     
}

        public static void main(String[] args) {
            
            /* int opcao = 0;
             
            do{
                MenuInicial();
                int opcao = menu.nextInt();
                 switch (opcao) { 
        case 1:
            

        case 2:
            
            
        case 3:
            

        default:
            
                 }
            }while(false);
            */
             
        
            
                    
            
            //char[] cfgIni = {'2',' ','3','1','4','6','7','5','8'};
            //char[] cfgIni = {'1','4','3','7','2','6','5',' ','8'};
            char[] cfgIni = {'2','3',' ','7','4','1','5','8','6'};
            //char[] cfgIni = {'7','2','3','4',' ','1','5','8','6'}; // OutOfMemory
            
            Puzzle8 puzzleInicial = new Puzzle8();
            puzzleInicial.setEstado(cfgIni);
            puzzleInicial.setCusto(0);
            puzzleInicial.setAvaliacao( puzzleInicial.heuristica(Puzzle8.TABULEIRO_ORGANIZADO) );
            
            Puzzle8 puzzleFinal = new Puzzle8();
            puzzleFinal.setEstado( Puzzle8.TABULEIRO_ORGANIZADO );
            puzzleFinal.setCusto(0);
            puzzleFinal.setAvaliacao(0);
            
            char[] cfgIni2 = {'2',' ','3','1','4','6','7','5','8'};
            //char[] cfgIni2 = {'2','4','3','7','1','6','5',' ','8'};
            //char[] cfgIni2 = {'2','3',' ','7','4','1','5','8','6'};
            //char[] cfgIni2 = {'7','2','3','4',' ','1','5','8','6'}; // OutOfMemory
            
            Puzzle8 puzzleInicial2 = new Puzzle8();
            puzzleInicial2.setEstado(cfgIni2);
            puzzleInicial2.setCusto(0);
            puzzleInicial2.setAvaliacao( puzzleInicial.heuristica(Puzzle8.TABULEIRO_ORGANIZADO) );
            
            Puzzle8 puzzleFinal2 = new Puzzle8();
            puzzleFinal2.setEstado( Puzzle8.TABULEIRO_ORGANIZADO );
            puzzleFinal2.setCusto(0);
            puzzleFinal2.setAvaliacao(0);
            
            /*BuscaInformada busca = new BestFirst();
            busca.setInicio(puzzleInicial);
            busca.setObjetivo(puzzleFinal);
            busca.buscar();
            for(Estado e : busca.getCaminhoSolucao()) {
            System.out.println(e);
            }
            
            BuscaInformada busca2 = new BestFirst();
            busca2.setInicio(puzzleInicial2);
            busca2.setObjetivo(puzzleFinal2);
            busca2.buscar();
            for(Estado r : busca2.getCaminhoSolucao()) {
            System.out.println(r);
            }*/
        
            
            
            
            BuscaEmLargura busca = new BuscaEmLargura();
            busca.setInicio(puzzleInicial);
            busca.setObjetivo(puzzleFinal);
            busca.buscar();
            for(Estado r : busca.getCaminhoSolucao()) {
                System.out.println(r);
            }
            
            BuscaEmLargura busca2 = new BuscaEmLargura();
            busca2.setInicio(puzzleInicial2);
            busca2.setObjetivo(puzzleFinal2);
            busca2.buscar();
            for(Estado r : busca2.getCaminhoSolucao()) {
                System.out.println(r);
            }
            
            
            
            
            /* BuscaEmProfundidade busca = new BuscaEmProfundidade();
            busca.setInicio(puzzleInicial);
            busca.setObjetivo(puzzleFinal);
            busca.buscar();
            for(Estado e : busca.getCaminhoSolucao()) {
            System.out.println(e);
            }
            
            BuscaEmProfundidade busca2 = new BuscaEmProfundidade();
            busca2.setInicio(puzzleInicial2);
            busca2.setObjetivo(puzzleFinal2);
            busca2.buscar();
            for(Estado e : busca2.getCaminhoSolucao()) {
            System.out.println(e);
            }
            
            
            BuscaEmProfundidadeLimitada busca = new BuscaEmProfundidadeLimitada();
            busca.setInicio(puzzleInicial);
            busca.setObjetivo(puzzleFinal);
            busca.buscar();
            for(Estado e : busca.getCaminhoSolucao()) {
            System.out.println(e);
            }
            
            BuscaEmProfundidadeLimitada busca2 = new BuscaEmProfundidadeLimitada();
            busca2.setInicio(puzzleInicial);
            busca2.setObjetivo(puzzleFinal);
            busca2.buscar();
            for(Estado e : busca2.getCaminhoSolucao()) {
            System.out.println(e);
            }*/
            
            
            
            System.exit(0);
                }
	}
            


