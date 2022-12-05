package com.exercice.oo.exercice.levelTwo.exerciceWorker.services;

import com.exercice.oo.exercice.levelTwo.exerciceWorker.models.HoursContract;

public interface WorkerService {

    void addContract(HoursContract contract);

    void removeContract(HoursContract hoursContract);

    Double income(Integer year, Integer month);

    Double totalValue();
}
