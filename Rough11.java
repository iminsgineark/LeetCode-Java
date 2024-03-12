package Arrays;

public class Rough11 {
    int x = 5;
    void show(){
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        Rough11 d = new Rough11();
        Rough11 d1 = new Rough11();
        d1.x = d1.x + 3;
        d.show();
        d1.show();
    }
}

class ch
{
    String name;
    ch(String name)
    {
        this.name=name;
    }
}