package co.lofongi.third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class duStudent {
	private String name;
	private String id;
	
	@Autowired
	//@Autowired will search by type Hostel
	@Qualifier("hostel2")
	private NewHostel newhostel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public NewHostel getNewhostel() {
		return newhostel;
	}
	public void setNewhostel(NewHostel newhostel) {
		this.newhostel = newhostel;
	}
	@Override
	public String toString() {
		return "duStudent [name=" + name + ", id=" + id + ", newhostel=" + newhostel + "]";
	}
	
	
	

}
