package com.wipro.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {

    @Test
    public void testStringConcat() {

        DailyTasks dt = new DailyTasks();

        assertEquals("Hello World",
                dt.doStringConcat("Hello", "World"));
    }
}