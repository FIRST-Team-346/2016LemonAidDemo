
package org.usfirst.frc.team346.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team346.gearboxes.TwoMotorBox;
import org.usfirst.frc.team346.hid.XBoxController;
import org.usfirst.frc.team346.hid.XBoxController.XBoxAxis;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	// Joystick
	public Joystick leftJoystick;
	public Joystick rightJoystick;
	
	// Gear Boxes
	public TwoMotorBox leftDrive;
	public TwoMotorBox rightDrive;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	// Init Joystick
    	leftJoystick = new Joystick(0);
    	rightJoystick = new Joystick(1);
    	
    	// Init Gear Boxes
    	leftDrive = new TwoMotorBox(0, 1);
    	rightDrive = new TwoMotorBox(2, 3);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        leftDrive.set(-1 * leftJoystick.getY());
        rightDrive.set(rightJoystick.getY());
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
