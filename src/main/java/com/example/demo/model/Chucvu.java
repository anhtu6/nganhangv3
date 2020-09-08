package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.util.Collection;

@Entity
public class Chucvu {
    @Id
    @Column(length = 10)
    private String machucvu;
    @Column(length = 45)
    private String tenchucvu;


    public Chucvu(){

    }

    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }
}
