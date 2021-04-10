package afrrica.semicolon.mp3.RainOfFuns;

public class Population{
    long worldPopulation = 7794798739L;

    public double getGrowthRate() {
        double growthRate;
        growthRate = 1.05 * 1 / 100;
        return growthRate;
    }

    public long getWorldPopulation() {
        return worldPopulation;
    }

    public long annual_Rate(){
    Population myPopulation=new Population();
    long annualRate;
        annualRate = (long) (myPopulation.getWorldPopulation() * myPopulation.getGrowthRate());
        return annualRate;
    }

    public long getTotalPopulation() {
    { long population;
        population = worldPopulation + annual_Rate();

        return population;}

    }

    public long[] populationUpdate() {

        long[] years;
        years = new long[]{(getTotalPopulation()), (2 * getTotalPopulation()),
                (3 * getTotalPopulation()), (4 * getTotalPopulation()),
                (5 * getTotalPopulation())};
        int i = 1;
        while (i < years.length) {
            ++i;
            years[i - 1] = i * getTotalPopulation();
        }
        {
            return years;
        }
    }
    public long[] getForecast(){
        return populationUpdate();
    }
}
