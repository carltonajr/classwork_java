// Carlton Austin Jr

//Import scanner
import java.util.Scanner;

public class inheritance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayTitle();
        displayDescribeofDealership();


        System.out.print("Welcome to the Car Dealership! Please enter your name below:\n");
        // use the scanner to intake name input
        String user = scanner.nextLine();
        // print message with input
        System.out.print("Great to meet you " + user + "!\n\n");
        in_house_inventory x5_m = new in_house_inventory(
            "BMW X5-M",
            "Performance SUV", 
            2, 
            "track / road", 
            "03-BMW-X5-M", 
            7, 
            null);
        in_house_inventory fpace_svr = new in_house_inventory(
            "Jaguar F-Pace SVR",
            "Performance SUV", 
            2, 
            "track / road", 
            "03-JAG-F-PACE-SVR", 
            2, 
            null);
        in_house_inventory corolla = new in_house_inventory(
            "Toyota Corolla",
            "Compact Sedan", 
            1, 
            "road", 
            "01-TOY-COR", 
            5, 
            null);
        in_house_inventory civic = new in_house_inventory(
            "Honda Civic", 
            "Compact Sedan", 
            1, 
            "road", 
            "01-HON-CVC", 
            2, 
            null);
        in_house_inventory oddessey = new in_house_inventory(
            "Honda Oddessey", 
            "Mini-Van", 
            1, 
            "road", 
            "04-HON-ODD", 
            3, 
            null);
        in_house_inventory carnival = new in_house_inventory(
            "Kia Carnival", 
            "Mini-Van", 
            1, 
            "road", 
            "04-KIA-CVL", 
            5, 
            null);
        in_house_inventory mustang_gt = new in_house_inventory(
            "Ford Mustang GT-500",
            "Performance Coupe", 
            2, 
            "track / road", 
            "02-FOR-MUS-GT500", 
            1, 
            null);
        in_house_inventory sierra = new in_house_inventory(
            "GMC Sierra", 
            "Full-Size Pick-Up", 
            3, 
            "offroad / road", 
            "05-GMC-SRA", 
            6, 
            null);
        in_house_inventory ram = new in_house_inventory(
            "Ram 1500",
            "Full-Size Pick-Up", 
            3, 
            "offroad / road", 
            "05-RAM-1500", 
            4, 
            null);
        ship_in_inventory is_350 = new ship_in_inventory(
            "Lexus IS350", 
            "Full-Size Sedan", 
            2, 
            "road", 
            "01-LEX-IS-350", 
            2);
        ship_in_inventory nsx_96 = new ship_in_inventory(
            "Acura NSX [1996]", 
            "Performance Coupe", 
            2, 
            "road", 
            "02-ACU-NSX", 
            14);
        
        System.out.print("To get a better read on your immediate preferences, please input a value to filter our inventory.\n");
        
        System.out.print("\n1 for Sedans\n");
        System.out.print("2 for Coupes\n");
        System.out.print("3 for SUVs\n");
        System.out.print("4 for Vans\n");
        System.out.print("5 for Pick-Ups\n");
        int pick_type = scanner.nextInt();
        switch (pick_type) {
            case 1:
                System.out.print("Searching for sedans...\n");
                civic.details();
                civic.test_drive();

                corolla.details();
                corolla.test_drive();
    
                is_350.details();
                is_350.in_transit();
                break;
            case 2:
                System.out.print("Searching for coupes...\n");
                mustang_gt.details();
                mustang_gt.test_drive();
    
                nsx_96.details();
                nsx_96.in_transit();
                break;
            case 3:
                System.out.print("Searching for SUVs...\n");
                x5_m.details();
                x5_m.test_drive();
    
                fpace_svr.details();
                fpace_svr.test_drive();
                break;
            case 4:
                System.out.print("Searching for vans...\n");
                carnival.details();
                carnival.test_drive();
    
                oddessey.details();
                oddessey.test_drive();
                break;
            case 5:
                System.out.print("Searching for pick-ups...\n");
                sierra.details();
                sierra.test_drive();
    
                ram.details();
                ram.test_drive();
                break;
        
            default:
                System.out.println("Your search found 0 options.");
                break;
        }
    // close scanner at the end of program  
    scanner.close();
    }
    public static void displayTitle() {
        System.out.println("***Welcome to Get a Car***\n");
    }
    public static void displayDescribeofDealership(){
        System.out.println("Get a Car, a recently opened dealer in the area is quickly becoming a staple in the community.");
        System.out.println("Located north of the city, Get a Car hit the ground running bringing in clients from all over the region.");
        System.out.println("They pride themselves on their 'can-do' philosopy to bring the best value for each client.");
        System.out.println("Housing countless brands, models and versions, Get a Car is full steam ahead in bringing nearly any option to the table.\n\n");
    }
}