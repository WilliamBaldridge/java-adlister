package models;

import models.Ads;
import models.Config;

public class DaoFactory {

    private static Ads adsDao;
    private static Config config;


    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
