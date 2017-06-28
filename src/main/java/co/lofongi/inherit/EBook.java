package co.lofongi.inherit;

public class EBook extends Book {
	private float sizeInMB;

	public void setSizeInMB(float sizeInMB) {
		this.sizeInMB = sizeInMB;
	}

	@Override
	public String toString() {
		return "EBook [sizeInMB=" + sizeInMB + ", " + super.toString()
		+ "]";
	}
	
	

}
