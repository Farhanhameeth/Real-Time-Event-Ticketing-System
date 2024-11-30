package com.iit.oopcw.Real_Time_Event_Ticketing_System.service;

import com.iit.oopcw.Real_Time_Event_Ticketing_System.entity.Configuration;
import org.springframework.stereotype.Service;

@Service
public interface ConfigurationService {

    String saveConfiguration(Configuration config);
    Configuration loadConfiguration();
}
