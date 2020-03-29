package com.bestBuy.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader extends FWLogger{


    private static Properties configFile;

    static {
        try {

            String path = System.getProperty("user.dir") + "/src/main/resources/config/config.properties";
            LOG.info("Properties File Path: "+ path);
            FileInputStream input = new FileInputStream(path);
            configFile = new Properties();
            configFile.load(input);
            input.close();
        } catch (Exception e){
            e.printStackTrace();
            LOG.error(e.getMessage());
        }
    }

    public static String getProperty(String key){
        return configFile.getProperty(key);
    }

}
