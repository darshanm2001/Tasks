package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductDTO implements Serializable,Comparable<ProductDTO>{
private int id;
    private String name;
    private double price;
    private LocalDate expiryDate;
    private LocalDate manufactureDate;
    private double discount;
    private String description;
    private int quantity;
    private int rating;
    private int peopleRated;
    private int peopleRatedFive;
    private int peopleRatedFour;
    private int peopleRatedThree;
    private int peopleRatedTwo;
    private int peopleRatedOne;
    private String packer;
    private double itemWeight;
    private String included;
    private String genericName;
    private LocalDate dateFirstAvailable;
    private String asin;
    private boolean damaged;
    private String countryOfOrigin;
    private String modelNo;
    private String serialNo;
    private boolean returnable;
    private String warranty;
    private boolean primeDelivery;
    private LocalDate deliveryExpectedDate;
    private LocalDate returnDate;
public ProductDTO() {
super();
}
public ProductDTO(int id, String name, double price, LocalDate expiryDate, LocalDate manufactureDate,
double discount, String description, int quantity, int rating, int peopleRated, int peopleRatedFive,
int peopleRatedFour, int peopleRatedThree, int peopleRatedTwo, int peopleRatedOne, String packer,
double itemWeight, String included, String genericName, LocalDate dateFirstAvailable, String asin,
boolean damaged, String countryOfOrigin, String modelNo, String serialNo, boolean returnable,
String warranty, boolean primeDelivery, LocalDate deliveryExpectedDate, LocalDate returnDate) {
super();
this.id = id;
this.name = name;
this.price = price;
this.expiryDate = expiryDate;
this.manufactureDate = manufactureDate;
this.discount = discount;
this.description = description;
this.quantity = quantity;
this.rating = rating;
this.peopleRated = peopleRated;
this.peopleRatedFive = peopleRatedFive;
this.peopleRatedFour = peopleRatedFour;
this.peopleRatedThree = peopleRatedThree;
this.peopleRatedTwo = peopleRatedTwo;
this.peopleRatedOne = peopleRatedOne;
this.packer = packer;
this.itemWeight = itemWeight;
this.included = included;
this.genericName = genericName;
this.dateFirstAvailable = dateFirstAvailable;
this.asin = asin;
this.damaged = damaged;
this.countryOfOrigin = countryOfOrigin;
this.modelNo = modelNo;
this.serialNo = serialNo;
this.returnable = returnable;
this.warranty = warranty;
this.primeDelivery = primeDelivery;
this.deliveryExpectedDate = deliveryExpectedDate;
this.returnDate = returnDate;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;
}
public LocalDate getExpiryDate() {
return expiryDate;
}
public void setExpiryDate(LocalDate expiryDate) {
this.expiryDate = expiryDate;
}
public LocalDate getManufactureDate() {
return manufactureDate;
}
public void setManufactureDate(LocalDate manufactureDate) {
this.manufactureDate = manufactureDate;
}
public double getDiscount() {
return discount;
}
public void setDiscount(double discount) {
this.discount = discount;
}
public String getDescription() {
return description;
}
public void setDescription(String description) {
this.description = description;
}
public int getQuantity() {
return quantity;
}
public void setQuantity(int quantity) {
this.quantity = quantity;
}
public int getRating() {
return rating;
}
public void setRating(int rating) {
this.rating = rating;
}
public int getPeopleRated() {
return peopleRated;
}
public void setPeopleRated(int peopleRated) {
this.peopleRated = peopleRated;
}
public int getPeopleRatedFive() {
return peopleRatedFive;
}
public void setPeopleRatedFive(int peopleRatedFive) {
this.peopleRatedFive = peopleRatedFive;
}
public int getPeopleRatedFour() {
return peopleRatedFour;
}
public void setPeopleRatedFour(int peopleRatedFour) {
this.peopleRatedFour = peopleRatedFour;
}
public int getPeopleRatedThree() {
return peopleRatedThree;
}
public void setPeopleRatedThree(int peopleRatedThree) {
this.peopleRatedThree = peopleRatedThree;
}
public int getPeopleRatedTwo() {
return peopleRatedTwo;
}
public void setPeopleRatedTwo(int peopleRatedTwo) {
this.peopleRatedTwo = peopleRatedTwo;
}
public int getPeopleRatedOne() {
return peopleRatedOne;
}
public void setPeopleRatedOne(int peopleRatedOne) {
this.peopleRatedOne = peopleRatedOne;
}
public String getPacker() {
return packer;
}
public void setPacker(String packer) {
this.packer = packer;
}
public double getItemWeight() {
return itemWeight;
}
public void setItemWeight(double itemWeight) {
this.itemWeight = itemWeight;
}
public String getIncluded() {
return included;
}
public void setIncluded(String included) {
this.included = included;
}
public String getGenericName() {
return genericName;
}
public void setGenericName(String genericName) {
this.genericName = genericName;
}
public LocalDate getDateFirstAvailable() {
return dateFirstAvailable;
}
public void setDateFirstAvailable(LocalDate dateFirstAvailable) {
this.dateFirstAvailable = dateFirstAvailable;
}
public String getAsin() {
return asin;
}
public void setAsin(String asin) {
this.asin = asin;
}
public boolean isDamaged() {
return damaged;
}
public void setDamaged(boolean damaged) {
this.damaged = damaged;
}
public String getCountryOfOrigin() {
return countryOfOrigin;
}
public void setCountryOfOrigin(String countryOfOrigin) {
this.countryOfOrigin = countryOfOrigin;
}
public String getModelNo() {
return modelNo;
}
public void setModelNo(String modelNo) {
this.modelNo = modelNo;
}
public String getSerialNo() {
return serialNo;
}
public void setSerialNo(String serialNo) {
this.serialNo = serialNo;
}
public boolean isReturnable() {
return returnable;
}
public void setReturnable(boolean returnable) {
this.returnable = returnable;
}
public String getWarranty() {
return warranty;
}
public void setWarranty(String warranty) {
this.warranty = warranty;
}
public boolean isPrimeDelivery() {
return primeDelivery;
}
public void setPrimeDelivery(boolean primeDelivery) {
this.primeDelivery = primeDelivery;
}
public LocalDate getDeliveryExpectedDate() {
return deliveryExpectedDate;
}
public void setDeliveryExpectedDate(LocalDate deliveryExpectedDate) {
this.deliveryExpectedDate = deliveryExpectedDate;
}
public LocalDate getReturnDate() {
return returnDate;
}
public void setReturnDate(LocalDate returnDate) {
this.returnDate = returnDate;
}
@Override
public String toString() {
return "ProductDTO [id=" + id + ", name=" + name + ", price=" + price + ", expiryDate=" + expiryDate
+ ", manufactureDate=" + manufactureDate + ", discount=" + discount + ", description=" + description
+ ", quantity=" + quantity + ", rating=" + rating + ", peopleRated=" + peopleRated
+ ", peopleRatedFive=" + peopleRatedFive + ", peopleRatedFour=" + peopleRatedFour
+ ", peopleRatedThree=" + peopleRatedThree + ", peopleRatedTwo=" + peopleRatedTwo + ", peopleRatedOne="
+ peopleRatedOne + ", packer=" + packer + ", itemWeight=" + itemWeight + ", included=" + included
+ ", genericName=" + genericName + ", dateFirstAvailable=" + dateFirstAvailable + ", asin=" + asin
+ ", damaged=" + damaged + ", countryOfOrigin=" + countryOfOrigin + ", modelNo=" + modelNo
+ ", serialNo=" + serialNo + ", returnable=" + returnable + ", warranty=" + warranty
+ ", primeDelivery=" + primeDelivery + ", deliveryExpectedDate=" + deliveryExpectedDate
+ ", returnDate=" + returnDate + "]";
}
@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = prime * result + ((asin == null) ? 0 : asin.hashCode());
result = prime * result + ((countryOfOrigin == null) ? 0 : countryOfOrigin.hashCode());
result = prime * result + (damaged ? 1231 : 1237);
result = prime * result + ((dateFirstAvailable == null) ? 0 : dateFirstAvailable.hashCode());
result = prime * result + ((deliveryExpectedDate == null) ? 0 : deliveryExpectedDate.hashCode());
result = prime * result + ((description == null) ? 0 : description.hashCode());
long temp;
temp = Double.doubleToLongBits(discount);
result = prime * result + (int) (temp ^ (temp >>> 32));
result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
result = prime * result + ((genericName == null) ? 0 : genericName.hashCode());
result = prime * result + id;
result = prime * result + ((included == null) ? 0 : included.hashCode());
temp = Double.doubleToLongBits(itemWeight);
result = prime * result + (int) (temp ^ (temp >>> 32));
result = prime * result + ((manufactureDate == null) ? 0 : manufactureDate.hashCode());
result = prime * result + ((modelNo == null) ? 0 : modelNo.hashCode());
result = prime * result + ((name == null) ? 0 : name.hashCode());
result = prime * result + ((packer == null) ? 0 : packer.hashCode());
result = prime * result + peopleRated;
result = prime * result + peopleRatedFive;
result = prime * result + peopleRatedFour;
result = prime * result + peopleRatedOne;
result = prime * result + peopleRatedThree;
result = prime * result + peopleRatedTwo;
temp = Double.doubleToLongBits(price);
result = prime * result + (int) (temp ^ (temp >>> 32));
result = prime * result + (primeDelivery ? 1231 : 1237);
result = prime * result + quantity;
result = prime * result + rating;
result = prime * result + ((returnDate == null) ? 0 : returnDate.hashCode());
result = prime * result + (returnable ? 1231 : 1237);
result = prime * result + ((serialNo == null) ? 0 : serialNo.hashCode());
result = prime * result + ((warranty == null) ? 0 : warranty.hashCode());
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
ProductDTO other = (ProductDTO) obj;
if (asin == null) {
if (other.asin != null)
return false;
} else if (!asin.equals(other.asin))
return false;
if (countryOfOrigin == null) {
if (other.countryOfOrigin != null)
return false;
} else if (!countryOfOrigin.equals(other.countryOfOrigin))
return false;
if (damaged != other.damaged)
return false;
if (dateFirstAvailable == null) {
if (other.dateFirstAvailable != null)
return false;
} else if (!dateFirstAvailable.equals(other.dateFirstAvailable))
return false;
if (deliveryExpectedDate == null) {
if (other.deliveryExpectedDate != null)
return false;
} else if (!deliveryExpectedDate.equals(other.deliveryExpectedDate))
return false;
if (description == null) {
if (other.description != null)
return false;
} else if (!description.equals(other.description))
return false;
if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
return false;
if (expiryDate == null) {
if (other.expiryDate != null)
return false;
} else if (!expiryDate.equals(other.expiryDate))
return false;
if (genericName == null) {
if (other.genericName != null)
return false;
} else if (!genericName.equals(other.genericName))
return false;
if (id != other.id)
return false;
if (included == null) {
if (other.included != null)
return false;
} else if (!included.equals(other.included))
return false;
if (Double.doubleToLongBits(itemWeight) != Double.doubleToLongBits(other.itemWeight))
return false;
if (manufactureDate == null) {
if (other.manufactureDate != null)
return false;
} else if (!manufactureDate.equals(other.manufactureDate))
return false;
if (modelNo == null) {
if (other.modelNo != null)
return false;
} else if (!modelNo.equals(other.modelNo))
return false;
if (name == null) {
if (other.name != null)
return false;
} else if (!name.equals(other.name))
return false;
if (packer == null) {
if (other.packer != null)
return false;
} else if (!packer.equals(other.packer))
return false;
if (peopleRated != other.peopleRated)
return false;
if (peopleRatedFive != other.peopleRatedFive)
return false;
if (peopleRatedFour != other.peopleRatedFour)
return false;
if (peopleRatedOne != other.peopleRatedOne)
return false;
if (peopleRatedThree != other.peopleRatedThree)
return false;
if (peopleRatedTwo != other.peopleRatedTwo)
return false;
if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
return false;
if (primeDelivery != other.primeDelivery)
return false;
if (quantity != other.quantity)
return false;
if (rating != other.rating)
return false;
if (returnDate == null) {
if (other.returnDate != null)
return false;
} else if (!returnDate.equals(other.returnDate))
return false;
if (returnable != other.returnable)
return false;
if (serialNo == null) {
if (other.serialNo != null)
return false;
} else if (!serialNo.equals(other.serialNo))
return false;
if (warranty == null) {
if (other.warranty != null)
return false;
} else if (!warranty.equals(other.warranty))
return false;
return true;
}
@Override
public int compareTo(ProductDTO o) {
// TODO Auto-generated method stub
return 0;
}
   
}


