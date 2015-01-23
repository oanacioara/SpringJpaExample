package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by oanacioara on 1/17/2015.
 */
@Entity
public class Customer {
    private long id;
    private String firstname;
    private String lastname;

    protected Customer(){

    }

    public Customer(String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String toString(){
        return firstname + " " + lastname;
    }
}
