// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenixpro.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private final TalonFX motor = new TalonFX(7);
  public DriveTrain() {}

  public void setMotorSpeed(double speed){
    motor.set(speed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
