package com.vkatvit.academical;

import com.vkatvit.DefaultTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class StringFeaturesTest extends DefaultTest {

    private StringFeatures stringFeatures;

    @BeforeAll
    public void init() {
        stringFeatures = new StringFeatures();
    }

    @Test
    public void checkValidPhone() {
        assertThat(stringFeatures.reverseString("home"), equalTo("emoh"));
    }

}
