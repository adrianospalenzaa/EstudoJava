import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World "); // print não quebra linha
        System.out.println("Bom dia");  // println quebra linha
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        int valor = 551;  // declaração de variável inteira
        double valor2 = 5.56854;  // declaração de variável double
        System.out.println(valor);  // printa o valor da variável
        System.out.println(valor2);  // printa o valor da variável
        Locale.setDefault(Locale.US);  // define o local para US para trocar "," por "."
        System.out.printf("%.2f%n", valor2);  // printa o valor da variável com 2 casas decimais
        System.out.println ("RESULTADO = " + valor2 + " METROS");
        // printa o valor da variável com texto e concatena com os demais nomes
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        // "MARCADORES DE VARIAVEIS" %s = string, %d = inteiro, %f = double, %n = quebra de linha
    }
}