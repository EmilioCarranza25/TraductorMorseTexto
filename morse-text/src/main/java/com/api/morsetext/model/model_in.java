package com.api.morsetext.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="morse")
public class model_in {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;
    private int num;

    public model_in(Integer id, String text, int num) {
        this.id = id;
        this.text = text;
        this.num = num;
    }

    public model_in() {
    }

    public String textoCompleto(){
        return text + " " + num;
    }
}
