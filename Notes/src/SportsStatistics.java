
public class SportsStatistics {
	public int major;
	public int minor;
	private int gamesPlayed;
	
	public SportsStatistics() {
		
	}
	public SportsStatistics(int ma, int mi) {
		major = ma;
		minor = mi;
	}
	
	public int pointsScored() {
		return major + minor;
	}
	
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	
	
}
