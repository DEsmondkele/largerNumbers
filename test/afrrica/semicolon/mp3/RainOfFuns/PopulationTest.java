package afrrica.semicolon.mp3.RainOfFuns;
import static org.junit.jupiter.api.Assertions. *;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PopulationTest {

    @Test
    void currentPopulationGrowthRateCanBeTested() {
        Population  y_Population=new Population();
        assertEquals(0.0105,y_Population.getGrowthRate());
        System.out.println(y_Population.getGrowthRate());


    }

    @Test
    void getW_populationAt2020() {
        Population  y_Population=new Population();
        assertEquals(7794798739L,y_Population.getWorldPopulation());
        System.out.println(y_Population.getWorldPopulation());
    }

    @Test
    void annualGrowthRate() {
        Population  y_Population=new Population();
        assertEquals(81845386,y_Population.annual_Rate());
        System.out.println(y_Population.annual_Rate());
    }
    @Test
    void updateTotalPopulationIn2021(){
        Population y_Population= new Population();
        assertEquals(7876644125L,y_Population.getTotalPopulation());
        System.out.println(y_Population.getTotalPopulation());
    }
    @Test
    void fiveYearsPopulationForecast(){
        Population y_Population=new Population();
        assertNotNull(y_Population.getForecast());
       System.out.println(Arrays.toString(y_Population.getForecast()));
    }
}