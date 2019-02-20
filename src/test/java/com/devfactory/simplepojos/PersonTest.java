package com.devfactory.simplepojos;

import static com.devfactory.simplepojos.Counter.decrement;
import static com.devfactory.simplepojos.Counter.increment;
import static org.junit.Assert.*;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;

public class PersonTest {

    @Test
    public void lombokIsWorking() {
        Person p = new Person();
        p.setFirstName("Simone");
        p.setLastName("Gianni");
        System.out.println(p.toString());
    }


    @Test
    public void Should_Pass_All_Pojo_Tests1() {
        final Class<?> classUnderTest = Person.class;
        increment("Starting person test 1");
        assertPojoMethodsFor(classUnderTest).areWellImplemented();
        decrement("Done person test 1");
    }

    @Test
    public void Should_Pass_All_Pojo_Tests2() {
        final Class<?> classUnderTest = Person.class;
        increment("Starting person test 2");
        assertPojoMethodsFor(classUnderTest).areWellImplemented();
        decrement("Done person test 2");
    }

    @Test
    public void Should_Pass_All_Pojo_Tests3() {
        final Class<?> classUnderTest = Person.class;
        increment("Starting person test 3");
        assertPojoMethodsFor(classUnderTest).areWellImplemented();
        decrement("Done person test 3");
    }

    @Test
    public void Should_Pass_All_Pojo_Tests4() {
        final Class<?> classUnderTest = Person.class;
        increment("Starting person test 4");
        assertPojoMethodsFor(classUnderTest).areWellImplemented();
        decrement("Done person test 4");
    }

}
