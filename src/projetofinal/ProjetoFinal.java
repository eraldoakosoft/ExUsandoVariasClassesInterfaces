package projetofinal;
/**
 *ESSE É PPROJETO FINAL DO CURSO DE POO COM JAVA,
 * É UM EXEMPLO BEM SIMPLES DO YOUTUBE
 * @author eraldo
 */
public class ProjetoFinal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula de Python");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("JOSÉ", 21, "M", "ESP");
        g[1] = new Gafanhoto("Bruna", 19, "F", "Bruninha");
        
        System.out.println( g[0].toString());
        
        
        System.out.println(v[0].toString());
        
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[1].toString());
        
        
        
    }
    
}
