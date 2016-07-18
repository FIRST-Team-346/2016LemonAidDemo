package org.usfirst.frc.team346.human_input_devices;

import edu.wpi.first.wpilibj.Joystick;

public class XBoxController extends Joystick {
	
	public XBoxController(int _portNumber) {
		super(_portNumber);
	}
	
	public double getLeftY() {
		return super.getRawAxis(1);
	}
	
	public double getRightY() {
		return super.getRawAxis(5);
	}
}
