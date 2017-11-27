/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Jugador {

    private int saldo;
    char[] respuesta;
    int aciertos = 0;
    int ganar = 0;
    ArrayList acertadas;
    private String palabra;

    public void setPalabra(String palabra) {
        this.palabra = palabra;
        setX(palabra.length());
        ganar = palabra.length();
        acertadas = new ArrayList();
    }

    public boolean ganar() {
        return ganar - aciertos == 0;
    }

    public void setSaldo(int s1) {
        this.saldo = s1;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setX(int n) {
        respuesta = new char[n];
        for (int i = 0; i < n; i++) {
            respuesta[i] = '*';
        }
    }

    public String getRespuesta() {
//        return Arrays.toString(respuesta);
        return String.valueOf(respuesta);
    }

    public void realizarApuesta(int apuesta, String letra) {

        if (palabra.contains(letra)) {
            int i = 0;
            boolean encontrado = false;
            while (i < palabra.length() && !encontrado) {
                
                    if (palabra.charAt(i) == letra.charAt(0)) {
                        if (!acertadas.contains(i)) {
                        respuesta[i] = letra.charAt(0);
                        acertadas.add(i);
                        aciertos += 1;

                        }
                         else {
                    this.saldo -= 1;
                    encontrado = true;
                    }
                
                }
                i++;

            }
        } else {
            this.saldo -= 1;
        }

    }
}
