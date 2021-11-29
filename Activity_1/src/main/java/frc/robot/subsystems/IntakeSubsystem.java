/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.*;

public class IntakeSubsystem extends SubsystemBase {

  //TODO: 1. Set the motor to the right type (Talon, CAN, etc.).
  // See https://github.com/iron-claw-972/HowToProgramming for how to do this. 
  // Make sure to set the right amount of motors! (if you only have 2 motors don't make 4)

  // TalonSRX intake1 = new TalonSRX(1);
  // TalonSRX intake2 = new TalonSRX(2);
  
  /**
   * Creates a new Subsystem.
   */
  public IntakeSubsystem() {

  }

  public void spinIntake(){ 
    intake1.set(ControlMode.PercentOutput,-.9);
    intake2.set(ControlMode.PercentOutput,-.9);
  }

  public void reverseIntake(){
    intake1.set(ControlMode.PercentOutput,.9);
    intake2.set(ControlMode.PercentOutput,.9);
  }

  public void stopIntake(){
    intake1.set(ControlMode.PercentOutput, 0);
    intake2.set(ControlMode.PercentOutput, 0);
  }

}