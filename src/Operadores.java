package src;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        if (a == b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }
        System.out.println(resultado);

        // TERNÁRIO
        a = 6;
        b = 6;
        String resultado2 = a == b ? "true" : "false";
        System.out.println(resultado2);
    }
}
