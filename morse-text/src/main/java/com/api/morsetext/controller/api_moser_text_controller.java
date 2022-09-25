package com.api.morsetext.controller;


import com.api.morsetext.model.model_in;
import com.api.morsetext.model.model_out;
import com.api.morsetext.service.api_moser_text_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class api_moser_text_controller {

    private String response;

    @Autowired
    private api_moser_text_service api_moser_text_service;


    @PostMapping("/traductor")
    @ResponseBody
    public ResponseEntity<?> getTraductor(@RequestBody model_in model_in) {

        response = api_moser_text_service.traductor(model_in.getText(), model_in.getNum());
        model_out response_out = new model_out();
        response_out.setMessage(response);

        Map<String, Object> responses = new HashMap<>();
        try{
            if(response!="NA"){
                responses.put("Message", response_out.getMessage());
            }
        }catch (Exception e){

            System.out.println("Ingrese Valores correctos "+  e.getMessage());
            responses.put("Message", "Ingrese Valores correctos ");
            responses.put("Error:", e.getMessage());
            return new ResponseEntity<Map<String, Object>>(responses, HttpStatus.BAD_REQUEST);

        }

        return new ResponseEntity<Map<String, Object>>(responses, HttpStatus.OK);

    }

}
