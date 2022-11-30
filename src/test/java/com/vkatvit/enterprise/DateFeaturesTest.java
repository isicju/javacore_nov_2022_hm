package com.vkatvit.enterprise;

import com.vkatvit.DefaultTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.Calendar;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DateFeaturesTest extends DefaultTest {

    DateFeatures dateFeatures;

    @BeforeAll
    public void init(){
        dateFeatures = new DateFeatures();
    }

    @Test
    public void buildSqlDateTest(){
        Date date = dateFeatures.buildSqlDate(12,3,2000);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        assertThat(2000, equalTo(cal.get(Calendar.YEAR)));
        assertThat(3, equalTo(cal.get(Calendar.MONTH) + 1));
        assertThat(12, equalTo(cal.get(Calendar.DAY_OF_MONTH)));
    }

}
