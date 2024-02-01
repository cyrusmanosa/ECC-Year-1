package J2Kad26.pac26s;

public class AllInOne extends AllinOneAdapter {
    public void setCool() { System.out.println("【オールインワン】もっと快適エコな冷房にしました！"); }
    public void setWarm() { System.out.println("【オールインワン】もっと快適エコな暖房にしました！"); }
    public void hmdOn() { System.out.println("【オールインワン】加湿機能をオンにしました！"); }
    public void hmdOff() { System.out.println("【オールインワン】加湿機能をオフにしました！"); }
    public void dehmdOn() { System.out.println("【オールインワン】除湿機能をオンにしました！"); }
    public void dehmdOff() { System.out.println("【オールインワン】除湿機能をオフにしました！"); }
}

class AllinOneAdapter implements Aircon, Dehumidifier, Humidifier{
    private AllInOne ac;

    @Override
    public void setCool() {

    }

    @Override
    public void setWarm() {

    }

    @Override
    public void dehmdOn() {

    }

    @Override
    public void dehmdOff() {

    }

    @Override
    public void hmdOn() {

    }

    @Override
    public void hmdOff() {

    }
}
