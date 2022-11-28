package com.vkatvit;

import org.hamcrest.JMock1Matchers;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainTest {

    private Main main;

    @BeforeAll
    public void init(){
        main = new Main();
    }

    @Test
    public void testHelloWorld(){
        main = new Main();
        assertThat(main.helloWorld(), equalTo("hello world"));
    }


}
