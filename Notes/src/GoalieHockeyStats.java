
public class GoalieHockeyStats extends HockeyStats {
	public double goalsAllowed() {
		// should be majorScored() / getGamesPlayed();
		return pointsScored() / getGamesPlayed();
	}
}
