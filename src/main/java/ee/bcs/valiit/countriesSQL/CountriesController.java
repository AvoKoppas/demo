package ee.bcs.valiit.countriesSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesController {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    CountriesService countriesService;

    @PutMapping("addCountry/{name}/{capital}/{population}")
    public String addCountry(@RequestParam("name") String name,
                             @RequestParam("capital") String capital,
                             @RequestParam("population") double population){
        countriesService.addCountry(name, capital, population);
        return "Country added";
    }
}
