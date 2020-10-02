package Question01;

public class SatelliteCenter {
	
	int option;
	ISatellite[] iSatellites;
	IGeoLocation[] iGeoLocation;
	
	public SatelliteCenter(int option, ISatellite[] iSatellites, IGeoLocation[] iGeoLocation) {
		this.option = option;
		this.iSatellites = iSatellites;
		this.iGeoLocation = iGeoLocation;
	}
	
	public void startService() {
		iSatellites[option].activate();
	}
		
	public void stopService() {
		iSatellites[option].deactivate();
	}
	
	public void locationService() {
		iGeoLocation[option].displayLocation();
	}
	

}
