package Data_Structures;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(8);
        list.insertfirst(17);
        list.insertlast(99);
        list.insert(99,65);

        list.display();
    }
}
