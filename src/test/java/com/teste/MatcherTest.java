package com.teste;

import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class MatcherTest {
    @Test
    public void givenBean_checkToString() {
        Person person = new Person();
        String str = person.toString();

        assertThat(person, HasToString.hasToString(str));
    }

    @Test
    public void givenBean_checkPropertyExist() {
        Person person = new Person("Barrack", "Obama");

        assertThat(person, HasProperty.hasProperty("name"));
    }

    @Test
    public void givenBean_checkEmpty() {
        List<String> emptyList = new ArrayList<>();

        assertThat(emptyList, Matchers.empty());
    }

    @Test
    public void givenBean_checkGreater() {
        assertThat(1, Matchers.greaterThan(0));
    }

    @Test
    public void givenBean_checkNull() {
        String str = null;
        assertThat(str, Matchers.isEmptyOrNullString());
    }
}
