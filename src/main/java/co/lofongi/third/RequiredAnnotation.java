package co.lofongi.third;

import org.springframework.beans.factory.annotation.Required;

public class RequiredAnnotation {
	private int value;
	@Required
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "RequiredAnnotation [value=" + value + "]";
	}
	
	
}
