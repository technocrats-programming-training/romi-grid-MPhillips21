// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILi.b BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;
//import frc.robot.Position;

import java.util.Scanner;

import static lib.Romi.*;


public class Robot extends ProceduralRobot {
  Position n = new Position();
  Joystick e = new Joystick(0);
  
  @Override
  public void autonomousProcedure() throws InterruptedException {
    while(true) {
      if(e.getRawButton(1)) {
        n.driveUp();
      } else if(e.getRawButton(2)) {
        n.driveDown();
      } else if(e.getRawButton(3)) {
        n.driveLeft();
      } else if(e.getRawButton(4)) {
        n.driveRight();
      } else if(e.getRawButton(5)) {
        n.returnToHome();
        break;
      } else {
        System.out.println("no");
      }

    
    }


  }
}