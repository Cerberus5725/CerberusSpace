// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6841.CerberusSpace.subsystems;


import org.usfirst.frc6841.CerberusSpace.Robot;
import org.usfirst.frc6841.CerberusSpace.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Spark leftMotors;
    private Spark rightMotors;
    private Spark leftMotors2;
    private Spark rightMotors2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public DriveTrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        leftMotors = new Spark(0);
        addChild("LeftMotors",leftMotors);
        leftMotors.setInverted(false);
        
        rightMotors = new Spark(1);
        addChild("RightMotors",rightMotors);
        rightMotors.setInverted(true);
        
        leftMotors2 = new Spark(5);
        addChild("LeftMotors2",leftMotors2);
        leftMotors2.setInverted(false);
        
        rightMotors2 = new Spark(6);
        addChild("RightMotors2",rightMotors2);
        rightMotors2.setInverted(true);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new DriveWithJoysticks());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }


    public void driveWithJoysticks(double joystickX, double joystickY, double dSpeed)
	{

        double motorLeft;
        double motorLeft2;
        double motorRight;
        double motorRight2;
        motorLeft = (joystickX + joystickY) *dSpeed;
        motorLeft2 = (joystickX + joystickY) *dSpeed;
        motorRight = (-joystickX + joystickY) *dSpeed;
        motorRight2 = (-joystickX + joystickY) *dSpeed;
        if(motorLeft >= 1.0)
        {
            motorLeft = 1.0;
        }
        if(motorLeft2 >= 1.0)
        {
            motorLeft2 = 1.0;
        }
        if(motorRight >= 1.0)
        {
            motorRight = 1.0;
        }
        if(motorRight2 >= 1.0)
        {
            motorRight2 = 1.0;
        }
        Robot.driveTrain.leftMotors.set(motorLeft);
        Robot.driveTrain.leftMotors2.set(motorLeft2);
        Robot.driveTrain.rightMotors.set(motorRight);
        Robot.driveTrain.rightMotors2.set(motorRight2);
    }
    
    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    public void stop()
    {
        Robot.driveTrain.rightMotors.set(0);
        Robot.driveTrain.leftMotors.set(0);
        Robot.driveTrain.rightMotors2.set(0);
        Robot.driveTrain.leftMotors2.set(0);
    }
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

