package com.iit.oopcw.Real_Time_Event_Ticketing_System.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iit.oopcw.Real_Time_Event_Ticketing_System.entity.Configuration;
import com.iit.oopcw.Real_Time_Event_Ticketing_System.service.ConfigurationService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    private final String CONFIG_FILE = "config.json";
    @Override
    public String saveConfiguration(Configuration config) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(CONFIG_FILE), config);
            return "Configuration saved successfully";
        } catch (IOException e) {
            return "Error saving configuration"+ e.getMessage();
        }
    }

    @Override
    public Configuration loadConfiguration() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(new File(CONFIG_FILE), Configuration.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
