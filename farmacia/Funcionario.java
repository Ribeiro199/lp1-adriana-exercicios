package farmacia;

public class Funcionario {

    private boolean balconista;
    private boolean farmaceutico;
    private boolean caixa;

    public void setbalconista(boolean balconista){
        this.balconista = balconista;
    }

    public String verificarReceita(){
        if (balconista == true) return ("liberado para venda");
        else return ("venda proibida");
        }

    public void setfarmaceutico(boolean farmaceutico){
        this.farmaceutico = farmaceutico;
        }

    public String remedioControlado(){
        if (farmaceutico == true) return ("reter a primrira via da receita de remedios controlados");
        else return ("nao precisa reter receita");
    }  
    public void setcaixa(boolean caixa){
        this.caixa = caixa;
        }
    
    public String abrirCaixa(){
        if (caixa == true) return ("caixa aberto,inicio da jornada de trabalho");
        else return ("necessario abrir o caixa para inicio da jornada de trabalho");
            
        }

    public String fecharCaixa(){
        if (caixa == true) return ("caixa fechado e sem diferenca de saldo, fim do expediente");
        else return ("caixa com diferença de saldo, refaca o batimento");

    }   
    }

     
    
        

    
    

