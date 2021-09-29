package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerAfishaTest {
    ManagerAfisha manager = new ManagerAfisha();

    @Test
    public void shouldFilm() {
        Films first = new Films(1, "BladShot", "thriller", 7, 1);
        Films second = new Films(2, "Privet", "camedy", 6, 2);
        Films third = new Films(3, "Hello", "drama", 5, 3);
        Films fourth = new Films(4, "Bye", "camedy", 4,4);
        Films fifth = new Films(5, "it", "thriller", 3,5);
        Films sixth = new Films(6, "bad boys", "camedy", 2,6);
        Films seventh = new Films(7, "bad boys", "camedy", 1,7);
        Films eighth = new Films(8, "007", "detective", 8,8);
        Films ninth = new Films(9, "Miss Marple", "detective", 9,9);
        Films tenth = new Films(10, "Merci", "drama", 12,10);


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



        Films[] actual = manager.getAll();
        Films[] expected = new Films[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);

    }
    @Test
    public void ShouldNewFilm() {
        Films first = new Films(1, "BladShot", "thriller", 7, 1);
        Films second = new Films(2, "Privet", "camedy", 6, 2);
        Films third = new Films(3, "Hello", "drama", 5, 3);

        manager.add(first);
        manager.add(second);
        manager.add(third);

        Films[] actual = manager.getAll();
        Films[] expected = new Films[]{third, second, first};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldLastFilm() {
        Films first = new Films(1, "BladShot", "thriller", 7, 1);
        Films second = new Films(2, "Privet", "camedy", 6, 2);
        Films third = new Films(3, "Hello", "drama", 5, 3);
        Films fourth = new Films(4, "Bye", "camedy", 4,4);
        Films fifth = new Films(5, "it", "thriller", 3,5);
        Films sixth = new Films(6, "bad boys", "camedy", 2,6);
        Films seventh = new Films(7, "bad boys", "camedy", 1,7);
        Films eighth = new Films(8, "007", "detective", 8,8);
        Films ninth = new Films(9, "Miss Marple", "detective", 9,9);
        Films tenth = new Films(10, "Merci", "drama", 12,10);
        Films eleventh = new Films(11, "bob", "camedy", 13,11);


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



        Films[] actual = manager.getAll();
        Films[] expected = new Films[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);

    }

    }