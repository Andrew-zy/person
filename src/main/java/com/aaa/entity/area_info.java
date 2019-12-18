package com.aaa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "area_info")
public class area_info {
    @Id
    @Column
    private Integer area_id;
    @Column
    private String area_name;


    public area_info() {
    }

    public area_info(String area_name) {
        this.area_name = area_name;
    }

    @Override
    public String toString() {
        return "area_info{" +
                "area_id=" + area_id +
                ", area_name='" + area_name + '\'' +
                '}';
    }

    public Integer getArea_id() {
        return area_id;
    }

    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }
}
