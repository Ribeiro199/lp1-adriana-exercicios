package farmacia;


public class Farmacia {
 
    public static void main (String []args){

        Remedio remedio = new Remedio();
        remedio.setDosagem(10);
        remedio.setcontrole(false);

        Funcionario funcionario = new Funcionario();
        funcionario.setbalconista(true);
        funcionario.setfarmaceutico(true);
        funcionario.setcaixa(true);

        Cliente cliente = new Cliente();
        cliente.setclienteVip(true);
        cliente.setidoso(true);


        System.out.println(remedio.produzEfeito());
        System.out.println(remedio.comReceita());
        System.out.println(funcionario.verificarReceita());
        System.out.println(funcionario.remedioControlado());
        System.out.println(funcionario.abrirCaixa());
        System.out.println(funcionario.fecharCaixa());
        System.out.println(cliente.remedioUsoContinuo());
        System.out.println(cliente.novoCliente());
        System.out.println(cliente.convenio());

    remedio.setTipo("spray");
    remedio.temContraIndicacoao();
    remedio.comReceita();
    funcionario.verificarReceita();
    funcionario.remedioControlado();
    funcionario.abrirCaixa();
    funcionario.fecharCaixa();
    cliente.remedioUsoContinuo();
    cliente.convenio();


    }



    }
