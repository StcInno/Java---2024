package ru.innopolis.java.basic2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Team {
    private final String name;
    private final List<Person> players;

    public Team(final String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Person person) {
        this.players.add(person);
    }

    public List<Person> getPlayers() {
        return Collections.unmodifiableList(this.players);
    }
}

