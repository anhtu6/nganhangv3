package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.util.Collection;

@Entity
public class Chucvu {
    @Id
    //@Column(length = 10)
    @GeneratedValue
    private Long machucvu;
    @Column(length = 45)
    private String tenchucvu;

    @OneToMany(mappedBy = "chucvu",cascade = CascadeType.ALL)
    private Collection<Nhanvien> nhanviens;
    public Chucvu(){

    }

    public Long getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(Long machucvu) {
        this.machucvu = machucvu;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }
}
