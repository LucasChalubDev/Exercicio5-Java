package exe05;

public class BDAluno {
    Aluno BD[];
    int armazenados;
    
    void criarBD (int tam){
        BD = new Aluno[tam];
        armazenados = 0;
    }
    
    void armazenar (){
        Aluno a = new Aluno();
        a.receberDados();
        BD[armazenados] = a;
        armazenados++;
    }
    
    void imprimirAluno(int posicao){
        if (posicao > armazenados)
            System.out.println("ERRO!");
        else
            BD[posicao].imprimirDados();
    }
    
    void maiorCoeficiente (){
        int buscarMaior = 0;
        
        for (int i = 0; i < armazenados; i++){
        if(i == 0){
            buscarMaior = i; 
        }else if (BD[buscarMaior].coeficiente < BD[i].coeficiente) {
            buscarMaior = i;
            }
        
        }
        BD[buscarMaior].imprimirDados();
    }
    
    public void mostrarPeriodo (int nPeriodo){
        for (int i = 0; i < armazenados; i++){
            if (BD[i].periodo == nPeriodo){
                BD[i].imprimirDados();
            }
        }
    }  
}
