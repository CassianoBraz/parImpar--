/*Programe um método que receba como parâmetro um número inteiro, 
e retorne uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
Exemplo:
String mensagemRetorno = testaNumero(9);
Neste caso, a variável mensagemRetorno receberia o valor "O número é par, e positivo."
*/

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número aleatorio positivo ou negativo: ");
        int valor = read.nextInt();

        if (valor % 2 == 0 && valor >= 0) {
            System.out.println(valor+" número é par, e positivo.");
        }else if (valor % 2 == 0 && valor <= 0) {
            System.out.println(valor+" número é par, e negativo.");
        }else if (valor % 2 != 0 && valor >= 0){
            System.out.println(valor+" número é impar, e positivo.");
        }else{
            System.out.println(valor+" número é impar, e negativo.");
        }
    }
}
