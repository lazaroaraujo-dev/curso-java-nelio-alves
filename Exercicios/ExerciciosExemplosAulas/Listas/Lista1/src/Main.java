import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("João");
        list.add("Maria");
        list.add("Pé de feijão");
        list.add("Joaninha");
        list.add(2, "Marco");
        list.add("Anna");
        list.add("Andrey");

        for (String name : list){
            System.out.println(name);
        }

        System.out.println(list.size());

        System.out.println("----------------");

        list.remove(2);
        list.remove("Maria");
        list.removeIf(x -> x.charAt(0)=='J');
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("Index of Marco: "+list.indexOf("Marco"));
        System.out.println("------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());


        for (String resultado : result){
            System.out.println(resultado);
        }
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("---------------");
        System.out.println(name);
    }
}