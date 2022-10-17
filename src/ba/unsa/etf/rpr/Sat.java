package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Sat {
    int sati, minute, sekunde;

    Sat (int sati, int minute, int sekunde) {
        Postavi(sati, minute, sekunde);
    }

    public void Postavi (int sati, int minute, int sekunde) {
        this.sati = sati;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    public void Sljedeci () {
        sekunde = sekunde + 1;
        if(sekunde == 60) {
            minute = minute + 1;
            sekunde = 0;
        }
        if (minute == 60) {
            sati = sati + 1;
            minute = 0;
        }
        if(sati == 24) {
            sati = 0;
        }
    }
    public void Prethodni() {
        sekunde = sekunde - 1;
        if(sekunde == -1) {
            sekunde = 59;
            minute = minute - 1;

        }
        if (minute == -1) {
            minute = 59;
            sati = sati - 1;
        }
        if(sati == -1) {
            sati = 23;
        }
    }
    public void PomjeriZa (int pomak) {
        if (pomak > 0) {
            for (int i = 0; i < pomak; i++) {
                Sljedeci();
            }
        }
        else {
            for (int i = 0; i < -pomak; i++){
                Prethodni();
            }
        }
    }
    public int DajSate () {
        return sati;
    }
    public int DajMinute () {
        return minute;
    }
    public int DajSekunde () {
        return sekunde;
    }
    public void Ispisi() {
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }

    public static void main(String[] args) {
        Sat s = null;
        s.Postavi(15,30,45);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0,0,0);
        s.Ispisi();
    }
}