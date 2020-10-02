package Question01;

public class NavigationSatellite implements ISatellite {
	
	String name;
	
	public NavigationSatellite(String name) {
		this.name = name;
	}

	@Override
	public void activate() {
		System.out.println(name + " navigational satellite active");
	}

	@Override
	public void deactivate() {
		System.out.println(name + " navigational satellite deactive");
	}

}
