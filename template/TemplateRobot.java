package gen;

import robocode.ScannedRobotEvent;
import robot.BaseRobot;

/**
 * bbb
 */
public class # extends BaseRobot {

	@Override
	public void run() {
		super.run();
		while (true) {
			turnRadarLeft(360);
		}
	}

	@Override
	public void onScannedRobot(ScannedRobotEvent e) {
		ahead(#);
		turnRight(#);
		turnGunRight(#);
	}
}
