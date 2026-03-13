package farmacia;

public class Cliente {

    private boolean clienteVip;
    private boolean novoCliente;
    private boolean idoso;

    public void setclienteVip(boolean clienteVip){
        this.clienteVip  = clienteVip;

        }

     public void setidoso(boolean idoso){
        this.idoso = idoso;
    }

     public void setnovoCliente(boolean novoCliente){
        this.novoCliente = novoCliente;
    }

    

    public String remedioUsoContinuo(){
        if(clienteVip == true) return ("conceder desconto de 15%");
        else return ("conceder desconto de 5% somente a vista");
    }

    public String novoCliente (){
        if(novoCliente == true) return ("cadstrar e conceder desconto de 7%");
        else return ("cliente ja cadstrado");

    }
     

    public String convenio (){
        if(idoso == true) return ("cliente conveniado, realizar venda no convenio");
        else return ("cliente nao conveniado, verificar se produto pode ser vendido na farmacia popular");
    }
    
}