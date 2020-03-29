package com.bestBuy.utilities;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public class JsonReader extends FWLogger{

    private static Map<String, Object> testData;
    private ObjectMapper mapper;

    public JsonReader(String fileName) throws FileNotFoundException {

        String filePath = "data/" +fileName;
        LOG.info("Json File Path: " + filePath);
        mapper = new ObjectMapper();
        /**
         * Read JSON from a file into a Map
         */
        try {
            Map<String, Object> testData = mapper.readValue(
                                            new File(filePath),
                                            new TypeReference<Map<String, Object>>(){});

        } catch (Exception e) {
            e.printStackTrace();
            LOG.error(e.getMessage());
        }

    }
//    public static Object getProperty(String key){
//        return testData.get(key);
//    }
}
