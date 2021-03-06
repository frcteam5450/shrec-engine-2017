package org.usfirst.frc.team5450.robot.autonomous;

import org.usfirst.frc.team5450.robot.Robot;
import org.usfirst.frc.team5450.robot.RobotMap;
import org.usfirst.frc.team5450.robot.commands.RetrieveGearAngle;
import org.usfirst.frc.team5450.robot.commands.VisionTurn;
import org.usfirst.frc.team5450.robot.commands.DriveBackward;
import org.usfirst.frc.team5450.robot.commands.DriveForward;
import org.usfirst.frc.team5450.robot.commands.OpenGearTray;
import org.usfirst.frc.team5450.robot.commands.Turn;
import org.usfirst.frc.team5450.robot.commands.Wait;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DeliverGear extends CommandGroup {

    public DeliverGear() {
    	// Aim and turn
    	addSequential(new DriveForward(RobotMap.tme_auto_drive / 2.0));
    	addSequential(new CenterGear());
    	addSequential(new DriveForward(RobotMap.tme_auto_drive / 2.0));
    	
    	// Wiggle back and forth
    	//addSequential(new WiggleGear());
    	addSequential(new ReleaseGear());
    	addSequential(new DriveBackward(RobotMap.tme_auto_drive / 2.0));
    }
}
