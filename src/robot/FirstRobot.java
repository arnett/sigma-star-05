package robot;

import robocode.ScannedRobotEvent;

public class FirstRobot extends BaseRobot {

	@Override
	public void run() {
		super.run();
		while (true) {
			setTurnLeft(360);
			execute();
		}
	}

	@Override
	public void onScannedRobot(ScannedRobotEvent e) {
	}
}
