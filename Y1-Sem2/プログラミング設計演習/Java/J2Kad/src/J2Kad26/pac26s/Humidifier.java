package J2Kad26.pac26s;

class HumidifierTypeA implements Humidifier{
    public void hmdOn() { System.out.println("�y������A�zON�ɂ��܂����I");}
    public void hmdOff() { System.out.println("�y������A�zOFF�ɂ��܂����I");}
}

interface Humidifier{
    void hmdOn();
    void hmdOff();
}