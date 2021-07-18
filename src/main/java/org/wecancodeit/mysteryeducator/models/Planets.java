package org.wecancodeit.mysteryeducator.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Planets {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Lob
    private String description;
    private String distance;
    private String size;
    @ManyToMany
    private Collection<History> history;
    @ManyToMany
    private Collection <Art> art;
    
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDistance() {
        return distance;
    }

    public String getSize() {
        return size;
    }

    public Collection<History> getHistory() {return history;}

    public Collection <Art> getArt() {return art;}


    public Planets() {

    }

    public Planets(String name, String description, String distance, String size, History history, Art art) {
        this.name = name;
        this.description = description;
        this.distance = distance;
        this.size = size;
        this.history = new ArrayList<>(Arrays.asList(history));
        this.art = new ArrayList<>(Arrays.asList(art));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planets)) return false;
        Planets planets = (Planets) o;
        return Objects.equals(getId(), planets.getId()) && Objects.equals(getName(), planets.getName()) && Objects.equals(getDescription(), planets.getDescription()) && Objects.equals(getDistance(), planets.getDistance()) && Objects.equals(getSize(), planets.getSize()) && Objects.equals(getHistory(), planets.getHistory()) && Objects.equals(getArt(), planets.getArt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getDistance(), getSize(), getHistory(), getArt());
    }
}
