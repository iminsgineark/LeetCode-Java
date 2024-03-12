package Arrays;

public class Encapsulation {
    public static void main(String[] args) {

        Amazon customer = new Amazon();
        System.out.println(customer.transaction(10000));
    }


}
class Amazon{
    float transaction(float amt){
        Gpay gpay = new Gpay();
        float total = amt + (amt * gpay.getTxCharge());
        return total;
    }
}
class Gpay{
    private float txCharge = 0.5f;

    public float getTxCharge() {
        return txCharge;
    }
    public void setTxCharge(float newCharge){
        if (newCharge <= 0){
            System.out.println("Invalid Charges");
        }
        txCharge = newCharge;
    }
}