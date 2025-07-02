public class ShoopingCart {
    class Product{
        String prodName;
        int price;
        int quantity;
        final int proId;
        static float discount = 10.25f;

        public  Product(String proName,int price,int quantity,int proId) {
            this.proId = proId;
            this.prodName=proName;
            this.quantity=quantity;
            this.price=price;
        }

        

        void printDetails(){
            System.out.println("product namee:"+prodName);
            System.out.println("product id:"+proId);
            System.out.println("price:"+price);
            System.out.println("quantity:"+quantity);
        }

        static void updateDiscount(int price){
            float discountedPrice = price - (price * discount / 100);
            System.out.println("Final price after discount is: " + discountedPrice);        }
    }

    public static void main(String[] args) {
        ShoopingCart cart = new ShoopingCart();
        ShoopingCart.Product p1 = cart.new Product("detol", 128, 1, 100);
        p1.printDetails();
        product.updateDiscount(p1.price);
        
    }
}
