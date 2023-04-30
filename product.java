public class product {
    int pid;
    double price;
    static double tot_price = 0;
    public product(int pid, double price ){
        this.pid = pid;
        this.price = price;
        tot_price = tot_price+price;
    }
    public void display(){
        System.out.println("Product Id:"+pid+" Price:"+price);
    }
    public static void main(String[] args) {
        product p1 = new product(1, 20);
        product p2 = new product(2, 20);
        product p3 = new product(3, 20);
        product p4 = new product(4, 20);
        product p5 = new product(5, 20);
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        System.out.println("Total price:"+product.tot_price);
    }
}
