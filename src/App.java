 public class App {

 public static void somarArray(){
 int[] numeros = {10, 20, 30, 40, 50};
   int soma = 0;
    for (int num : numeros){
    soma += num;   
    }

    System.out.println("Soma: " + soma);
    
   }

     public static void main(String[] args) throws Exception {
        somarArray();
        
     }
 }
