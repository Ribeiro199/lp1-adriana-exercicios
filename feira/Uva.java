package feira;

public class Uva {

    private boolean semSemente;
    private boolean verde;
    private boolean rosada;

    public void setsemSemente(boolean semSemente){
        this.semSemente = semSemente;
    }
    public void setverde(boolean verde){
        this.verde = verde;
    }
    public void setrosada(boolean rosada){
        this.rosada = rosada;  
    }
    
    public String setsemsemente(){
        if(semSemente == true) return ("Uva Vitoria");
        else return ("Uva com semente");

    }

    public String setverde(){
        if(verde == true) return ("Uva Italia");
        else return ("nao e Italia");
    }

    public String setrosada(){
        if(rosada == true) return ("Uva Niagara");
        else return ("Niagara branca");
    }
}    
