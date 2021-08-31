package ZooKeeper;

public class gorilla extends mammal{
	public void throwSomething(String thing) {
		System.out.println("Gorilla Has throw :" + thing);
		this.setEnergy(this.getEnergy()- 5);
	}
	public void eatBananas() {
		System.out.println("DELICIUS BANANA");
		this.setEnergy(this.getEnergy()+ 10);
	}
	public void  climb() {
		System.out.println("Gorilla has climbed a Tree");
		this.setEnergy(this.getEnergy()- 10);
	}

}
