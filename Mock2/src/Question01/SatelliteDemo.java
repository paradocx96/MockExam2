package Question01;

public class SatelliteDemo {

	public static void main(String[] args) {
		ISatellite navigaSatellite = new NavigationSatellite("Ravana-01");
		ISatellite droneSatellite = new DroneSatellite("Ravana-02");
		
		IGeoLocation locationTracker1 = new SatelliteLocation("Sri Lanka");
		IGeoLocation locationTracker2 = new SatelliteLocation("USA");
		
		ISatellite[] satelliteArray = new ISatellite[]{navigaSatellite,droneSatellite};
		IGeoLocation[] trackerArray = new IGeoLocation[]{locationTracker1,locationTracker2};
		
		SatelliteCenter satelliteCenter = new SatelliteCenter(0, satelliteArray, trackerArray);
		satelliteCenter.startService();
		satelliteCenter.stopService();
		satelliteCenter.locationService();
		
		SatelliteCenter remoteContoler = new SatelliteCenter(1, satelliteArray, trackerArray);
		remoteContoler.startService();
		remoteContoler.stopService();
		remoteContoler.locationService();
		
	}
}
