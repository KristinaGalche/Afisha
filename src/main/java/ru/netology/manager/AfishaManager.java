package ru.netology.manager;

public class AfishaManager {
    private String[] films = new String[0];
    private int filmLimit = 10;

    public AfishaManager() {
    }
    public AfishaManager(int filmLimit) {
        this.filmLimit = filmLimit;
    }

    public String[] getFilms() {
        return films;
    }
    public void setFilms(String[] films) {
        this.films = films;
    }

    public void add(String film) {
        int length = films.length + 1;
        String[] tmp = new String[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public void findAll() {
        getFilms();
    }

    public void findLast() {
        int resultLength = 0;
        if (films.length > filmLimit) {
            resultLength = filmLimit;
        }   else {
            resultLength = films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        this.films = result;
    }
}

