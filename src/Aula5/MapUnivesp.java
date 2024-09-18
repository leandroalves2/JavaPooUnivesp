package Aula5;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


//Este código demonstra o uso de duas estruturas de dados: HashMap e Hashtable.
//Primeira parte: Cria um HashMap com mapeamento de inteiros para nomes, exibe chaves, valores, remove uma entrada e acessa valores por chave.
//Segunda parte: Cria um Hashtable com chaves String e valores String, e exibe todos os pares chave-valor usando um Enumeration.

//HashMap:
//É uma estrutura de dados que implementa a interface Map, armazenando pares chave-valor.
//Permite uma chave ser associada a um valor, e a busca é rápida devido ao uso de hashing.
//Não é sincronizado (não é seguro para múltiplas threads), permite chaves e valores nulos.
//
//Hashtable:
//Também implementa a interface Map e armazena pares chave-valor, mas é sincronizado (seguro para múltiplas threads).
//Não permite chaves ou valores nulos.
//Geralmente é mais lenta que HashMap devido à sincronização, sendo considerada uma versão mais antiga.


public class MapUnivesp {

    public static void main(String[] args) {

        Map<Integer, String> mapNames = new HashMap<Integer, String>();
        mapNames.put(1, "Leandro");
        mapNames.put(2, "Karoline");
        mapNames.put(3, "Luis");
        mapNames.put(4, "Celisa");
        System.out.println(mapNames.keySet());
        System.out.println(mapNames.values());
        mapNames.remove(4);
        System.out.println(mapNames.entrySet());
        System.out.println(mapNames.get(2));
        System.out.println(mapNames.get(4));

        System.out.println("");
        Enumeration names;
        String key;
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("Chave1", "Leandro");
        hashtable.put("Chave2", "Karoline");
        hashtable.put("Chave3", "Luis");
        hashtable.put("Chave4", "Celisa");
        names = hashtable.keys();
        while(names.hasMoreElements()){
            key = (String) names.nextElement();
            System.out.println("Chave: " + key + "& Valor: " + hashtable.get(key));
        }
    }

}
