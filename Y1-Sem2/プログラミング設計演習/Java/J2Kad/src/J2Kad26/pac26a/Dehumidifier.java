package J2Kad26.pac26a;

class DehumidifierTypeA implements Dehumidifier{
    public void dehmdOn() { System.out.println("�y������A�zON�ɂ��܂����I");}
    public void dehmdOff() { System.out.println("�y������A�zOFF�ɂ��܂����I");}
}

interface Dehumidifier{
    void dehmdOn();
    void dehmdOff();
}