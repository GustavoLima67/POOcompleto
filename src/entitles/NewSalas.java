package entitles;

public class NewSalas extends Salas {
   
    private String wifi;
    private String TV;
            
    public NewSalas(){
    }
    public NewSalas(String wifi,String TV){
        super();
        this.wifi = wifi;
        this.TV = TV;
    }
    public String getWifi(){
        return wifi;
    }
    public void setWifi(String wifi){
        this.wifi = wifi;
    }
    public String getTV(){
        return TV;
    }
    public void setTV(String TV){
        this.TV = TV;
    }
    public String toString(){
        return "New Equipments: \n"+"Equipment 1: "+wifi+", Equipment 2:"+TV;
    }
}
