package org.usfirst.frc.team346.gearboxes;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;

public class TwoMotorBox {
	private CANTalon m_master;
	private CANTalon m_slave;
	
	public TwoMotorBox(int _masterPort, int _slavePort) {
		this.m_master = new CANTalon(_masterPort);
		this.m_slave = new CANTalon(_slavePort);
		
		this.m_slave.changeControlMode(TalonControlMode.Follower);
		this.m_slave.set(this.m_master.getDeviceID());		
	}
	
	public void set(double _value) {
		this.m_master.set(_value);
	}
}
