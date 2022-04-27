package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    @Test
    public void add() {
        AfishaManager manager = new AfishaManager();
        String[] films = new String[] {"Movie_1", "Movie_2", "Movie_3", "Movie_4", "Movie_5"};
        manager.setFilms(films);
        manager.add("Movie_6");

        String[] expected = {"Movie_1", "Movie_2", "Movie_3", "Movie_4", "Movie_5", "Movie_6"};
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void add1() {
        AfishaManager manager = new AfishaManager();
        String[] films = new String[] {"Movie_1"};
        manager.setFilms(films);
        manager.add("Movie_6");

        String[] expected = {"Movie_1", "Movie_6"};
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
        AfishaManager manager = new AfishaManager();
        String[] films = new String[] {"Movie_1", "Movie_2", "Movie_3", "Movie_4", "Movie_5"};
        manager.setFilms(films);
        manager.findAll();

        String[] expected = {"Movie_1", "Movie_2", "Movie_3", "Movie_4", "Movie_5"};
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast5() {
        AfishaManager manager = new AfishaManager();
        String[] films = new String[] {"Movie_1", "Movie_2", "Movie_3", "Movie_4", "Movie_5"};
        manager.setFilms(films);
        manager.findLast();

        String[] expected = {"Movie_5", "Movie_4", "Movie_3", "Movie_2", "Movie_1"};
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast10() {
        AfishaManager manager = new AfishaManager();
        String[] films = new String[] {"Movie_1", "Movie_2", "Movie_3", "Movie_4", "Movie_5", "Movie_6", "Movie_7", "Movie_8", "Movie_9", "Movie_10"};
        manager.setFilms(films);
        manager.findLast();

        String[] expected = {"Movie_10", "Movie_9", "Movie_8", "Movie_7", "Movie_6", "Movie_5", "Movie_4", "Movie_3", "Movie_2", "Movie_1"};
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast12() {
        AfishaManager manager = new AfishaManager();
        String[] films = new String[] {"Movie_1", "Movie_2", "Movie_3", "Movie_4", "Movie_5", "Movie_6", "Movie_7", "Movie_8", "Movie_9","Movie_10", "Movie_11", "Movie_12"};
        manager.setFilms(films);
        manager.findLast();

        String[] expected = {"Movie_12", "Movie_11", "Movie_10", "Movie_9", "Movie_8", "Movie_7", "Movie_6", "Movie_5", "Movie_4", "Movie_3"};
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastLimit3() {
        AfishaManager manager = new AfishaManager(3);
        String[] films = new String[] {"Movie_1", "Movie_2", "Movie_3", "Movie_4", "Movie_5"};
        manager.setFilms(films);
        manager.findLast();

        String[] expected = {"Movie_5", "Movie_4", "Movie_3"};
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLast2Limit3() {
        AfishaManager manager = new AfishaManager(3);
        String[] films = new String[] {"Movie_1", "Movie_2"};
        manager.setFilms(films);
        manager.findLast();

        String[] expected = {"Movie_2", "Movie_1"};
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    void findLastLimit0() {
        AfishaManager manager = new AfishaManager(0);
        String[] films = new String[] {"Movie_1", "Movie_2"};
        manager.setFilms(films);
        manager.findLast();

        String[] expected = { };
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

}