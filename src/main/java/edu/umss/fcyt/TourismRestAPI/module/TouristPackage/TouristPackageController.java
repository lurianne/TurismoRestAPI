package edu.umss.fcyt.TourismRestAPI.module.TouristPackage;

import org.springframework.web.bind.annotation.*;

@RestController
public class TouristPackageController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String greeting(@RequestParam(value = "cityName", defaultValue = "World") String cityName){
        return "Hello from " + cityName;
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public String addCity(@RequestBody String cityName){
        return "city " + cityName;
    }
}
