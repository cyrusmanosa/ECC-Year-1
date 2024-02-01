package J2Kad26.pac26a;

class DehumidifierTypeA implements Dehumidifier{
    public void dehmdOn() { System.out.println("yœ¼ŠíAzON‚É‚µ‚Ü‚µ‚½I");}
    public void dehmdOff() { System.out.println("yœ¼ŠíAzOFF‚É‚µ‚Ü‚µ‚½I");}
}

interface Dehumidifier{
    void dehmdOn();
    void dehmdOff();
}