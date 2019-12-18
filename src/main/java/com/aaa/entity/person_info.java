package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_info")
public class person_info {
    @Id
    @Column
    private Integer person_id;
    @Column
    private String person_name;
    @Column
    private Integer person_area_id;
    @Column
    private Integer person_age;
    @Column
    private String person_address;




    public person_info() {
    }

    public person_info(String person_name, Integer person_area_id, Integer person_age, String person_address) {
        this.person_name = person_name;
        this.person_area_id = person_area_id;
        this.person_age = person_age;
        this.person_address = person_address;
    }

    @Override
    public String toString() {
        return "person_info{" +
                "person_id=" + person_id +
                ", person_name='" + person_name + '\'' +
                ", person_area_id=" + person_area_id +
                ", person_age=" + person_age +
                ", person_address='" + person_address + '\'' +
                '}';
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public Integer getPerson_area_id() {
        return person_area_id;
    }

    public void setPerson_area_id(Integer person_area_id) {
        this.person_area_id = person_area_id;
    }

    public Integer getPerson_age() {
        return person_age;
    }

    public void setPerson_age(Integer person_age) {
        this.person_age = person_age;
    }

    public String getPerson_address() {
        return person_address;
    }

    public void setPerson_address(String person_address) {
        this.person_address = person_address;
    }
}
