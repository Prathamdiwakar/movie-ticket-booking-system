package com.movieticketbooking;

import java.util.Objects;

public class Movie implements Comparable<Movie>{
    private String Name;
    private String Genre;
    private int Duration;

    public Movie(String name, String genre, int duration) {
        this.Name = name;
        this.Genre = genre;
        this.Duration = duration;
    }

    public String getName() {
        return Name;
    }

    public String getGenre() {
        return Genre;
    }

    public int getDuration() {
        return Duration;
    }

    @Override
    public int compareTo(Movie o) {
        return this.Name.compareTo(o.Name);
    }

    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null||getClass()!=o.getClass()) return false;
        Movie movie = (Movie) o;
        return Name.equals(movie.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }

    @Override
    public String toString() {
        return "Movie{name='" + Name + "', genre='" + Genre + "', duration=" + Duration + "}";
    }
}