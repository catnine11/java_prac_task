package com.edu.level02.normal;

public class Application_Result {
    public static void main(String[] args) {
        System.out.println(RandomMaker.randomNumber(-100, 100));

        String alphabet = RandomMaker.randomUpperAlpabet(10);
        System.out.println(alphabet);

        String rps = RandomMaker.rockPaperScissors();
        System.out.println(rps);

        System.out.println(RandomMaker.tossCoin());

    }
}
