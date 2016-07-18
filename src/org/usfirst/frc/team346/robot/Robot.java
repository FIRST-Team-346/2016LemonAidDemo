
package org.usfirst.frc.team346.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

import org.usfirst.frc.team346.gearboxes.TwoMotorBox;
import org.usfirst.frc.team346.human_input_devices.XBoxController;
import org.usfirst.frc.team346.human_input_devices.XBoxController.XBoxAxis;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	// Joysticks
	public XBoxController xBox;
	
	// Gear Boxes
	public TwoMotorBox leftDrive;
	public TwoMotorBox rightDrive;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	// Init Joystick
    	xBox = new XBoxController(0);
    	
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
        leftDrive.set(-0.5*xBox.getAxis(XBoxAxis.LEFT_Y));
        rightDrive.set(0.5*xBox.getAxis(XBoxAxis.RIGHT_Y));
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
