
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.HaloDrive;
import edu.wpi.first.wpilibj.Encoder;


/**
 *
 * @author jmiller
 */


public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive DriveBase;
    Encoder LeftEnc;
    Encoder RightEnc;
    
    public DriveTrain() {
        DriveBase = new RobotDrive(1,2,3,4);
        DriveBase.setSafetyEnabled(false);
        
    }
    
    public void halo(double Speed, double Turn){
        DriveBase.arcadeDrive(-Speed*Math.abs(Speed), -Turn*Math.abs(Turn));
    }

    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new HaloDrive());
    }
    
    
}

