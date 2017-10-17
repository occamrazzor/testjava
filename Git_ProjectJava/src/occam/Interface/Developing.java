package occam.Interface;

// A class can implements multi interface if need be.

public class Developing implements IBankingClient, IDomainClient{

	public static void main(String[] args) {
		
//Note here return type of class is Developing as such all the implements methods from interface and 
//Developing class can be accessed with the dev object.
		Developing dev = new Developing();
		dev.checkingBalance();
		dev.payCreditCard();
		dev.tranferBalance();
		dev.login();
		
//Return type of class is IBankingclient as such only methods in the interface is accessible however login method
//in the developing class is not accessible. Note bc.login() will throw an error. Runtime polymorphism.
		IBankingClient bc = new Developing();
		bc.checkingBalance();
		bc.payCreditCard();
		bc.tranferBalance();
		
// Return type of class is IDomaninClient
		
		IDomainClient dc = new Developing();
		dc.clientChecking();
		
		
	}

	@Override
	public void payCreditCard() {
		System.out.println("Pay Credit Card method implemented");
	}

	@Override
	public void tranferBalance() {
		System.out.println("Transfer Balance method implemented");
	}

	@Override
	public void checkingBalance() {
		System.out.println("Checking Balance method implemented");
	}
	
	public void login(){
		System.out.println("This is a login function from login class");
	}

	@Override
	public void clientChecking() {
		System.out.println("ClientChecking function ");
	}

}
