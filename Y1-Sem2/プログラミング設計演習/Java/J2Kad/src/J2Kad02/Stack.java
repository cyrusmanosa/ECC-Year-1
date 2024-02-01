package J2Kad02;

public class Stack {
    int size;
    int [] data;
    int i = 0;
    public void createStack(int size){
        this.size = size;
        data = new int[size];
    }
    public void push(int data){
        this.data[i] = data;
        i++;
    }
    public int pop(){
        return  data[--i];
    }

    public int getData(int i){
        return data[i];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        if(i==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(i == (size -1)){
            return true;
        }else{
            return false;
        }
    }
}
