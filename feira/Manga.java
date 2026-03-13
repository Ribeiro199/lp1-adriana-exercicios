package feira;

public class Manga {
    
    private boolean palmer;
    private boolean rosa;
    private boolean coquinho;

    public void setpalmer(boolean palmer){
        this.palmer = palmer;
    }

        public void setrosa(boolean rosa){
        this.rosa = rosa;
    }
    
    public void setcoquinho(boolean coquinho){
        this.coquinho = coquinho;
    } 
    
      public String palmer(){
        if(palmer == true) return ("Manga doce e suculenta");
        else return ("outra qualidade de manga");
    }

     public String rosa(){
        if(rosa == true) return ("Manga grande e suculenta");
        else return ("outra qualidade de manga");
    }

     public String coquinho(){
        if(coquinho == true) return ("Manga pequena muito doce mas com muitos fiapos");
        else return ("outra qualidade de manga");
    }
     
}     