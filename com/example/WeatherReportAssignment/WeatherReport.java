package com.example.WeatherReportAssignment;

import java.time.*;
import java.util.*;

public class WeatherReport {
    String dayName;
    int leastTemp;
    int highestTemp;
    int rainfall;
    LocalTime sunRiseTime;
    LocalTime sunSetTime;

    public WeatherReport(String dayName, int leastTemp, int highestTemp, int rainfall, LocalTime sunRiseTime, LocalTime sunSetTime) {
        this.dayName = dayName;
        this.leastTemp = leastTemp;
        this.highestTemp = highestTemp;
        this.rainfall = rainfall;
        this.sunRiseTime = sunRiseTime;
        this.sunSetTime = sunSetTime;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public int getLeastTemp() {
        return leastTemp;
    }

    public void setLeastTemp(int leastTemp) {
        this.leastTemp = leastTemp;
    }

    public int getHighestTemp() {
        return highestTemp;
    }

    public void setHighestTemp(int highestTemp) {
        this.highestTemp = highestTemp;
    }

    public int getRainfall() {
        return rainfall;
    }

    public void setRainfall(int rainfall) {
        this.rainfall = rainfall;
    }

    public LocalTime getSunRiseTime() {
        return sunRiseTime;
    }

    public void setSunRiseTime(LocalTime sunRiseTime) {
        this.sunRiseTime = sunRiseTime;
    }

    public LocalTime getSunSetTime() {
        return sunSetTime;
    }

    public void setSunSetTime(LocalTime sunSetTime) {
        this.sunSetTime = sunSetTime;
    }
}
class WeeklyWeatherReport {
    private List<WeatherReport> reports;

    public WeeklyWeatherReport() {
        reports = new ArrayList<>();

        reports.add(new WeatherReport("Monday", 15, 30, 5, LocalTime.of(6, 30), LocalTime.of(18, 45)));
        reports.add(new WeatherReport("Tuesday", 15, 32, 8, LocalTime.of(6, 25), LocalTime.of(18, 00)));
        reports.add(new WeatherReport("Wednesday", 19, 34, 9, LocalTime.of(7, 00), LocalTime.of(18, 00)));
        reports.add(new WeatherReport("Thursday", 18, 33, 8, LocalTime.of(8, 15), LocalTime.of(18, 40)));


    }


    public WeatherReport getHottestDay() {
        return reports.stream()
                .max((r1, r2) -> Integer.compare(r1.getHighestTemp(), r2.getHighestTemp()))
                .orElse(null);
    }

    // Coolest day
    public WeatherReport getCoolestDay() {
        return reports.stream()
                .min((r1, r2) -> Integer.compare(r1.getLeastTemp(), r2.getLeastTemp()))
                .orElse(null);
    }

    // Highest rainfall
    public WeatherReport getHighestRainfallDay() {
        return reports.stream()
                .max((r1, r2) -> Integer.compare(r1.getRainfall(), r2.getRainfall()))
                .orElse(null);
    }

    // Earliest sunset
    public WeatherReport getEarliestSunset() {
        return reports.stream()
                .min((r1, r2) -> r1.getSunSetTime().compareTo(r2.getSunSetTime()))
                .orElse(null);
    }
    //  Longest Day
    public WeatherReport getLongestDay() {
        return reports.stream()
                .max(Comparator.comparing(report ->
                        Duration.between(report.getSunRiseTime(), report.getSunSetTime())))
                .orElse(null);
    }


    public void displaySummary() {
        WeatherReport hottest = getHottestDay();
        WeatherReport coolest = getCoolestDay();
        WeatherReport highestRainfall = getHighestRainfallDay();
        WeatherReport earliestSunset = getEarliestSunset();
        WeatherReport longestDay=getLongestDay();

        System.out.println("Hottest Day: " + hottest.getDayName() + " with " + hottest.getHighestTemp() + "°C");
        System.out.println("Coolest Day: " + coolest.getDayName() + " with " + coolest.getLeastTemp() + "°C");
        System.out.println("Highest Rainfall: " + highestRainfall.getDayName() + " with " + highestRainfall.getRainfall() + " mm");
        System.out.println("Earliest Sunset: " + earliestSunset.getDayName() + " at " + earliestSunset.getSunSetTime());
        System.out.println("Longest Day is: "+longestDay.getDayName());
    }

}
class Main {
    public static void main(String[] args) {
        WeeklyWeatherReport report = new WeeklyWeatherReport();
        report.displaySummary();
    }
}

