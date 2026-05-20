// Carlton Austin Jr

// import scanner
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // create a scanner that will be used several times
        Scanner scanner = new Scanner(System.in);
        // print opening message and prompt
        displayTitle();
        System.out.print("Welcome to the lobby. Please enter your name below:\n");
        // use the scanner to intake name input
        String user = scanner.nextLine();
        // print message with input
        System.out.print("Great to meet you " + user + "!");
        
        
        // populate public class facility_areas
        facility_areas lobby = new facility_areas(
            "lobby", 
            "Welcome area, with lounge and front desk.", 
            false, 
            "null");
        
        facility_areas pickup = new facility_areas(
            "pickup", 
            "Customer purchase pick-up area.", 
            true, 
            "orderpickup1");
        
        facility_areas service = new facility_areas(
            "service", 
            "Pick-Up / Drop-Off area for customers to have their vehicles serviced.", 
            true, 
            "fixMYcaR");
        
        // populate public class facility_areas
        facility_areas inventory = new facility_areas(
            "inventory", 
            "Area for all on-site inventory available for sale.", 
            false, 
            "null");
        
        // populate public class facility_areas
        facility_areas financial_dept = new facility_areas(
            "financial", 
            "Area for confirmed buyers and associates handling sensitive and/or confidential information.", 
            true, 
            "buyAcar");
        
        //populate public class car_types
        car_types car_type1 = new car_types(
            "sedan", 
            "Four door cars, seats 4 - 5 pending compact or full-size model.", 
            "Toyota, Honda, Ford, Mazda, Lexus", 
            "140 - 270",
            "Base, Mid-Level, Sport, Performance");

        //populate public class car_types
        car_types car_type2 = new car_types(
            "coupe", 
            "Two door cars, seats two. We focus on performance", 
            "Dodge [SRT / Hellcat], Ford [Mustang GT], BMW [M Competition], Mercedes [AMG], Porsche[911 / 718]", 
            "500 - 800",
            "Base, Sport, Super Sport, Performance");

        //populate public class car_types
        car_types car_type3 = new car_types(
            "SUV", 
            "Four door cars, larger vehicles than sedans but less space than full size van.\\n", 
            "BMW [X Line], Toyota, Kia, Jeep, Honda", 
            "250 - 600",
            "Base, Mid-level, Super Sport, Performance");

        //populate public class car_types
        car_types car_type4 = new car_types(
            "van", 
            "Typically the largest production models on the road, can be for large families or for those who use extra space.\\n", 
            "Ram, Ford [Transit], Kia, Honda, Chrysler", 
            "250 - 600",
            "Base, Technology Spec, Work Van, Sprinter");

        //populate public class car_types
        car_types car_type5 = new car_types(
            "pick-up", 
            "Usually associated with hauling and towing, available in mid-size and full-size.", 
            "Ram, Ford [F Line], Toyota, GMC, Chevrolet", 
            "300 - 650",
            "Compact [Mid-size], Base, Towing Special, Performance");
        
        // populate public class Purchasing
        purchasing_options purchasing = new purchasing_options(
            "36 month", 
            "48 month", 
            "60 month", 
            "Cash", 
            "24 month");

        inventory x5_m = new inventory(
            "BMW X5-M",
            "Performance SUV", 
            2, 
            "track / road", 
            "03-BMW-X5-M", 
            7, 
            null);
        inventory fpace_svr = new inventory(
            "Jaguar F-Pace SVR",
            "Performance SUV", 
            2, 
            "track / road", 
            "03-JAG-F-PACE-SVR", 
            2, 
            null);
        inventory corolla = new inventory(
            "Toyota Corolla",
            "Compact Sedan", 
            1, 
            "road", 
            "01-TOY-COR", 
            5, 
            null);
        inventory civic = new inventory(
            "Honda Civic", 
            "Compact Sedan", 
            1, 
            "road", 
            "01-HON-CVC", 
            2, 
            null);
        inventory oddessey = new inventory(
            "Honda Oddessey", 
            "Mini-Van", 
            1, 
            "road", 
            "04-HON-ODD", 
            3, 
            null);
        inventory carnival = new inventory(
            "Kia Carnival", 
            "Mini-Van", 
            1, 
            "road", 
            "04-KIA-CVL", 
            5, 
            null);
        inventory mustang_gt = new inventory(
            "Ford Mustang GT-500",
            "Performance Coupe", 
            2, 
            "track / road", 
            "02-FOR-MUS-GT500", 
            1, 
            null);
        inventory sierra = new inventory(
            "GMC Sierra", 
            "Full-Size Pick-Up", 
            3, 
            "offroad / road", 
            "05-GMC-SRA", 
            6, 
            null);
        inventory ram = new inventory(
            "Ram 1500",
            "Full-Size Pick-Up", 
            3, 
            "offroad / road", 
            "05-RAM-1500", 
            4, 
            null);
        shipping is_350 = new shipping(
            "Lexus IS350", 
            "Full-Size Sedan", 
            2, 
            "road", 
            "01-LEX-IS-350", 
            2);
        shipping nsx_96 = new shipping(
            "Acura NSX [1996]", 
            "Performance Coupe", 
            2, 
            "road", 
            "02-ACU-NSX", 
            14);

        
        Boolean shouldBreak = false;

        // Next context for prompt
        System.out.print("\nWhat brings you in today?\n");

        System.out.print("\n0 for "); lobby.displayArea();
        System.out.print("\n1 for "); pickup.displayArea();
        System.out.print("\n2 for "); service.displayArea();
        System.out.print("\n3 for "); inventory.displayArea();
        System.out.print("\n4 for "); financial_dept.displayArea();

        int area = scanner.nextInt();
        // switch user input 'area' 
        switch (area) {
            // runs if area = 0
            case 0:
                lobby.displayInfo();
                displayDescribeofDealership();
                shouldBreak = true;
                break;
            case 1:
                // prompt for password input
                System.out.println("Please enter password below to enter this portion of the facility:\n");
                // String value to test if valid
                String pickup_password = scanner.next();
                while (!pickup_password.equals(pickup.getSecurityCode())){
                    // validates whether 'password' matches the set password for the confidential area
                    pickup_password = scanner.next();
                    if (pickup_password.equals(pickup.getSecurityCode())){
                        // once 'password' is validated, display info for the financial department and purchasing options 
                        //before breaking out of the switch
                        pickup.displayArea();
                        String order_ID = scanner.next();
                        System.out.println("Thank you we are retrieving order #" + order_ID + " now. Your purchase will be around shortly.");
                        shouldBreak = true;
                        break;
                    };
                    break;
                }
                if (shouldBreak = true) {
                    break; 
                }   
            case 2:
                // prompt for password input
                System.out.println("Please enter password below to enter this portion of the facility:\n");
                // String value to test if valid
                String service_password = scanner.next();
                while (!service_password.equals(service.getSecurityCode())){
                    // validates whether 'password' matches the set password for the confidential area
                    service_password = scanner.next();
                    if (service_password.equals(service.getSecurityCode())){
                        // once 'password' is validated, display info for the financial department and purchasing options 
                        //before breaking out of the switch
                        service.displayArea();
                        System.out.println("Thank you for bringing in your vehicle for servicing today. We will alert you when the work is complete.");
                        shouldBreak = true;
                        break;
                    };
                    break;
                }
                if (shouldBreak = true) {
                    break; 
                }
                // runs if area = 3
            case 3:
                //display info for 'inventory' class
                inventory.displayInfo();

                // options for user to choose to recieve more info about inventory
                System.out.print("\n1 for "); car_type1.displayType();
                System.out.print("2 for "); car_type2.displayType();
                System.out.print("3 for "); car_type3.displayType();
                System.out.print("4 for "); car_type4.displayType(); 
                System.out.print("5 for "); car_type5.displayType(); 
                // next prompt for user input
                System.out.print("Please select a car type get recieve more info:");
                // next user input
                int input = scanner.nextInt();
                // message of the value entered
                System.out.print(input + " was chosen. Let's see what we have to offer today.");
                // update value of boolean 'shouldbreak' to help leave the nested switch back to the original level
                shouldBreak = true;
                // nested switch that displays information about each car_type available, based on 'input'
                switch (input) {
                    // runs if input = 1
                    case 1:
                        car_type1.displayType();
                        car_type1.displayDescribe();
                        car_type1.displayBrands();
                        car_type1.displaySpecs();

                        System.out.print("\nSearching current and anticipated sedan inventory...\n");
                        civic.details();
                        civic.test_drive();
        
                        corolla.details();
                        corolla.test_drive();
            
                        is_350.details();
                        is_350.in_transit();
                        shouldBreak = true;
                        break;
                    // runs if input = 2
                    case 2:
                        car_type2.displayType();
                        car_type2.displayDescribe();
                        car_type2.displayBrands();
                        car_type2.displaySpecs();

                        System.out.print("\nSearching current and anticipated coupe inventory...\n");
                        mustang_gt.details();
                        mustang_gt.test_drive();
            
                        nsx_96.details();
                        nsx_96.in_transit();
                        shouldBreak = true;
                        break;
                    // runs if input = 3
                    case 3:
                        car_type3.displayType();
                        car_type3.displayDescribe();
                        car_type3.displayBrands();
                        car_type3.displaySpecs();

                        System.out.print("\nSearching current and anticipated SUV inventory...\n");
                        x5_m.details();
                        x5_m.test_drive();
    
                        fpace_svr.details();
                        fpace_svr.test_drive();
                        shouldBreak = true;
                        break;
                    // runs if input = 4
                    case 4:
                        car_type4.displayType();
                        car_type4.displayDescribe();
                        car_type4.displayBrands();
                        car_type4.displaySpecs();

                        System.out.print("\nSearching current and anticipated van inventory...\n");
                        carnival.details();
                        carnival.test_drive();
            
                        oddessey.details();
                        oddessey.test_drive();
                        shouldBreak = true;
                        break;
                    // runs if input = 
                    case 5:
                        car_type5.displayType();
                        car_type5.displayDescribe();
                        car_type5.displayBrands();
                        car_type5.displaySpecs();

                        System.out.print("\nSearching current and anticipated pick-up inventory...\n");
                        sierra.details();
                        sierra.test_drive();
            
                        ram.details();
                        ram.test_drive();
                        shouldBreak = true;
                        break;
                    // runs if input is not equal to any above choices
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
                if (shouldBreak = true) {
                    break; 
                }
                //if statement that breaks out of the original switch if either of the above cases are met
             // runs if area = 2
            case 4:
            // prompt for password input
                System.out.println("Please enter password below to enter this portion of the facility:\n");
                // String value to test if valid
                String financial_password = scanner.next();
                while (!financial_password.equals(financial_dept.getSecurityCode())){
                    // validates whether 'password' matches the set password for the confidential area
                    if (financial_password.equals(financial_dept.getSecurityCode())){
                        // once 'password' is validated, display info for the financial department and purchasing options 
                        //before breaking out of the switch
                        financial_dept.displayInfo();
                        purchasing.interactBuyACar();
                        break; 
                    };
                    financial_password= scanner.next();
                }
            default:
                System.out.println("Invalid choice!");
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