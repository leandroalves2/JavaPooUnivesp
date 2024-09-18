package Aula7;

import java.nio.*;

// Este código demonstra o uso do ByteBuffer em Java, uma classe para manipulação de buffers de bytes.
// Ele cria um ByteBuffer, adiciona valores, e depois lê os valores usando duas abordagens (loop com hasRemaining e array).
// Também cria um segundo ByteBuffer para armazenar uma string e lê o conteúdo, além de utilizar o CharBuffer para manipular texto diretamente no buffer.


public class BufferUnivesp {

        public static void main(String[] args) {

            ByteBuffer buffer = ByteBuffer.allocate(20);
            System.out.println("O Bytebuffer foi criado");

            System.out.println("Propriedades após a criação: ");
            System.out.println("Capacidade: " + buffer.capacity());
            System.out.println("Limite: " + buffer.limit());
            System.out.println("Posição atual: " + buffer.position());

            System.out.println();
            System.out.println("Adicionando valores ao buffer: ");
            buffer.put((byte) 2);
            buffer.put((byte) 47);
            buffer.putInt(56);

            System.out.println();
            System.out.println("Apos inserir os valores: ");
            System.out.println("Capacidade: " + buffer.capacity());
            System.out.println("Limite: " + buffer.limit());
            System.out.println("Posição atual: " + buffer.position());

            System.out.println();
            buffer.position(0);
            System.out.println("Primeira forma de leitura: ");
            while (buffer.hasRemaining()) {
                System.out.println(buffer.get() + " ");
            }

            System.out.println();
            System.out.println("Segunda forma de leitura: ");
            byte array[] = buffer.array();
            for (int n : array) {
                System.out.println(n + " ");
            }

            System.out.println();
            String mensagem = "Estou conhecendo o Bytebuffer";
            ByteBuffer buffer2 = null;
            buffer2 = ByteBuffer.wrap(mensagem.getBytes());
            System.out.println("Segundo Bytebuffer: ");
            System.out.println("Capacidade: " + buffer2.capacity());
            System.out.println("Limite: " + buffer2.limit());
            System.out.println("Posição atual: " + buffer2.position());

            System.out.println();
            System.out.println("Lendo o segundo buffer: ");
            while (buffer2.hasRemaining()) {
                System.out.println(buffer2.get() + " ");
            }

            buffer.position(10);
            buffer.putInt(11);
            buffer.putInt(65);

            System.out.println();
            System.out.println("int na posição 10: " + buffer.getInt(10));
            System.out.println("int na posição 14: " + buffer.getInt(14));

            System.out.println();
            buffer.position(0);

            System.out.println("Conteudo final do buffer: ");
            while (buffer.hasRemaining()) {
                System.out.println(buffer.get() + " ");
            }
            System.out.println();
            System.out.println();

            buffer = ByteBuffer.allocateDirect(100);
            CharBuffer textoBuffer = buffer.asCharBuffer();
            textoBuffer.put("Um texto de exemplo.");

            textoBuffer.position(0);
            System.out.print("String: ");
            while (textoBuffer.hasRemaining()) {
                System.out.print(textoBuffer.get());
            }
            System.out.println();

        }

}
