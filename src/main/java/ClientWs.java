public class ClientWs {
    public static void main(String[] args) {
        banque.ws.BanqueService service = new banque.ws.BanqueService();
        banque.ws.BanqueServiceSoap stub = service.getBanqueServiceSoap();
        System.out.println(stub.getAccount(1));
        System.out.println(stub.getAllAccounts());
        System.out.println(stub.convert(100, "USD"));
    }
}
