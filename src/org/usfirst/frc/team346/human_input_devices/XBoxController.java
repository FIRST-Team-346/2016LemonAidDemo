package org.usfirst.frc.team346.human_input_devices;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class handles input from the xBox 360 controller connected to the driver station. 
 * Each xBox 360 controller requires its own instance, which also requires the port to which the
 * xBox 360 controller is mapped. 
 * 
 * @author Adam Morrissett
 *
 */
public class XBoxController extends Joystick {
	
	/**
	 * Enumeration for the axes mapped to the xBox 360 controller. Each x- and y-axis
	 * is mapped to a specific axis number. 
	 * 
	 * @author Adam Morrissett
	 */
	public enum XBoxAxis {
		LEFT_Y(1), /** Y-axis on the left joystick */
		LEFT_X(2), /** X-axis on the left joystick */
		RIGHT_Y(3), /** Y-axis on the right joystick */
		RIGHT_X(4); /** X-axis on the right joystick */
		
		private final int axisNum; /** Axis number mapped to the xBox controller */
		
		/**
		 * Constructor for Axis enumeration object
		 * 
		 * @param _axisNum axis number on mapped to the xBox controller
		 */
		XBoxAxis(int _axisNum) {
			this.axisNum = _axisNum;
		}
		
		/**
		 * Gets the axis number of the joystick axis.
		 * 
		 * @return axis number of the joystick axis
		 */
		public int getAxisNum() {
			return this.axisNum;
		}
	}
	
	/**
	 * Constructor for the xBox controller object.
	 * 
	 * @param _portNumber port number of the xBox 360 controller
	 */
	public XBoxController(int _portNumber) {
		super(_portNumber);
	}
	
	/**
	 * Get the value of the value of the specified joystick.
	 * 
	 * @param _joystickAxis axis of the joystick on the xBox controller
	 * @return the value of the specified joystick axis (from -1.0 to 1.0)
	 */
	public double getAxis(XBoxAxis _joystickAxis) {
		switch(_joystickAxis) {
		case LEFT_Y : {
			return super.getRawAxis(XBoxAxis.LEFT_Y.getAxisNum());			
		}
		case LEFT_X : {
			return super.getRawAxis(XBoxAxis.LEFT_X.getAxisNum());
		}
		case RIGHT_Y : {
			return super.getRawAxis(XBoxAxis.RIGHT_Y.getAxisNum());
		}
		case RIGHT_X : {
			return super.getRawAxis(XBoxAxis.RIGHT_X.getAxisNum());
		}
		default : {
			return 0.0;
		}
		}
	}

}
