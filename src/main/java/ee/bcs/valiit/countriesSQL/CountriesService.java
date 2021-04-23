package ee.bcs.valiit.countriesSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CountriesService {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;
    public void addCountry(String name, String capital, double population) {
       // CountriesRepository.addCountry(name, capital, population);
    }
}
