package org.usfirst.frc.team346.hid;

import edu.wpi.first.wpilibj.Joystick;

/**
 * TODO: Fix and document the axis and button mapping for xBox 360 controller.
 */

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
		LEFT_Y(1), /** Y-axis on the left joystick. */
		LEFT_X(2), /** X-axis on the left joystick. */
		RIGHT_Y(3), /** Y-axis on the right joystick. */
		RIGHT_X(4); /** X-axis on the right joystick. */
		
		private final int axisNum; /** Axis number mapped to the xBox controller. */
		
		/**
		 * Constructor for XBoxAxis enumeration object.
		 * 
		 * @param _axisNum axis number mapped to the xBox controller.
		 */
		XBoxAxis(final int _axisNum) {
			this.axisNum = _axisNum;
		}
		
		/**
		 * Gets the axis number of the joystick axis.
		 * 
		 * @return axis number of the joystick axis.
		 */
		public int getAxisNum() {
			return this.axisNum;
		}
	}
	
	public enum XBoxButton {
		A_BUTTON(1), /** Green A button on the xBox 360 controller. */
		B_BUTTON(2), /** Red B button on the xBox 360 controller. */
		X_BUTTON(3), /** Blue X button on the xBox 360 controller. */
		Y_BUTTON(4), /** Yellow Y button on the xBox 360 controller. */
		LEFT_BUMPER(5), /** Left bumper the xBox 360 controller. */
		RIGHT_BUMPER(6), /** Right bumper on the xBox 360 controller. */
		LEFT_STICK(7), /** Left joystick center button on the xBox 360 controller. */
		RIGHT_STICK(8), /** Right joystick center button on the xBox 360 controller. */
		START_BUTTON(9), /** Start button on the xBox 360 controller. */
		SELECT_BUTTON(10), /** Select button on the xBox 360 controller. */
		HOME_BUTTON(11); /** Center home button on the xBox 360 controller. */
		
		private final int buttonNum; /** Button number mapped to the xBox controller. */
		
		/**
		 * Constructor for XBoxButton enumeration object.
		 * 
		 * @param _buttonNum button number mapped to the xBox controller.
		 */
		XBoxButton(final int _buttonNum) {
			this.buttonNum = _buttonNum;
		}
		
		/**
		 * Gets the button number of the specified button.
		 * 
		 * @return button number of the specified button.
		 */
		public int getButtonNum() {
			return this.buttonNum;
		}
	}
	/**
	 * Constructor for the xBox controller object.
	 * 
	 * @param _portNumber port number of the xBox 360 controller.
	 */
	public XBoxController(int _portNumber) {
		super(_portNumber);
	}
	
	/**
	 * Gets the value of the value of the specified joystick.
	 * 
	 * @param _joystickAxis axis of the joystick on the xBox controller.
	 * @return the value of the specified joystick axis (from -1.0 to 1.0).
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
	
	/**
	 * Gets the value of the specified button.
	 * 
	 * @param _button button on the xBox 360 controller.
	 * @return whether or not the specified button is pressed.
	 */
	public boolean getButton(XBoxButton _button) {
		switch(_button) {
		case A_BUTTON : {
			return super.getRawButton(XBoxButton.A_BUTTON.getButtonNum());			
		}
		case B_BUTTON : {
			return super.getRawButton(XBoxButton.B_BUTTON.getButtonNum());			
		}
		case X_BUTTON : {
			return super.getRawButton(XBoxButton.X_BUTTON.getButtonNum());			
		}
		case Y_BUTTON : {
			return super.getRawButton(XBoxButton.Y_BUTTON.getButtonNum());			
		}
		case LEFT_BUMPER : {
			return super.getRawButton(XBoxButton.LEFT_BUMPER.getButtonNum());			
		}
		case RIGHT_BUMPER : {
			return super.getRawButton(XBoxButton.RIGHT_BUMPER.getButtonNum());			
		}
		case LEFT_STICK : {
			return super.getRawButton(XBoxButton.LEFT_STICK.getButtonNum());			
		}
		case RIGHT_STICK : {
			return super.getRawButton(XBoxButton.RIGHT_STICK.getButtonNum());			
		}
		case START_BUTTON : {
			return super.getRawButton(XBoxButton.START_BUTTON.getButtonNum());			
		}
		case SELECT_BUTTON : {
			return super.getRawButton(XBoxButton.SELECT_BUTTON.getButtonNum());			
		}
		case HOME_BUTTON : {
			return super.getRawButton(XBoxButton.HOME_BUTTON.getButtonNum());			
		}
		default : {
			return false;
		}
		}
	}
}
