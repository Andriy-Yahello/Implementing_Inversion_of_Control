package co.lofongi.first;

public class Car {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPerDayCost() {
		return perDayCost;
	}
	public void setPerDayCost(int perDayCost) {
		this.perDayCost = perDayCost;
	}
	private int perDayCost;
	@Override
	public String toString() {
		return "Car [name=" + name + ", perDayCost=" + perDayCost + "]";
	}

}
