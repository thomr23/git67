package AbstractionConcept;

public class BMW implements Car {

	//@Override---Start method is overriden from Car interface
	public void start() {
		
		System.out.println("BMW--Start");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		System.out.println("BMW--Stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW--refuel");
		
	}

}
