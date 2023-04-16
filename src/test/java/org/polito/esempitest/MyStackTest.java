package org.polito.esempitest;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    private MyStack s;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        s = new MyStack();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void pushTest() {
        s.push(1);
        s.push(2);
        s.push(3);
       int valore = s.pop();
       assertEquals(3,valore);
    }
}