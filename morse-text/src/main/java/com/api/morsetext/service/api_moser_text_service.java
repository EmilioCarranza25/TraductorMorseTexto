package com.api.morsetext.service;

import org.springframework.stereotype.Service;

@Service
public class api_moser_text_service {

    public static String mensajeN = "", mensajeM = "", salida = "", entry = "";
    public static boolean bandera = true;

    public String traductor(String text, Integer num) {
        String codigos[] = {};

        if (num == 1) {
            System.out.println("Ingresa tu texto");
            mensajeN=text;
            for(int i=0;i<mensajeN.length();i++){
                mensajeM+=traductorTM(mensajeN.charAt(i));
            }
            System.out.println(mensajeM);
            return mensajeM;
        } else if (num == 2) {
            System.out.println("Ingresa tu codigo morse");
            mensajeM=text;
            codigos=mensajeM.split(" ");
            mensajeN="";
            for (int i = 0; i < codigos.length; i++) {
                if(codigos[i].equals("") && bandera){
                    i++;
                }
                mensajeN+=traductorMT(codigos[i]);
            }
            System.out.println(mensajeN);
            return mensajeN;

        }else{

            return "Ingresa una opción valida";
        }


    }


    public static String traductorTM(char character) {
        switch (character) {
            case 'A':
                salida = ".-";
                break;
            case 'B':
                salida = "-...";
                break;
            case 'C':
                salida = "-.-.";
                break;
            case 'D':
                salida = "-..";
                break;
            case 'E':
                salida = ".";
                break;
            case 'F':
                salida = "..-.";
                break;
            case 'G':
                salida = "--.";
                break;
            case 'H':
                salida = "....";
                break;
            case 'I':
                salida = "..";
                break;
            case 'J':
                salida = ".---";
                break;
            case 'K':
                salida = "-.-";
                break;
            case 'L':
                salida = ".-..";
                break;
            case 'M':
                salida = "--";
                break;
            case 'N':
                salida = "-.";
                break;
            case 'O':
                salida = "---";
                break;
            case 'P':
                salida = ".--.";
                break;
            case 'Q':
                salida = "--.-";
                break;
            case 'R':
                salida = ".-.";
                break;
            case 'S':
                salida = "...";
                break;
            case 'T':
                salida = "-";
                break;
            case 'U':
                salida = "..-";
                break;
            case 'V':
                salida = "...-";
                break;
            case 'W':
                salida = ".--";
                break;
            case 'X':
                salida = "-..-";
                break;
            case 'Y':
                salida = "-.--";
                break;
            case 'Z':
                salida = "--..";
                break;
            case '1':
                salida = ".----";
                break;
            case '2':
                salida = "..---";
                break;
            case '3':
                salida = "...--";
                break;
            case '4':
                salida = "....-";
                break;
            case '5':
                salida = ".....";
                break;
            case '6':
                salida = "-....";
                break;
            case '7':
                salida = "--...";
                break;
            case '8':
                salida = "---..";
                break;
            case '9':
                salida = "----.";
                break;
            case '0':
                salida = "-----";
                break;
            case ' ':
                salida = " ";
                break;
            default:
                salida = "";
                break;
        }
        return salida + " ";
    }

    public static String traductorMT(String chain) {
        switch (chain) {
            case ".-":
                salida = "A";
                break;
            case "-...":
                salida = "B";
                break;
            case "-.-.":
                salida = "C";
                break;
            case "-..":
                salida = "D";
                break;
            case ".":
                salida = "E";
                break;
            case "..-.":
                salida = "F";
                break;
            case "--.":
                salida = "G";
                break;
            case "....":
                salida = "H";
                break;
            case "..":
                salida = "I";
                break;
            case ".---":
                salida = "J";
                break;
            case "-.-":
                salida = "K";
                break;
            case ".-..":
                salida = "L";
                break;
            case "--":
                salida = "M";
                break;
            case "-.":
                salida = "N";
                break;
            case "---":
                salida = "O";
                break;
            case ".--.":
                salida = "P";
                break;
            case "--.-":
                salida = "Q";
                break;
            case ".-.":
                salida = "R";
                break;
            case "...":
                salida = "S";
                break;
            case "-":
                salida = "T";
                break;
            case "..-":
                salida = "U";
                break;
            case "...-":
                salida = "V";
                break;
            case ".--":
                salida = "W";
                break;
            case "-..-":
                salida = "X";
                break;
            case "-.--":
                salida = "Y";
                break;
            case "--..":
                salida = "Z";
                break;
            case ".----":
                salida = "1";
                break;
            case "..---":
                salida = "2";
                break;
            case "...--":
                salida = "3";
                break;
            case "....-":
                salida = "4";
                break;
            case ".....":
                salida = "5";
                break;
            case "-....":
                salida = "6";
                break;
            case "--...":
                salida = "7";
                break;
            case "---..":
                salida = "8";
                break;
            case "----.":
                salida = "9";
                break;
            case "-----":
                salida = "0";
                break;
            case "":
                salida = " ";
                break;
            default:
                salida = "";
                break;
        }
        return salida;
    }

}


