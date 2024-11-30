package com.iit.oopcw.Real_Time_Event_Ticketing_System.controller;

import com.iit.oopcw.Real_Time_Event_Ticketing_System.entity.Configuration;
import com.iit.oopcw.Real_Time_Event_Ticketing_System.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/config")
public class ConfigurationController {

    @Autowired
    private ConfigurationService configurationService;

    @PostMapping
    public ResponseEntity<String> saveConfiguration(@RequestBody Configuration config) {
        return ResponseEntity.status(200).body(configurationService.saveConfiguration(config));
    }

    @GetMapping
    public ResponseEntity<Configuration> loadConfiguration() {
        return ResponseEntity.status(200).body(configurationService.loadConfiguration());
    }
}
