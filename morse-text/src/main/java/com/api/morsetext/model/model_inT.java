package com.api.morsetext.model;

public class model_inT {
    private String texto;
    private String morse;

    public model_inT(String texto, String morse) {
        this.texto = texto;
        this.morse = morse;
    }

    public String completoText(){
        return texto + " " + morse;
    }
}
