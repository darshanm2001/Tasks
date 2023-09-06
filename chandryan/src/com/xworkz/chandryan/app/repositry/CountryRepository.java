package com.xworkz.chandryan.app.repositry;

public interface CountryRepository {
	int TOTAL_COUNTRIES = 10;

    void save(String countryName);

    default boolean isExist(String countryName) {
        return false;
    }


}
