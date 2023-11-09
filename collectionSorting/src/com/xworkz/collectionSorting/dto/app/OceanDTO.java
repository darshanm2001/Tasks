package com.xworkz.collectionSorting.dto.app;

public class OceanDTO implements Comparable<OceanDTO> {

    private String name;
    private double depth; // Replace with the appropriate data type for depth
    private boolean saltwater;
    private String location;

    public OceanDTO(String name, double depth, boolean saltwater, String location) {
        super();
        this.name = name;
        this.depth = depth;
        this.saltwater = saltwater;
        this.location = location;
    }

    public OceanDTO() {
        super();
    }

    // Getters and setters for the properties (similar to TheaterDto)

    @Override
    public String toString() {
        return "OceanDTO [name=" + name + ", depth=" + depth + ", saltwater=" + saltwater + ", location=" + location + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.hashCode(depth);
        result = prime * result + (saltwater ? 1231 : 1237);
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
        OceanDTO other = (OceanDTO) obj;
        if (Double.compare(depth, other.depth) != 0)
            return false;
        if (saltwater != other.saltwater)
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
    public int compareTo(OceanDTO argument) {
        OceanDTO current = this;
        return current.name.compareTo(argument.name);
    }

}
