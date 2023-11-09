package com.xworkz.collectionSorting.dto.app;

public class TowerDTO implements Comparable<TowerDTO> {
    private String name;
    private int height;
    private boolean isObservationDeck;
    private String location;

    public TowerDTO(String name, int height, boolean isObservationDeck, String location) {
        this.name = name;
        this.height = height;
        this.isObservationDeck = isObservationDeck;
        this.location = location;
    }

    public TowerDTO() {
    }

    @Override
    public String toString() {
        return "TowerDto [name=" + name + ", height=" + height + ", isObservationDeck=" + isObservationDeck + ", location=" + location + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isObservationDeck() {
        return isObservationDeck;
    }

    public void setObservationDeck(boolean isObservationDeck) {
        this.isObservationDeck = isObservationDeck;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + height;
        result = prime * result + (isObservationDeck ? 1231 : 1237);
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TowerDTO other = (TowerDTO) obj;
        if (height != other.height)
            return false;
        if (isObservationDeck != other.isObservationDeck)
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(TowerDTO argument) {
        TowerDTO current = this;
        if (current.height == argument.height) {
            return 1;
        }
        if (current.height > argument.height) {
            return 2000;
        }
        if (current.height < argument.height) {
            return -4;
        }
        return 0;
    }
}
