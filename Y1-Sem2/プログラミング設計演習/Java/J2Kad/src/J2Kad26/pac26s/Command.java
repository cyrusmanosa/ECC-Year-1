package J2Kad26.pac26s;

interface Command { void execute(); }

class CmdSetCool implements Command{
    private AllInOne ac;
    public CmdSetCool( AllInOne ac){ this.ac = ac; }
    @Override
    public void execute(){ ac.setCool();}
    public String toString(){ return "ó‚ñ[";}
}

class CmdSetWarm implements Command{
    private AllInOne ac;
    public CmdSetWarm( AllInOne ac){ this.ac = ac; }
    @Override
    public void execute(){ ac.setWarm();}
    public String toString(){ return "ígñ["; }
}

class CmdHmdOn implements Command{
    private AllInOne ac;
    public CmdHmdOn( AllInOne ac){ this.ac = ac; }
    @Override
    public void execute(){ ac.hmdOn();}
    public String toString(){ return "â¡éºON"; }
}

class CmdHmdOff implements Command{
    private AllInOne ac;
    public CmdHmdOff( AllInOne ac){ this.ac = ac; }
    @Override
    public void execute(){ ac.hmdOff();}
    public String toString(){ return "â¡éºOFF"; }
}

class CmdDeHmdOn implements Command{
    private AllInOne ac;
    public CmdDeHmdOn( AllInOne ac){ this.ac = ac; }
    @Override
    public void execute(){ ac.dehmdOn();}
    public String toString(){ return "èúéºON"; }
}

class CmdDeHmdOff implements Command{
    private AllInOne ac;
    public CmdDeHmdOff( AllInOne ac){ this.ac = ac; }
    @Override
    public void execute(){ ac.dehmdOff(); }
    public String toString(){ return "èúéºOFF"; }
}