package com.exercice.oo.exercice.levelTwo.exerciceWorker.models;

import java.util.Date;

public class HoursContract {

    private Date date;
    private double valuePerHour;
    private Integer hours;

    public HoursContract(Date date, double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePorHour() {
        return valuePerHour;
    }

    public void setValuePorHour(double valuePorHour) {
        this.valuePerHour = valuePorHour;
    }

    public Integer getHour() {
        return hours;
    }

    public void setHour(Integer hour) {
        this.hours = hour;
    }

    public double totalValue() {
        return valuePerHour * hours;
    }
}
