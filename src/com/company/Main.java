package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Cat {
    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("fdscfdfdf");
        int x = scanner.nextInt();
        //scanner.nextLine()
        System.out.println(x);


        ArrayList<Cat> cats = new ArrayList<>();
        Collections.addAll(cats,
                new Cat("vasya", 1),
                new Cat("petya", 5),
                new Cat("vova", 4));


        /*ArrayList<Cat> filteredCats = (ArrayList<Cat>) cats.stream().filter(cat -> cat.age % 2 != 0).collect(Collectors.toList());

        filteredCats.forEach(cat -> System.out.println(cat));*/

        /*cats.stream().forEach(cat -> cat.age = cat.age + 1);
        cats.forEach(cat -> System.out.println(cat));*/

        /*ArrayList<Integer> ages = (ArrayList<Integer>) cats.stream().filter(cat -> cat.age % 2 != 0).map(cat -> cat.age).collect(Collectors.toList());
        ages.forEach(age -> System.out.println(age));*/

        /*cats.stream().forEach(cat -> {
            if (cat.age % 2 != 0) {
                cat.age *= 2;
            }
        });

        cats.forEach(cat -> System.out.println(cat));*/

        /*ArrayList<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, 1, 3, 5, 6, 7);

        ArrayList<Integer> ints2 = (ArrayList<Integer>) ints.stream().map(item -> item = item * 2).collect(Collectors.toList());

        ints2.forEach(item -> System.out.println(item));*/


        /*ArrayList<Cat> upCats = (ArrayList<Cat>) cats.stream().filter(cat -> cat.age % 2 != 0).collect(Collectors.toList());
        upCats.forEach(cat -> cat.age *= 2);

        ArrayList<Cat> downCats = (ArrayList<Cat>) cats.stream().filter(cat -> cat.age % 2 != 0).collect(Collectors.toList());
        downCats.forEach(cat -> cat.age /= 2);*/

        /*ArrayList<Cat> sortedCats = (ArrayList<Cat>) cats.stream().sorted((o1, o2) -> o2.age - o1.age).collect(Collectors.toList());

        sortedCats.forEach(item -> System.out.println(item));*/

        /*Cat minCat = cats.stream().min(Comparator.comparingInt(item -> item.age)).get();
        System.out.println(minCat);*/

        /*int sumAge = 0;
        sumAge = cats.stream().map(cat -> cat.age).reduce(0, (sum, age) -> sum + age);
        System.out.println(sumAge);*/

        /*boolean exist = cats.stream().anyMatch(cat -> cat.age > 30);
        System.out.println(exist);

       int sum =  cats.stream().mapToInt(value -> value.age).sum();
        System.out.println(sum);*/

        Cat findedCat = cats.stream().peek(cat -> System.out.println("fp "+cat)).filter(cat -> cat.name.equals("vova") == true && cat.age==5).peek(cat -> System.out.println("lp "+cat)).findFirst().orElse(null);
        System.out.println(findedCat);
    }
}
