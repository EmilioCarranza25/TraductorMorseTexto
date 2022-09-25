package com.api.morsetext.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="morse_out")
public class model_out {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String message;

    public model_out() {
    }

    public model_out(Integer id, String message) {
        this.id = id;
        this.message = message;
    }
}
