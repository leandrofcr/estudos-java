package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        /* - para usar listas é necessario usar wrapper classes ao inves de tipos primitivos, como int por exemplo
         * - para instanciar um tipo que é interface (como é tipo List) é necesasrio instancia-la com uma classe
         * que implementa esta interface. nesse caso será usado a ArrayList
         */

        List<String> list = new ArrayList<>();

        // OPERACOES COM LISTA

        //ADD

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Anna");
        list.add("John");

        list.add(2, "Marco");  // adiciona o elemento na posicao indicada, movendo os demais item da lista


        for (String item : list) {
            System.out.println(item);
        }

        System.out.println(list.size());
        System.out.println("---------------------");

        // REMOVE
        list.remove("Anna"); // remove o primeiro elementro encontrado
        //  list.remove(3);

        // remover de acordo com determinada condicao:

        list.removeIf(x -> x.charAt(0) == 'M'); //funcao lambda predicado

        for (String item : list) {
            System.out.println(item);
        }

        System.out.println(list.size());

        System.out.println("---------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("ElementThatAreNotInTheList")); // -1


        // FILTER
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        // .stream() permite utilizaro método filter. entretando o método filter retornará um stream que não é
        // compativel com o tipo List sendo necessário então, converte-lo de volta utilizando o método .toLost()

        System.out.println(result);

        // "FIND"
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        String name2 = list.stream().filter(x -> x.charAt(0) == 'W').findFirst().orElse(null);

        // o método orElse(null) retorna um null se o nada for encontrado no findFirst()

        System.out.println(name);
        System.out.println(name2);
    }
}
