import java.util.Scanner;  // importa a classe Scanner para ler dados do teclado

public class EntadaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // instancia a classe Scanner
        System.out.println("Digite um valor: ");
        double x = sc.nextDouble();  // lê o valor digitado
        System.out.println("voce digitou: " + x);

        //--------------Para ler primeiro caracter do texto-------------------
        System.out.println("Digite uma palavra: ");
        char p =sc.next().charAt(0);  // lê o primeiro caracter da palavra digitada
        System.out.println("voce digitou: " + p);

        //--------------Para ler vários dados na mesma linha-------------------
        String s1, s2, s3;  // declaração de variáveis
        sc.nextLine();  // limpa o buffer de memória
        s1 = sc.nextLine();
        s2 = sc.nextLine(); //dados deve ser digitados na mesma linha separados por espaço
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();  // fecha a classe Scanner



    }
}

//• Scanner  -> ler o valor digitado pelo usuário
//• next()    -> lê a primeira palavra antes do espaço
//• nextInt() -> lê o valor inteiro digitado
//• nextDouble() -> lê o valor double digitado
//• next().charAt(0) -> lê o primeiro caracter da palavra digitada
//• Locale -> define o local para US para trocar "," por "."
//• Como ler até a quebra de linha (nextLine())
//• nextLine() -> lê a linha inteira
//• como limpar o buffer de leitura (sc.nextLine())
