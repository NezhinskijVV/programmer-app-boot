package ru.itsjava.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Notebook {
    private final String firm;
    private final String model;
    private final int year;

    @Override
    public String toString() {
        return "Notebook{" + firm + " " + model + " " + year +"}";
    }
}
