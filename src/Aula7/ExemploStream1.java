package Aula7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Este código demonstra como gravar e ler dados binários em um arquivo usando FileOutputStream e FileInputStream.
// A função 'gravador()' grava um array de bytes (representando os caracteres A-F) em um arquivo de texto.
// A função 'leitor()' lê o arquivo byte a byte e imprime os valores dos bytes na saída.

//saida:
//Dados gravados com sucesso!
//        65
//        66
//        67
//        68
//        69
//        70

//dados salvos no arquivo txt:
//ABCDEF

public class ExemploStream1 {

    public static void main(String[] args) {
        gravador();
        leitor();
    }

    private  static void gravador()
    {
        byte[] dados = {65, 66, 67 ,68, 69, 70};
        try (FileOutputStream gravador = new FileOutputStream("D://Documentos//Estudos//Univesp//Java-study//stream.txt"))
        {
            gravador.write(dados);
            System.out.println("Dados gravados com sucesso!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void leitor()
    {
        try (FileInputStream leitor = new FileInputStream("D://Documentos//Estudos//Univesp//Java-study//stream.txt"))
        {
            int leitura;
            while ((leitura = leitor.read()) != -1)
            {
                byte b = (byte) leitura;
                System.out.println(" " + b);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
