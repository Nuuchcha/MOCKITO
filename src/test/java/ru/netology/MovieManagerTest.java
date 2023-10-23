package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    //MovieManager movie = new MovieManager();


    @Test
    public void shouldBeEmptyArray(){
        MovieManager movie = new MovieManager();

        String[] actual = movie.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldBeOneMovie() {
        MovieManager movie = new MovieManager();

        movie.add("Film1");

        String[] actual = movie.findAll();
        String[] expected = {"Film1"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldBeManyMovie() {
        MovieManager movie = new MovieManager();

        movie.add("Film1");
        movie.add("Film2");
        movie.add("Film3");

        String[] actual = movie.findAll();
        String[] expected = {"Film1", "Film2", "Film3"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLastThree() {
        MovieManager movie = new MovieManager(4);

        movie.add("Film1");
        movie.add("Film2");
        movie.add("Film3");

        String[] actual = movie.findLast();
        String[] expected = {"Film3", "Film2", "Film1"};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLastFour() {

        MovieManager movie = new MovieManager(4);

        movie.add("Film1");
        movie.add("Film2");
        movie.add("Film3");
        movie.add("Film4");
        movie.add("Film5");

        String[] actual = movie.findLast();
        String[] expected = {"Film5", "Film4", "Film3", "Film2"};
        Assertions.assertArrayEquals(actual, expected);
    }
}
