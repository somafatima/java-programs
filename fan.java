class fan{
    int slow=1;
    int medium=2;
    int fast =3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public fan(){
         speed=slow;
         on=false;
         radius=5;
         color="blue";

    }
    public void setSpeed(int newspeed) {
        speed=newspeed;
    }
    public void turnOn() {
        on=true;
    }
    public void turnOff() {
        on=false;
    }
    public void setRadius(double newradius) {
        radius=newradius;
        
    }
    public void setColor(String newcolor) {
        color=newcolor;
    }
    public int getSpeed(){
        if(on && speed==1){
System.out.println("SLOW");
        }
        if (on && speed==2) {
            System.out.println("MEDIUM");
        }
        if(on && speed==3){
            System.out.println("FAST");
        }
        return speed;
    }
    public boolean whenOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public String color(){
        return color;
    }
    public String toString(){
        if(on==true){
            return "\n FAN SPEED: "+speed +"\n FAN RADIUS: "+radius +"\n FAN COLOR: "+color;
        }
        else{
            return "FAN IS OFF";
        }
        
    }

public static void main(String[] args){
fan fan1=new fan();
fan fan2=new fan();
fan1.turnOn();
fan1.setSpeed(3);
fan1.setColor("yellow");
fan1.setRadius(10);

fan2.turnOff();
fan2.setColor("blue");
fan2.setRadius(5);
fan2.setSpeed(2);
System.out.println("FAN1 INFO: ");
System.out.println(fan1.toString());
System.out.println("\t \n FAN2 INFO: ");
System.out.println(fan2.toString());

}
}