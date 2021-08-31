package ZooKeeper;

public class bat extends mammal {
	public void fly() {
		System.out.println("AAAAAAAAAAAAAAAA");
		this.setEnergy(this.getEnergy()- 50);
	}
	public void eatHumans() {
		this.setEnergy(this.getEnergy()+ 25);
	}
	public void attackTown() {
		System.out.println();
		this.setEnergy(this.getEnergy()- 100);
	}

}
