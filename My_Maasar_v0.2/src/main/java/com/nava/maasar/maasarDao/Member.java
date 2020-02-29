package com.nava.maasar.maasarDao;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author j713n
 */
@Entity
@Table(name="Member")
public class Member implements Serializable {
    
    @Id
    @Column(name="id")
    private int id;
    private String first_name;
    private String last_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    
    public Member(){
        //default constructor
    }
    
    public Member(int id, String first_name, String last_name) {
        setId(id);
        setFirst_name(first_name);
        setLast_name(last_name);
    }
    
}
