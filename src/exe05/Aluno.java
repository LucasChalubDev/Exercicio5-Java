package exe05;
import java.util.Scanner;

public class Aluno {
    String nome;
    int matricula;
    int periodo;
    double coeficiente;
    
    void receberDados (){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome:");
        nome = scan.nextLine();
        
        System.out.println("Digite o numero da matricula:");
        matricula = scan.nextInt();
        
        System.out.println("Digite o periodo:");
        periodo = scan.nextInt(); 
        
        System.out.println("Digite o coeficiente médio:");
        coeficiente = scan.nextDouble();
    } 
    
    void imprimirDados (){
        System.out.println ("Nome do Aluno: " + nome); 
        System.out.println ("Numero da Matricula: " + matricula);       
        System.out.println ("Periodo em que Estuda: " + periodo); 
        System.out.println ("Coeficiente Medio: " + coeficiente);
    }
    
}
