package src;

public class TiposVariaveis {
    public static void main(String[] args) {
        //tipos primitivos
        //estudem a classe String que representa texto na aplicação

        String meuNome = "SERGIO CAMPOS";
        System.out.println("Nome: " + meuNome);

        double salarioMinino = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}
