package junit;

import org.junit.jupiter.api.*;

import java.lang.module.Configuration;

public class firstjunit {

    @BeforeAll
    static void beforeAll () {
        System.out.println("Это метод @BeforeAll!");
    }
    @AfterAll
    static void AfterAll () {
        System.out.println("Это метод @AFterAll!");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("           Это метод @BeforeEach!");
    }
    @AfterEach
    void afterEach () {
        System.out.println(     "               Это метод @AfterEach!!");
    }
    @Test
    void firstTest() {
        System.out.println("               FirstTest()");
        Assertions.assertTrue(3 > 2);
    }
    @Test
    void secondTest() {
        System.out.println("               SecondTest()");
        Assertions.assertTrue(3>2);
    }
}
