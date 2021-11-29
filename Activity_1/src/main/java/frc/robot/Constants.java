/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {
    //TODO: 1. Set this to the motor ports
    public static final int kLeftMotor1Port = 1;
    public static final int kRightMotor1Port = 4;
    
    public static final int kLeftMotor2Port = 2;
    public static final int kRightMotor2Port = 5;

     //make sure your controller is 0
    public static final int kControllerPort = 0;

    //TODO: 1. Set the joystick axis
    public static final int kLeftXJoyAxis = 0;
    public static final int kLeftYJoyAxis = 1;
    public static final int kRightXJoyAxis = 4;
    public static final int kRightYJoyAxis = 5;
    
    //buttons
    public static final int kA = 1;
    public static final int kB = 2;
    public static final int kX = 3;
    public static final int kY = 4;

  }
}