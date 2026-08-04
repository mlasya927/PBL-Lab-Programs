package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({

        TestStringConcat.class,
        TestSortValues.class,
        TestCheckPresence.class

})

public class TestSuite {

}