package entitles;

public class NewSalas extends Salas {
   
    private String equipment1;
    private String equipment2;
    private String equipment3;
            
    public NewSalas(){
        super();
    }
    public NewSalas(String school,String clas,String equipment1,String equipment2,String equipment3){
        super(school,clas);
        this.equipment1 = equipment1;
        this.equipment2 = equipment2;
        this.equipment3 = equipment3;
    }
    public NewSalas(String equipment1,String equipment2,String equipment3){
        this.equipment1 = equipment1;
        this.equipment2 = equipment2;
        this.equipment3 = equipment3;
    }
    public String getEquipment1(){
        return equipment1;
    }
    public void setEquipment1(String equipment1){
        this.equipment1 = equipment1;
    }
    public String getEquipment2(){
        return equipment2;
    }
    public void setEquipment2(String equipment2){
        this.equipment2 = equipment2;
    }
    public String getEquipment3(){
        return equipment3;
    }
    public void setEquipment3(String equipment3){
        this.equipment3 = equipment3;
    }
    @Override
    public String toString(){
        return "New Equipments: \n"+"Equipment 1: "+equipment1+", Equipment 2: "+equipment2+", Equipment 3: "+equipment3;
    }
}
