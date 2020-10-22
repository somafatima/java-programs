class TV{
  private  int channel=1;
  private  int volume=1;
  boolean on;
public TV() {
    
}
public void turn_on(){
    on=true;
    System.out.println("TV is on now");
}
public void turn_off() {
    on=false;
    System.out.println("TV is OFF");
    
}
public void setChannel(int newchannel) {
    if (on && newchannel>=1 && newchannel<=120) {
        channel=newchannel;
        System.out.println("CURRENT CHANNEL: "+channel);
        
    }
    
}
public void setVolume(int newvolume) {
    if(on && newvolume>=1 && newvolume<=7){
        volume=newvolume;
        System.out.println("VOLUME: "+volume);

    }
    }
    public void channelUp() {
        if(on && channel<120){
            channel=channel+1;
            System.out.println( "CHANNEL UP: "+ channel);
        }
        
    }
    public void channelDown() {
        if (on && channel>1) {
            channel=channel-1;
            System.out.println( "CHANNEL DOWM: "+ channel);
        }
        
    }
    public void volumeUp() {
        if (on && volume<7) {
            volume=volume+1;
            System.out.println( "VOLUME UP: "+ volume);
        }
        
    }
    public void volumeDown() {
        if (on && volume>1) {
            volume=volume-1;
            System.out.println("VOLUME DOWN: "+ volume);
            
        }
        
    }

    
        
    
    public static void main(String[] args) {
        TV remote=new TV();
        remote.turn_on();
        remote.setChannel(80);
        remote.setVolume(2);
        remote.volumeUp();
        remote.channelDown();

    }


}


