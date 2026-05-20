// Carlton Austin Jr


// Parent class [Super class / Base class]
public class for_sale {
    public for_sale(String name, String car_type, int fuel_type, String terrain, String stock_num){
        this.m_name = name;
        this.m_car_type = car_type;
        this.m_fuel_type = fuel_type;
        this.m_terrain = terrain;
        this.m_stock_num = stock_num;
    }
    private String m_name;
    private String m_car_type;
    private int m_fuel_type;
    private String m_terrain;
    private String m_stock_num;

    public void details(){
        System.out.println("We currently have a " + m_name + ".");
        System.out.println("A capable " + m_car_type + " that could fit your needs.");
        System.out.println("Designed for " + m_terrain + " conditions.");
        System.out.println("The stock number is " + m_stock_num);
    }
}


