package Arrays;

public class Debug {
    int x = 5;

    void show() {
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        Debug d = new Debug();
        Debug d1 = new Debug();
        d1.x = d1.x + 3;
        d.show();
        d1.show();
//        ch as=new ch("");
//        as.name="UA";
//        System.out.println(as.name);
    }

}
