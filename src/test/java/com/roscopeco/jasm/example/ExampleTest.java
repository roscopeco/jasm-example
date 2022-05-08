package com.roscopeco.jasm.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExampleTest {
    @Test
    void testTheTestClass() {
        assertThat(TestClass.getTestValue()).isEqualTo("Test Value");
    }
}