# TraductorMorseTexto
Traductor Morse a texto y viserversa

Para poder ejecutar este desarrollo es necesario compilar el codigo.

![image](https://user-images.githubusercontent.com/114368126/192170536-126c6ed9-f45e-4111-a3bd-521048f5c2bb.png)


Una Vez corriendo el programa validar el puerto de comunicacion es el 8080

![image](https://user-images.githubusercontent.com/114368126/192170569-ec55d985-2d03-47b8-b7cd-4027a4711aae.png)

URL de Consumo: http://localhost:8080/traductor

Request Entrada Texto a Morse:

el valor del texto es al que se desea traducir a morse y el num 1 es para realizar esta traduccion

{    
        "text":"HOLA MELI",
        "num":1
}

Response Texto a Morse:

{
    "Message": ".... --- .-.. .-   -- . .-.. .. "
}

![image](https://user-images.githubusercontent.com/114368126/192170619-d88932b5-0bb1-491e-8852-a8fbf4b41579.png)


Request Estrada Morse a Texto:

el valor del texto es al que se desea traducir a texto y el num 2 es para realizar esta traduccion


{    
        "text":".... --- .-.. .-   -- . .-.. ..",
        "num":2
}

Response Morse a Texto:

{
    "Message": "HOLA MELI"
}

![image](https://user-images.githubusercontent.com/114368126/192170684-daa2748f-03d9-477d-8bfa-e4925a1d0c37.png)


Error al enviar mal el Request

Error 400 Bad Request

![image](https://user-images.githubusercontent.com/114368126/192170713-27e279bd-45fd-4ee9-aa26-70703a39a7ea.png)







