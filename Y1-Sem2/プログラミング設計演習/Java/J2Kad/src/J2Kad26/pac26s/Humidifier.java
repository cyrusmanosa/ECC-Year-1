package J2Kad26.pac26s;

class HumidifierTypeA implements Humidifier{
    public void hmdOn() { System.out.println("Åyâ¡éºäÌAÅzONÇ…ÇµÇ‹ÇµÇΩÅI");}
    public void hmdOff() { System.out.println("Åyâ¡éºäÌAÅzOFFÇ…ÇµÇ‹ÇµÇΩÅI");}
}

interface Humidifier{
    void hmdOn();
    void hmdOff();
}