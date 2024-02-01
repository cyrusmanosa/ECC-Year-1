package J2Kad08;

public interface IContainer {
    void push(Monster data);
    Monster pop();
    Monster getData(int i);
    int size();
    boolean empty();
    boolean full();
}
