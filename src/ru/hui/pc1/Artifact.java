package ru.hui.pc1;

public class Artifact {

    int name;
    String culture;
    int age;
    public Artifact(int name) {

            this.name = name;
        }

    public Artifact(int name, String culture) {

            this.name = name;
            this.culture = culture;
    }

    public Artifact(int name, String culture, int age) {

            this.name = name;
            this.culture = culture;
            this.age = age;
    }
}
