// inventory management system
import java.util.Scanner;
import java.util.ArrayList;
class Product{
    private int Id;
    private String name;
    private int quantity;
    private double price;

    public Product(int Id, String name, int quantity, double price){
        this.Id = Id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public void setId(int newId){
        this.Id = newId;
    }
    public void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getId(){
        return Id;
    }
    public int getQuantity(){
        return quantity;
    }
    public void display(){
        System.out.println("==== Product Details ====");
        System.out.println("Product Id       :- "+ Id);
        System.out.println("Product Name     :- " + name);
        System.out.println("Product Quantity :- "+ quantity);
        System.out.println("Product Price    :- " + price);
        System.out.println("-----------------------------");
    }
}
class InventoryManagement{
    private ArrayList<Product> inventory = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void addproduct(){
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        inventory.add(new Product(id, name, quantity, price));
        System.out.println("Product added successfully.");
    }

    public Product searchProduct(){
        System.out.print("Enter Id :- ");
        int Id = sc.nextInt();
        for(Product pr : inventory){
            if(pr.getId() == Id){
                pr.display();
                return pr;
            }
        }
        System.out.println("No such Product in Inventory");
        return null;
    }
    public void updateProductQuantity(){
        Product prr = searchProduct();
       if(prr != null){
            System.out.print("Enter New Quantity :- ");
            int qty = sc.nextInt();
            prr.setQuantity(qty);
            System.out.println("Quantity Updated");
            prr.display();
       }
    }
    public void removeProduct(){
        Product prr = searchProduct();
        prr.display();
        inventory.remove(prr);
        System.out.println("Product removed Successfully");
    }
    public void displayProducts(){
        System.out.println("====== INVENTORY ======");
        for(Product pr : inventory){
            pr.display();
        }
    }
}
public class program_116{
    public static void main(String[] args){
        InventoryManagement im = new InventoryManagement();
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("------------------------");
            System.out.println("Choose the options Below");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Update Product");
            System.out.println("5. View Inventory");
            System.out.println("6. Exit");
            System.out.println("-------------------------");
            System.out.print("Enter Choice :- ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    im.addproduct();
                    break;
                case 2:
                    im.searchProduct();
                    break;
                case 3:
                    im.removeProduct();
                    break;
                case 4:
                    im.updateProductQuantity();
                    break;
                case 5:
                    im.displayProducts();
                    break;
                case 6:
                    running = false;
                    break;
                default :
                    System.out.println("Invalid Input");
                    break;
            }
        }
        sc.close();
    }
}