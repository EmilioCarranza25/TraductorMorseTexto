package com.api.morsetext;


import com.api.morsetext.model.model_inT;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class morseTest {

    @Test
    public void testMorse(){
        model_inT m = new model_inT("HOLA","1");
        String textoIn = m.completoText();

        Assertions.assertEquals("HOLA 1", textoIn);
    }
}
