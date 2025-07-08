package com.cognizant.country.controller;

import com.cognizant.country.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @GetMapping("/country")
    public Country getCountryIndia() {
        return new Country("IN", "India");
    }
}
