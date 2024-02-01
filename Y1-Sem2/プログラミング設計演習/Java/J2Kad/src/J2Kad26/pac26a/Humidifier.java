package J2Kad26.pac26a;

class HumidifierTypeA implements Humidifier{
    public void hmdOn() { System.out.println("【加湿器A】ONにしました！");}
    public void hmdOff() { System.out.println("【加湿器A】OFFにしました！");}
}

interface Humidifier{
    void hmdOn();
    void hmdOff();
}