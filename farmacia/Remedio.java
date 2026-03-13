package farmacia;
public class Remedio {

    private String tipo;
    private int dosagem;
    private boolean controle;

    


    public void setTipo(String tipo){
    this.tipo = tipo;
}

    public void setDosagem(int dosagem){
        this.dosagem = dosagem;
    }

public boolean produzEfeito(){
    if (dosagem > 10) return true;
    else return false;
} 

public void setcontrole(boolean controle){
    this.controle = controle;
        
    }

    
public String comReceita(){
    if (controle == true) return ("liberada para venda");
    else return "venda proibida";
    

  

}

public void temContraIndicacoao (){
    if (tipo.equals("spray")) System.out.println ("produz reacao alergica");
   else if (tipo.equals ("comprimidos")) System.out.println ("produz reacao alergica");
        else  System.out.println("nao produz reacao alergica");
}
public void usoPediatrico (){
            if (controle) System.out.println ("contra indicacao");
            else System.out.println ("sem cotra indicacao");
        }


    }
    
    

