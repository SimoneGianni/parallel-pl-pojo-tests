package com.devfactory.simplepojos;

import static com.devfactory.simplepojos.Counter.decrement;
import static com.devfactory.simplepojos.Counter.increment;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;

public class Person2Test {

    @Test
    public void Should_Pass_All_Pojo_Tests1() {
        final Class<?> classUnderTest = Person.class;
        increment("Starting person2 test 1");
        assertPojoMethodsFor(classUnderTest).thoroughly().areWellImplemented();
        decrement("Done person2 test 1");
    }

    @Test
    public void Should_Pass_All_Pojo_Tests2() {
        final Class<?> classUnderTest = Person.class;
        increment("Starting person2 test 2");
        assertPojoMethodsFor(classUnderTest).thoroughly().areWellImplemented();
        decrement("Done person2 test 2");
    }

    @Test
    public void Should_Pass_All_Pojo_Tests3() {
        final Class<?> classUnderTest = Person.class;
        increment("Starting person2 test 3");
        assertPojoMethodsFor(classUnderTest).thoroughly().areWellImplemented();
        decrement("Done person2 test 3");
    }

    @Test
    public void Should_Pass_All_Pojo_Tests4() {
        final Class<?> classUnderTest = Person.class;
        increment("Starting person2 test 4");
        assertPojoMethodsFor(classUnderTest).thoroughly().areWellImplemented();
        decrement("Done person2 test 4");
    }

}
