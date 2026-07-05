// Ticket booking system
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
class Seat{
    private String name;
    private int age;
    private String sex;
    private int pnr = 0;

    public Seat(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public int getPnr(){
        return pnr;
    }
    public void setPnr(int pnr){
        this.pnr = pnr;
    }
    public void display(){
        System.out.println();
        System.out.println("--------------------------");
        System.out.println("===== TICKET DETAILS =====");
        System.out.println("PNR NO.  :- " + pnr);
        System.out.println("Name     :- "+ name);
        System.out.println("Age      :- " + age);
        System.out.println("Sex      :- " + sex);
        System.out.println("---------------------------");
        System.out.println();
    }

}
class Tickets{
    private int count = 50;
    private ArrayList<Seat> seats = new ArrayList<>();
    private Random random = new Random();

    public Seat searchPnr(int pnr){
        for(Seat st : seats){
            if(st.getPnr() == pnr){
                return st;
            }
        }
        return null;
    }
    public void bookTicket(Seat seat){
        int pnr;
        do{
            pnr = random.nextInt(900000) + 100000;
        }while(searchPnr(pnr) != null);
        seat.setPnr(pnr);
        seats.add(seat);
        System.out.println("Ticket booked Successfully");
        System.out.println("PNR number :- " + pnr);
        count--;
    }
    public boolean cancelTicket(int pnr){
        Seat st = searchPnr(pnr);
        if(st != null){
            seats.remove(st);
            count++;
            return true;
        }
        return false;
    }
    public int availableSeats(){
        return count;
    }
}
public class program_111{
    public static void main(String[] args){
        Tickets ticket = new Tickets();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("===== WELCOME TO BOOKTICKET =====");
            System.out.println("1. Book Ticket ");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Inquiry");
            System.out.println("4. Availability");
            System.out.println("5. Exit");
            System.out.print("Enter choice :- ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    if(ticket.availableSeats() != 0){
                        System.out.print("Enter name :- " );
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.print("Enter age :- ");
                        int age = scanner.nextInt();
                        System.out.println("Enter Sex :- " );
                        String sex = scanner.next();
                        ticket.bookTicket(new Seat(name, age, sex));
                    }
                    else{
                        System.out.println("No Availability");
                    }
                    break;
                case 2:
                    System.out.print("Enter pnr :- ");
                    int pnr = scanner.nextInt();
                    if(ticket.cancelTicket(pnr)){
                        System.out.println("Ticket cancelled Successfully");
                    }
                    else{
                        System.out.println("Invalid pnr");
                    }
                    break;
                case 3:
                    System.out.println("Enter PNR number :- ");
                    int pnr1 = scanner.nextInt();
                    Seat st = ticket.searchPnr(pnr1);
                    if (st != null){
                        st.display();
                    }
                    else{
                        System.out.println("Ticket not booked");
                    }
                    break;
                case 4:
                    System.out.println("Available seats :- " + ticket.availableSeats());
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }   
        }
        scanner.close();
    }
}