package Question01;

public class DroneSatellite implements ISatellite {
	
	String name;

	public DroneSatellite(String name) {
		this.name = name;
	}

	@Override
	public void activate() {
		System.out.println(name + " drone satellite active");
	}

	@Override
	public void deactivate() {
		System.out.println(name + " drone satellite deactive");
	}

}
