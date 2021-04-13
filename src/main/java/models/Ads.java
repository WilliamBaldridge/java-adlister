package models;

import beans.Ad;

import java.util.List;

public interface Ads {
    List<Ad> all();
    void insert(Ad ad);
}
