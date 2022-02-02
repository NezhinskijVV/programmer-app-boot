package ru.itsjava.domain;

import lombok.RequiredArgsConstructor;

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
