package Aula4;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// Aula 4 da univesp referente a Programação orientada a objetos com Java.
// Collections - Deixar a lista ordenada.

public class CollectionsUnivesp {

    private static final String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};

    public void printElements()
    {
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s\n", list);
        Collections.sort(list);
        System.out.printf("Sorted array elements: %s\n", list);

    }

    public static void main(String[] args) {

        CollectionsUnivesp sort1 = new CollectionsUnivesp();
        sort1.printElements();

    }

}




