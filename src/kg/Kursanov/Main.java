package kg.Kursanov;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //TODO Consumer - бул метод  List тердеги маалыматты консольго  чыгарып берет.Параметрине 1 аргумент алат void accept(T t)


//        List<String> list = List.of("Sadyr","Putin","Shawkat","Joxa");
//
//        Consumer<String> consumer = (lists) -> System.out.println(lists);
//
//        list.forEach(consumer);
//

        // TODO biConsumer - бул метод параметирине  2 аргумент алып аларды конкатцинация кылып чыгарып   void accept(T t,U u)
//        BiConsumer<String, String> concatenate = (str1, str2) -> {
//            String result = str1 + str2;
//            System.out.println("Concatenated string: " + result);
//        };
//
//        concatenate.accept("Hello, ", "World!");


        // TODO Supplier - бул  метод  параметрине эч нерсе албайт гет методу аркылуу берилген  маалыматтагы  маанини кайтарып берет мисалы рандом

//        Supplier<Integer> supplier = () ->{
//            Random random = new Random();
//            return random.nextInt(100);
//        };
//        int randomNumber = supplier.get();
//        System.out.println("Random san: " + randomNumber);


        //TODO Predicate - бул  метод  true же false кайтарат дагы шартка жараша иштеп берет

//        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "C++", "Ruby");
//
//        Predicate<String> predicate = str -> str.length() > 4;
//
//        System.out.println("Языки программирования с длиной имени больше 4:");
//
//        for (String language : languages) {
//            if (predicate.test(language)){
//                System.out.println(language);
//            }
//        }

        //TODO biPredicate - бул  метод Predicate ке окошош болгону  параметрине  2  аргумент алат жана аларды  салышытырып логикага  жараша иштеп берет

//        BiPredicate<Integer, Integer> isGreater = (num1, num2) -> num1 > num2;
//
//        int number1 = 10;
//        int number2 = 5;
//        boolean result = isGreater.test(number1, number2);
//
//        System.out.println(number1 + " чонбу экинчи сандан  " + number2 + " ? " + result);

        //TODO Function бул  метод параметрине  1 T алып  аны R кылып кайтарып  берет.Мисалы toApperCase

//        Function<String, String> toUpperCase = str -> str.toUpperCase();
//
//        String inputString = "hello world";
//        String result = toUpperCase.apply(inputString);
//
//        System.out.println(result);

        //TODO biFunction - бул метод  параметрине 2  аргумент кабыл  алат(T t,U u)  жана R кайтарат

//        BiFunction<String,String,String> mergeString = (str1, str2) -> str1 + "|" + str2;
//
//        String res = mergeString.apply("Hello","World");
//
//        System.out.println(res);


    }









}