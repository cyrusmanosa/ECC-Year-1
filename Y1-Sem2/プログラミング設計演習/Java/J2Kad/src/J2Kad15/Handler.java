package J2Kad15;

public abstract class Handler {
    protected String name;
    protected Handler next;
    public Handler (String name){
        this.name = name;
        System.out.println(name + "がスタンバイしました！");
    }

    public boolean handle(int n) {
            return resolve(n);
        }
    public String toString(){ return name; }
    public abstract boolean resolve(int n);

    public Handler setNext(Handler Handler){
        this.next = Handler;
        return Handler;
    }
}
