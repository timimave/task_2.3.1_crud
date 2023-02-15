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
    @Column(name = "Is_a")
    private boolean APersonWhoStudiesJava;



    public User() {
    }

    public User(String firstName, String lastName, String email) {
        this.name = firstName;
        this.lastName = lastName;
        this.APersonWhoStudiesJava = APersonWhoStudiesJava;


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

    public boolean getIsAPersonWhoStudiesJava() {
        return APersonWhoStudiesJava;
    }

    public void setAPersonWhoStudiesJava(boolean APersonWhoStudiesJava) {
        this.APersonWhoStudiesJava = APersonWhoStudiesJava;
    }

    @Override
    public String toString() {
        return String.format(
            "User id = %d, firstName = '%s', lastName = '%s'",
            id, name, lastName);

    }

}
