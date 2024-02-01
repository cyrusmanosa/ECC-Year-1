package J2Kad26.pac26a;

interface Command { void execute(); }

class CmdSetCool implements Command{
    private Aircon ac;
    public CmdSetCool(Aircon ac){ this.ac = ac; }
    @Override
    public void execute(){ ac.setCool();}
    public String toString(){return "ó‚ñ[";}
}
class CmdSetWarm implements Command{
    private Aircon ac;
    public CmdSetWarm(Aircon ac){ this.ac = ac; }
    @Override
    public void execute(){ ac.setWarm();}
    public String toString(){ return "ígñ["; }
}

class CmdHmdOn implements Command{
    private Humidifier hu;
    public CmdHmdOn(Humidifier hu){ this.hu = hu; }
    @Override
    public void execute(){ hu.hmdOn();}
    public String toString(){ return "â¡éºON"; }
}

class CmdHmdOff implements Command{
    private Humidifier hu;
    public CmdHmdOff(Humidifier hu){ this.hu = hu; }
    @Override
    public void execute(){ hu.hmdOff();}
    public String toString(){ return "â¡éºOFF"; }
}

class CmdDeHmdOn implements Command{
    private Dehumidifier de;
    public CmdDeHmdOn(Dehumidifier de){this.de = de;}
    @Override
    public void execute(){ de.dehmdOn();}
    public String toString(){ return "èúéºON"; }
}

class CmdDeHmdOff implements Command{
    private Dehumidifier de;
    public CmdDeHmdOff(Dehumidifier de){this.de = de;}
    @Override
    public void execute(){ de.dehmdOff();}
    public String toString(){ return "èúéºOFF"; }
}