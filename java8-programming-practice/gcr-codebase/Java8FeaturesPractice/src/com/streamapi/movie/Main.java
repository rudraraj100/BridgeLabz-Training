package com.streamapi.movie;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Movie> list = new ArrayList<>();

        list.add(new Movie("Inception", 8.8, 2010));
        list.add(new Movie("Dune", 8.2, 2021));
        list.add(new Movie("Oppenheimer", 8.9, 2023));
        list.add(new Movie("Avengers Endgame", 8.4, 2019));
        list.add(new Movie("Joker", 8.5, 2019));
        list.add(new Movie("John Wick 4", 8.3, 2023));
        list.add(new Movie("The Batman", 7.9, 2022));
        list.add(new Movie("Top Gun Maverick", 8.3, 2022));

        System.out.println("Top 5 Trending Movies:");

        list.stream()
            .filter(m -> m.getReleaseYear() >= 2020) // recent movies
            .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
            .limit(5)
            .forEach(System.out::println);
    }
}