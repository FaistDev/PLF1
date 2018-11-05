/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Ben
 */
public class Wetter {

    private String place;
    private int sealevel;
    private float temp;
    private int humidity;

    public Wetter(String place, int sealevel, float temp, int humidity) throws Exception {
        setTemp(temp);
        setHumidity(humidity);
        this.place = place;
        this.sealevel = sealevel;

    }

    public void setTemp(float temp) throws Exception {
        if (temp < -35 || temp > 45) {
            throw new Exception("Falscher Temperatur-Wert");
        }
        this.temp = temp;
    }

    public void setHumidity(int humidity) throws Exception {
        if (humidity < 0 || humidity > 100) {
            throw new Exception("Falscher Luftfeuchtigkeit-Wert");
        }
    }

}
