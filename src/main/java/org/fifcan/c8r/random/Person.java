package org.fifcan.c8r.random;

import javax.persistence.Entity;

@Entity
public class Person extends UuidPanacheEntityBase {
    public String name;
    public String presentTo;

    public static Person findByName(String name) {
        return find("name", name).firstResult();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", presentTo='" + presentTo + '\'' +
                '}';
    }
}