package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Sonboseok {

    @Test
    public void test_양수곱셈() {
        Calculator calc = new Calculator();
        int result = calc.add(5, 4);
        assertEquals("두 곱셈의 값은 20이어야 합니다.",20, result);
    }
}
