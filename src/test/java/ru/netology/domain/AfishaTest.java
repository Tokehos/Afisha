package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaTest {

    private Afisha manager = new Afisha();
    private Movie first = new Movie(1, "Приключения Пилью", "#link", "Приключения", false);
    private Movie second = new Movie(2, "Нули и единицы", "#link", "Триллер", true);
    private Movie third = new Movie(3, "Король Ричард", "#link", "Драма", false);
    private Movie fourth = new Movie(4, "Небо", "#link", "Военный", true);
    private Movie fifth = new Movie(5, "Плюшевый бум", "#link", "Мультфильм", false);
    private Movie sixth = new Movie(6, "Последняя дуэль", "#link", "Драма", false);
    private Movie seventh = new Movie(7, "Ряд 19", "#link", "Триллер", false);
    private Movie eighth = new Movie(8, "Лощина мертвецов", "#link", "Ужасы", false);
    private Movie ninth = new Movie(9, "Проклятье Эбигейл", "#link", "Ужасы", false);
    private Movie tenth = new Movie(10, "Вечные", "#link", "Боевик", false);
    private Movie eleventh = new Movie(11, "Медвежонок Бамси и дракон", "#link", "Семейный", false);


    @Test
    public void shouldAddFilm() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        int actual = manager.getFilms().length;
        int expected = 10;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldAddFilmWithOne() {
        Afisha manager = new Afisha();
        manager.add(first);
        int actual = manager.getFilms().length;
        int expected = 1;
        assertEquals(expected, actual);
    }


    @Test
    public void shouldShowLastFilmsDefault() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsDefaultFirstFilm() {
        Afisha manager = new Afisha();
        manager.add(first);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsOverDefault() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsWithLimit() {
        Afisha manager = new Afisha(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsOverLimit() {
        Afisha manager = new Afisha(11);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsZeroLimit() {
        Afisha manager = new Afisha(0);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsMinusLimit() {
        Afisha manager = new Afisha(-3);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldShowLastFilmsDefault1() {
        Afisha manager = new Afisha();
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsWithLimitSix() {
        Afisha manager = new Afisha(6);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsOverLimitEleven() {
        Afisha manager = new Afisha(11);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldShowLastFilmsWithLimitWithFive() {
        Afisha manager = new Afisha(5);
        manager.add(first);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsOverLimitWithFourteen() {
        Afisha manager = new Afisha(14);
        manager.add(first);
        Movie[] actual = manager.showLastFilms();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }
}