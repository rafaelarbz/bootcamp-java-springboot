class RodarAplicacao {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();
        Funcionario gerente = new Gerente();

        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
    
}
