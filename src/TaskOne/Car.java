package TaskOne;
import java.util.Scanner;

/*
 Описати клас для бази зданих з інформацією про автомобілі з полями: марка, колір, номер, рік випуску, дані про власника.
 Відсортувати масив даних по марках автомобілів та вивести його на екран у формі таблиці.
 Визначити кількість різних кольорів кожної марки.
* */

public class Car {
    String marka;
    String kolir;
    String nomer;
    int rik_vipusky;
    String dani_pro_vlasnika;

    public Car() {
        marka = "";
        kolir = "";
        nomer = "";
        rik_vipusky = 0;
        dani_pro_vlasnika = "";

    }

    public Car(String marka, String kolir, String nomer, int rik_vipusky, String dani_pro_vlasnika) {
        this.marka = marka;
        this.kolir = kolir;
        this.nomer = nomer;
        this.rik_vipusky = rik_vipusky;
        this.dani_pro_vlasnika = dani_pro_vlasnika;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka= marka;
    }

    public String getKolir() {
        return kolir;
    }

    public void setKolir(String kolir) {
        this.kolir = kolir;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public  int getrik_vipusky() {
    return rik_vipusky;
}
    public void setrik_vipusky(int rik_vipusky) {
        this.rik_vipusky= rik_vipusky;
    }

    public String getDani_pro_vlasnika() {
        return dani_pro_vlasnika;
    }

    public void setDani_pro_vlasnika(String dani_pro_vlasnika) {
        this.dani_pro_vlasnika = dani_pro_vlasnika;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", kolir='" + kolir + '\'' +
                ", nomer='" + nomer + '\'' +
                ", rik_vipusky=" + rik_vipusky +
                ", dani_pro_vlasnika='" + dani_pro_vlasnika + '\'' +
                '}';
    }
}