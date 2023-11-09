package com.xworkz.collectionSorting.dto.app;


import java.io.Serializable;
import java.time.LocalDate;

public class IceCreamDTO implements Serializable, Comparable<IceCreamDTO> {
private String flavour;
private String type;
private Double price;
private String color;
private LocalDate manfDate;
public boolean getPrice;

public IceCreamDTO() {
super();
}

public IceCreamDTO(String flavour, String type, Double price, String color, LocalDate manfDate) {
super();
this.flavour = flavour;
this.type = type;
this.price = price;
this.color = color;
this.manfDate = manfDate;
}

public String getFlavour() {
return flavour;
}

public void setFlavour(String flavour) {
this.flavour = flavour;
}

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public Double getPrice() {
return price;
}

public void setPrice(Double price) {
this.price = price;
}

public String getColor() {
return color;
}

public void setColor(String color) {
this.color = color;
}

public LocalDate getManfDate() {
return manfDate;
}

public void setManfDate(LocalDate manfDate) {
this.manfDate = manfDate;
}

@Override
public String toString() {
return "IceCreamDTO [flavour=" + flavour + ", type=" + type + ", price=" + price + ", color=" + color
+ ", manfDate=" + manfDate + "]";
}

@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = prime * result + ((color == null) ? 0 : color.hashCode());
result = prime * result + ((flavour == null) ? 0 : flavour.hashCode());
result = prime * result + ((manfDate == null) ? 0 : manfDate.hashCode());
result = prime * result + ((price == null) ? 0 : price.hashCode());
result = prime * result + ((type == null) ? 0 : type.hashCode());
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
IceCreamDTO other = (IceCreamDTO) obj;
if (color == null) {
if (other.color != null)
return false;
} else if (!color.equals(other.color))
return false;
if (flavour == null) {
if (other.flavour != null)
return false;
} else if (!flavour.equals(other.flavour))
return false;
if (manfDate == null) {
if (other.manfDate != null)
return false;
} else if (!manfDate.equals(other.manfDate))
return false;
if (price == null) {
if (other.price != null)
return false;
} else if (!price.equals(other.price))
return false;
if (type == null) {
if (other.type != null)
return false;
} else if (!type.equals(other.type))
return false;
return true;
}

@Override
public int compareTo(IceCreamDTO argument) {
return this.price.compareTo(argument.price);
}

}