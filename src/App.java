 
 // Hélio Cassimiro de Souza Neto
 // Matrícula: 1261940735
 
 public class App {

 public static void somarArray(int numeros []){
   
   int soma = 0;

   for (int num : numeros) {
   soma = soma + num;   
   }

    System.out.println("Soma: " + soma);
    
   }

     public static void main(String[] args) throws Exception {

        int num [] = {10, 43, 443, 67};
        somarArray(num);
        
     }
 }
