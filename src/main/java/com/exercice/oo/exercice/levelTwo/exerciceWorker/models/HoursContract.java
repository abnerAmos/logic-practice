package com.exercice.oo.exercice.levelTwo.exerciceWorker.models;

import java.util.Date;

public class HoursContract {

    private Date date;
    private double valuePorHour;
    private Integer hour;

    public HoursContract(Date date, double valuePorHour, Integer hour) {
        this.date = date;
        this.valuePorHour = valuePorHour;
        this.hour = hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePorHour() {
        return valuePorHour;
    }

    public void setValuePorHour(double valuePorHour) {
        this.valuePorHour = valuePorHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
}
