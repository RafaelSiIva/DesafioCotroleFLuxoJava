import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        }catch (ParametrosInvalidosException exception) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("Parametro um é mair que o parametro dois");
        }else{
            int contagem = parametroDois - parametroUm;
            for(int i=0; i<contagem;i++){
                System.out.println(i+1);
            }
        }
    }
}
class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
}
