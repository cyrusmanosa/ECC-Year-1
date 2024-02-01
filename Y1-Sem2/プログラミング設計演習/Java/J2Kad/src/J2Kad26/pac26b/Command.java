package J2Kad26.pac26b;

interface Command { void execute(); }

class CmdSetCool implements Command{
    private Aircon ac;
    public CmdSetCool(Aircon ac){ this.ac = ac; }
    @Override
    public void execute(){ ac.setCool();}
    public String toString(){return "—â–[";}
}

class CmdSetWarm implements Command{
    private Aircon ac;
    public CmdSetWarm(Aircon ac){ this.ac = ac; }

    @Override
    public void execute(){ ac.setWarm();}
    public String toString(){ return "’g–["; }
}
