// Carlton Austin Jr


public class in_house_inventory extends for_sale{
    public in_house_inventory(String name, String car_type, int fuel_type, String terrain, String stock_num, int intake_time, Boolean ready_test_drive){
        super(name, car_type, fuel_type, terrain, stock_num);

        this.m_intake_time = intake_time;
        this.m_ready_test_drive = ready_test_drive;
    }
    // How long since vehicle arrived
    private int m_intake_time;
    // ready for test drive true / false
    private Boolean m_ready_test_drive;
    public void class_info(){
    System.out.println(super.getClass());   
    }
    public void test_drive(){
        System.out.println("Time since arrival on the lot: " + m_intake_time + " days.");
        if (m_intake_time < 2){
            System.out.println("The vehicle has arrived and is scheduled for service.");
            m_ready_test_drive = false;
        }
        else if (m_intake_time < 5){
            System.out.println("The vehicle has arrived and is currently in service.");
            m_ready_test_drive = false;
        }
        else if (m_intake_time >= 5){
            System.out.println("The vehicle has arrived and has been serviced in the time since arrival.");
            m_ready_test_drive = true;
        }
        System.out.println("Test Drive Availablity: " + m_ready_test_drive + "\n");

    }
}
