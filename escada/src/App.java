import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero, l, c, z=1;        

        Scanner  leitor = new Scanner(System.in);

        System.out.print("Digite número inteiro: ");
        numero = leitor.nextInt();

        String escada[][] = new String[numero][numero];

        //PREENCHE ARRAY COM *
       for (l = 0; l < escada.length; l++) {
           for (c = 0; c < escada.length; c++) {
               (escada[l][c]) = "*";
           }
       }

       //MONTAR A ESCADA
       for ( l = 0; l < escada.length-1; l++) {
            for (  c = 0; c < escada.length-z;c++)
                escada[l][c] = " ";
                z++;
        }
             

       //EXIBIR ESCADA
       for (l = 0; l < escada.length; l++) {
           for ( c = 0; c < escada.length; c++) {
               System.out.print(escada[l][c]);
           }
           System.out.println();
       }       
       
    }
}
