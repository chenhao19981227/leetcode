package reconstruction.chapter6.extract_variable;

public class test {
    public static void main(String[] args) {
        ExtractVariable extractVariable=new ExtractVariable();
        Order order=new Order(20,10);
        double price = extractVariable.price(order);
        System.out.println(price);
        System.out.println("----------------------------------");
        AfterExtract afterExtract=new AfterExtract();
        double price1 = afterExtract.price(order);
        System.out.println(price1);
    }
}
