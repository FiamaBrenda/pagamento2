void main() {
    IO.println("------------Pagamento----------------\n");
    FormaDePagamento pix = new PagamentoPix();
    pix.processarPagamento();
    IO.println("\n------------Pagamento----------------\n");
    pix.processarPagamento();

    FormaDePagamento boleto = new Boleto();
    IO.println("\n------------Pagamento----------------\n");
    boleto.processarPagamento();

}