package Aula4;

public class CompareEqual {

    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b); // true: ambas as referências apontam para o mesmo objeto.
        System.out.println(a == c); // false: 'c' é uma nova instância, diferente de 'a'.
        System.out.println(a.equals(c)); // true: o método equals compara o conteúdo das strings, que é o mesmo.

    }
}
