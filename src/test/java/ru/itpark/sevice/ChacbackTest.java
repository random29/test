package ru.itpark.sevice;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class ChacbackTest {

    @org.junit.jupiter.api.Test
    @DisplayName("should calculate cachvack")
    void cachback() {
        Chacback chacback = new Chacback();
        int result = chacback.cachback(1000);
        assertEquals(50, result);
    }
}