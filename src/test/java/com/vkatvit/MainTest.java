package com.vkatvit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MainTest extends DefaultTest{

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
