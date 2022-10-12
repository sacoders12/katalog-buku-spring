package com.subrutin.catalog.service.impl;

import java.util.TimeZone;

import org.springframework.stereotype.Service;

import com.subrutin.catalog.config.ApplicationProperties;
import com.subrutin.catalog.config.CloudProperties;
import com.subrutin.catalog.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

    private ApplicationProperties applicationProperties;
    
    private CloudProperties cloudProperties;

    public GreetingServiceImpl(ApplicationProperties applicationProperties, CloudProperties cloudProperties) {
        this.applicationProperties = applicationProperties;
        this.cloudProperties = cloudProperties;
    }

    @Override
    public String sayGreeting() {
        TimeZone timeZone = TimeZone.getTimeZone(applicationProperties.getTimezone());
        return applicationProperties.getWelcomeText()+" our time zone : " + timeZone.getDisplayName()+" our currency ," + applicationProperties.getCurrency();
    }
    
}
