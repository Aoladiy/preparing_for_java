package com.example.exam_44_calc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Entity_Math {
    @Id
    int id;
    int chisl1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int chisl2;

    String znak;

    int rezult;

    public int getChisl1() {
        return chisl1;
    }

    public void setChisl1(int chisl1) {
        this.chisl1 = chisl1;
    }

    public int getChisl2() {
        return chisl2;
    }

    public void setChisl2(int chisl2) {
        this.chisl2 = chisl2;
    }

    public String getZnak() {
        return znak;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }

    public int getRezult() {
        return rezult;
    }

    public void setRezult(int rezult) {
        this.rezult = rezult;
    }

    public Entity_Math(){

    }
}
