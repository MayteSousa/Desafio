import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner  leitor = new Scanner(System.in);
        String senha=" ";
        int tamanho, qtdnum, qtdesp = 0, qtdmin = 0, qtdmai = 0;

        do {
            tamanho = 0; qtdnum = 0; qtdesp = 0; qtdmin = 0; qtdmai = 0;

            System.out.println("Digite a senha: ");
            senha = leitor.nextLine();
    
            tamanho = senha.length();
    
            //verificar se Possui no mínimo 6 caracteres.
            if( tamanho >= 6 ){
                for (int i = 0; i < tamanho; i++){                                    
                    
                    //verificar se Contém no mínimo 1 digito.
                    if ((senha.charAt(i) >= '0') && (senha.charAt(i) <= '9'))
                        qtdnum++;
    
                    else{
    
                        //verificar se Contém no mínimo 1 letra em minúsculo.
                        if ((senha.charAt(i) >= 'a') && (senha.charAt(i) <= 'z'))                    
                            qtdmin++;
                            
                        else{
                            //verificar se Contém no mínimo 1 letra em maiúsculo.
                            if ((senha.charAt(i) >= 'A') && (senha.charAt(i) <= 'Z'))
                                qtdmai++;  
                            else{ 
                                if ((senha.charAt(i) == '!' )|| (senha.charAt(i) == '@') || (senha.charAt(i) == '#' ) || 
                                (senha.charAt(i) == '$' ) || (senha.charAt(i) == '%' ) || (senha.charAt(i) == '^' ) || 
                                (senha.charAt(i) == '&' ) || (senha.charAt(i) == '*' ) || (senha.charAt(i) == '(' ) || 
                                (senha.charAt(i) == ')' ) || (senha.charAt(i) == '-') || (senha.charAt(i) == '+' ) ){
    
                                }
                                qtdesp++;
                            }                          
                        }
                    }
                }  
                
                if ( (qtdnum > 0) && (qtdmin > 0) && (qtdmai > 0) && (qtdesp > 0 ) ) {
                    System.out.println("Senha Segura " +qtdnum +", " + qtdmin + ", " + qtdmai + ", " + qtdesp + ", " + tamanho);
                } else {
                    if ( qtdnum == 0 ) {
                        System.out.println("Inclua ao menos 1 digito em sua senha: ");
                    }
                    else{
                        if ( qtdmin == 0 ) {
                            System.out.println("Inclua ao menos 1 caracter minusculo em sua senha: ");
                        }
                        else{
                            if ( qtdmai == 0 ) {
                                System.out.println("Inclua ao menos 1 caracter maiusculo em sua senha: ");
                            }
                            else{
                                if ( qtdesp == 0 ){
                                    System.out.println("Inclua ao menos 1 caracter especial em sua senha: ");
                                }
                            }
                        }                            
                    }
                }
            }
            else{
                System.out.println("Verifique a senha digitada, faltam " + (6 - tamanho) + " caracteres");
            }
    
        } while (( (qtdnum <= 0) || (qtdmin <= 0) || (qtdmai <= 0) || (qtdesp <= 0 ) || ( tamanho <= 6 )));

    }
}
