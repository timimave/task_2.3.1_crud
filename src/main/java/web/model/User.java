package web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "is_person_studying_java")
    private boolean PersonWhoStudiesJava;



    public User() {
    }

    public User(String name, String lastName, boolean personWhoStudiesJava) {
        this.name = name;
        this.lastName = lastName;
        PersonWhoStudiesJava = personWhoStudiesJava;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPersonWhoStudiesJava() {
        return PersonWhoStudiesJava;
    }

    public void setPersonWhoStudiesJava(boolean personWhoStudiesJava) {
        PersonWhoStudiesJava = personWhoStudiesJava;
    }

    @Override
    public String toString() {
        return String.format(
            "User id = %d, firstName = '%s', lastName = '%s'",
            id, name, lastName);

    }

}
