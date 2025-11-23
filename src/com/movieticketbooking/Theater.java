package com.movieticketbooking;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Theater {
    private String Name;
    private String Location;
    private Set<Showtime> ShowTime;

    public Theater(String name, String location) {
        Name = name;
        Location = location;
        ShowTime = new HashSet<>();
    }
     public void addShowTime(Showtime showTime){
        this.ShowTime.add(showTime);
     }

    public String getName() {
        return Name;
    }

    public String getLocation() {
        return Location;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if( o==null || getClass()!=o.getClass()) return false;
        Theater theater = (Theater) o;
        return Name.equals(theater.Name) && Location.equals(theater.Location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Location);
    }
}
