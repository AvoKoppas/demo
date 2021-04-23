package ee.bcs.valiit.countriesSQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CountriesRepository {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    private String addCountry(String name, String capital, double population) {
        String sql = "INSERT INTO countries (name, capital, population) " +
                "VALUES (:muutuja1, :muutuja2, :muutuja3)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("muutuja1", name);
        paramMap.put("muutuja2", capital);
        paramMap.put("muutuja3", population);
        jdbcTemplate.update(sql, paramMap);
        return "Country added";
    }

}
