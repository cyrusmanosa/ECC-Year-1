package J2Kad26.pac26s;

public class AllInOne extends AllinOneAdapter {
    public void setCool() { System.out.println("�y�I�[���C�������z�����Ɖ��K�G�R�ȗ�[�ɂ��܂����I"); }
    public void setWarm() { System.out.println("�y�I�[���C�������z�����Ɖ��K�G�R�Ȓg�[�ɂ��܂����I"); }
    public void hmdOn() { System.out.println("�y�I�[���C�������z�����@�\���I���ɂ��܂����I"); }
    public void hmdOff() { System.out.println("�y�I�[���C�������z�����@�\���I�t�ɂ��܂����I"); }
    public void dehmdOn() { System.out.println("�y�I�[���C�������z�����@�\���I���ɂ��܂����I"); }
    public void dehmdOff() { System.out.println("�y�I�[���C�������z�����@�\���I�t�ɂ��܂����I"); }
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
