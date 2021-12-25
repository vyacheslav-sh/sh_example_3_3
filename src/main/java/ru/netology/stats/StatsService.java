package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales){
        int sumsales = 0;
        for(int month=0;month<sales.length;month++){
            sumsales += sales[month];
        }
        return sumsales;
    }
    public int avg(int[] sales){
        int sumsales = 0;
        for(int month=0;month<sales.length;month++){
            sumsales += sales[month];
        }
        int avgsales = sumsales / sales.length;
        return avgsales;
    }
    public int max(int[] sales){
        int maxsales = sales[1];
        for(int month=1;month<sales.length;month++){
            if(maxsales < sales[month]){
                maxsales = sales[month];
            }
        }
        return maxsales;
    }
    public int min(int[] sales){
        int minsales = sales[1];
        for(int month=1;month<sales.length;month++){
            if(minsales > sales[month]){
                minsales = sales[month];
            }
        }
        return minsales;
    }
    public int lower(int[] sales){
        int lowersales = 0;
        int avgsales = avg(sales);
        for(int month=0;month<sales.length;month++){
            if(sales[month] < avgsales){
                lowersales ++;
            }
        }
        return lowersales;
    }
    public int higher(int[] sales){
        int highersales = 0;
        int avgsales = avg(sales);
        for(int month=0;month<sales.length;month++){
            if(sales[month] > avgsales){
                highersales ++;
            }
        }
        return highersales;
    }
}
