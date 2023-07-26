package com.structural.composite.fileSystem;

public class App {
    public static void main(String[] args) {
        Composite dir = new Composite("Main");
        Leaf file = new Leaf("abc.pdf");
        dir.add(file);
        dir.ls(0);
        Composite movies = new Composite("Movies");
        dir.add(movies);
        movies.add(new Leaf("Krish_FullHD.mkv"));
        System.out.println();
        movies.ls(0);
        System.out.println();
        dir.ls(0);
    }
}
