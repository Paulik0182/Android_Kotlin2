package com.android.kotlin;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    //это пример конструктора. его можно приобразовать в код Kotlin
    //для приобразования нажать Ctrl+Alt+Shift+K
    //данный код будет преобразован в следующее
    // data class Person(val firstName: String, val lastName: String, val age: Int)

    void doSomething() {
        SomeSingleton.INSTANCE.getB();
    }
}
