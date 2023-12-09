// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.Arm;

public final class Autos {
  /** Example static factory for an autonomous command. */
  public static CommandBase simpleAuto(Drive drive, Arm arm) {
    // return Commands.sequence(new DumpArm(arm));
    return Commands.sequence(new DriveTimed(0.70, 2, drive), new DumpArm(arm));
  }

  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
