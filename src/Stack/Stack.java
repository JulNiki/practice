package Stack;

public class Stack {
    private char[] array;
    private int tail;

    public Stack(int n) {
        array = new char[n];
        tail = -1;
    }

    public void push(char c) throws StackException{
      if (tail == array.length-1) throw new StackException("Стек заполнен!");
      array[++tail] = c;
    }

    public char pop() throws StackException {
        if (tail == -1) {
            throw new StackException("Попытка извлечь из пустого стека!");
        }
        char tmp = array[tail];
        array[tail] = '0';
        tail--;
        return tmp;
    }
    public void print() throws  StackException{
        if (tail == -1) throw new StackException("Стек пуст");
        for (int i = tail; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void clear(){
       tail = -1;
    }
 }
