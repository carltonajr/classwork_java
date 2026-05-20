// Carlton Austin Jr


public class ship_in_inventory extends for_sale{
    public ship_in_inventory(String name, String car_type, int fuel_type, String terrain, String stock_num, int shipping_time){
        super(name, car_type, fuel_type, terrain, stock_num);
        this.m_shipping_time = shipping_time;
    }
    private int m_shipping_time;

    public void in_transit(){
        System.out.println("Vehicle has not arrived at this time.\nEstimated time until arrival: " + m_shipping_time +" days.\n");
    }
}
 