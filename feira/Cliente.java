package feira;

public class Cliente {

    private boolean varejo;
    private boolean atacado;
 
    public void setvarejo(boolean varejo){
        this.varejo = varejo;
       
    }
    public void setatacado(boolean atacado){
        this.atacado = atacado;
    }

    public String setvarejo(){
        if(varejo == true) return ("Venda com desconto acima de 10 unidades");
        else return ("Venda sem desconto");
    }

    public String setatacado(){
        if(atacado == true) return ("Entrega ao sem custo cliente");
        else return ("Entrega sem custo somente no atacado");
    }
}
