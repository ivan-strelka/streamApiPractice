package lesson1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) throws IOException {
        List<Integer> integers = List.of(1, 2, 3, 4);

        Integer sumOddOld = 0;
        for (Integer i : integers) {
            if (i % 2 != 0) {
                sumOddOld += i;
            }
        }
        Integer sumOdd = integers.stream().filter(o -> o % 2 != 0).reduce((s1, s2)
                -> s1 + s2).orElse(0);


        //Классический: Создание стрима из коллекции
        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        Stream<String> streamFromCollection = collection.stream();

        //Создание стрима из значений
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");

        //Создание стрима из массива
        String[] array = {"a1", "a2", "a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);

        //Создание стрима из файла (каждая строка в файле будет отдельным элементом в стриме)
        Stream<String> streamFromFiles = Files.lines(Paths.get("file.txt"));

        //Создание стрима из строки
        IntStream streamFromString = "123".chars();

        //С помощью Stream.builder
        Stream.builder().add("a1").add("a2").add("a3").build();

        //Создание параллельного стрима
        Stream<String> stream = collection.parallelStream();

        //Создание бесконечных стрима с помощью Stream.iterate
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 1);

        //Создание бесконечных стрима с помощью Stream.generate
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");

        //Выражение n -> n + 1, это просто аналог выражения Integer func(Integer n) { return n+1;},
        // а выражение () -> «a1» аналог выражения String func() { return «a1»;} обернутых в анонимный класс.


    }

}
