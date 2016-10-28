package yourteamname;

import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 * {@see http://robowiki.net/wiki/Robocode/My_First_Robot}
 */
public class MyFirstRobotNewStyle extends Robot {
    public class MyFirstRobot extends Robot {
        public void run() {
            while (true) {
                ahead(100);
                turnGunRight(360);
                back(100);
                turnGunRight(360);
            }
        }

        public void onScannedRobot(ScannedRobotEvent e) {
            fire(1);
        }
}
