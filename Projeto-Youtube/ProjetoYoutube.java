package projetoyoutube;

public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("O Exorcista");
        v[1] = new Video("Zodíaco");
        v[2] = new Video("Seven: Os Sete Pecados Capitais");
        
        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Rafael",23,"M","rafa");
        a[1] = new Aluno("Maria",24,"F","maria");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0]=new Visualizacao(a[0],v[0]);///Rafael assiste o exorcista
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1]=new Visualizacao(a[0],v[1]);///Rafael assiste o Zodíaco
        vis[0].avaliar(35.0f);
        System.out.println(vis[1].toString() );
        
        
        /*System.out.println("VÍDEOS\n---------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nALUNOS\n---------------------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());*/
        
    
    }
    
}
