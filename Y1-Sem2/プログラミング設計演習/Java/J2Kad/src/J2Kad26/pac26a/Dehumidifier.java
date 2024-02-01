package J2Kad26.pac26a;

class DehumidifierTypeA implements Dehumidifier{
    public void dehmdOn() { System.out.println("【除湿器A】ONにしました！");}
    public void dehmdOff() { System.out.println("【除湿器A】OFFにしました！");}
}

interface Dehumidifier{
    void dehmdOn();
    void dehmdOff();
}