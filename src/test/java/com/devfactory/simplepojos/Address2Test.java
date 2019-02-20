package com.devfactory.simplepojos;

import static com.devfactory.simplepojos.Counter.decrement;
import static com.devfactory.simplepojos.Counter.increment;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;

public class Address2Test {

    @Test
    public void Should_Pass_All_Pojo_Tests() {
        final Class<?> classUnderTest = Address.class;
        increment("Starting address2 test 1");
        assertPojoMethodsFor(classUnderTest).areWellImplemented();
        decrement("Done address2 test 1");
    }

    @Test
    public void Should_Pass_All_Pojo_Tests2() {
        final Class<?> classUnderTest = Address.class;
        increment("Starting address2 test 2");
        assertPojoMethodsFor(classUnderTest).areWellImplemented();
        decrement("Done address2 test 2");
    }

    @Test
    public void Should_Pass_All_Pojo_Tests3() {
        final Class<?> classUnderTest = Address.class;
        increment("Starting address2 test 3");
        assertPojoMethodsFor(classUnderTest).areWellImplemented();
        decrement("Done address2 test 3");
    }

    @Test
    public void Should_Pass_All_Pojo_Tests4() {
        final Class<?> classUnderTest = Address.class;
        increment("Starting address2 test 4");
        assertPojoMethodsFor(classUnderTest).areWellImplemented();
        decrement("Done address2 test 4");
    }

}
