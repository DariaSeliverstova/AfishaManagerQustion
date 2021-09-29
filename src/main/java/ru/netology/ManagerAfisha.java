package ru.netology;


public class ManagerAfisha {

    private Films[] films = new Films[0];


    public ManagerAfisha(Films[] films) {
        this.films = films;
    }


    public ManagerAfisha() {

    }

    public void add(Films film) {
        int length = films.length + 1;
        Films[] newFilms = new Films[length];
        for (int i = 0; i < films.length; i++) {
            newFilms[i] = films[i];
        }
        int Lastindex = newFilms.length - 1;
        newFilms[Lastindex] = film;
        films = newFilms;


    }

    public Films[] getAll() {
        int length = films.length;
        if (length > 10) {
            length = films.length - 1;
        } else {
            length = films.length;
        }

        Films[] Lastfilms = new Films[length];

        for (int i = 0; i < films.length; i++) {
            Lastfilms[i] = films[i];
            int index = films.length - i - 1;
            Lastfilms[i] = films[index];
        }
        return Lastfilms;
    }

}


