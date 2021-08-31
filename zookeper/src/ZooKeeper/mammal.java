package ZooKeeper;

public class mammal {
    protected int EnergyLevel = 100;
    public int displayEnergy() {
        System.out.println("your energy is:" + EnergyLevel );
        return EnergyLevel;
    }
    public void setEnergy(int EnergyLevel) {
    	this.EnergyLevel = EnergyLevel;
    }
    public int getEnergy() {
    	return EnergyLevel;
    }
}
