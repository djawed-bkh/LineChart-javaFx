package sample;

import javafx.beans.property.SimpleFloatProperty;

public class Valeurs {
    private final SimpleFloatProperty val_v;
    private final SimpleFloatProperty valeur_I;
    private final SimpleFloatProperty temperature;
    private final SimpleFloatProperty P;


    public Valeurs(float val_v, float valeur_I, float temperature, float p) {
        this.val_v = new SimpleFloatProperty(val_v);
        this.valeur_I =new SimpleFloatProperty(valeur_I);
        this.temperature = new SimpleFloatProperty(temperature);
        P =new SimpleFloatProperty(p);
    }

    public float getP() {
        return P.get();
    }

    public SimpleFloatProperty pProperty() {
        return P;
    }

    public void setP(float p) {
        this.P.set(p);
    }

    public float getVal_v() {
        return val_v.get();
    }

    public SimpleFloatProperty val_vProperty() {
        return val_v;
    }

    public void setVal_v(float val_v) {
        this.val_v.set(val_v);
    }

    public float getValeur_I() {
        return valeur_I.get();
    }

    public SimpleFloatProperty valeur_IProperty() {
        return valeur_I;
    }

    public void setValeur_I(float valeur_I) {
        this.valeur_I.set(valeur_I);
    }

    public float getTemperature() {
        return temperature.get();
    }

    public SimpleFloatProperty temperatureProperty() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature.set(temperature);
    }
}
