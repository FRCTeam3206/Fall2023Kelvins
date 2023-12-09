// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Arm;

/** An example command that uses an example subsystem. */
public class DumpArm extends CommandBase {
  @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })
  private final double m_duration;
  private final double m_speed;

  private final Arm m_arm;
  private long m_startTime;

  /**
   * Creates a new DriveTimed. This command will drive your robot for a desired
   * speed and time.
   *
   * @param speed The speed which the robot will drive. Negative is in reverse.
   * @param time  How much time to drive in seconds
   * @param drive The drivetrain subsystem on which this command will run
   */
  public DumpArm(Arm arm) {
    m_speed = -0.25;
    m_duration = 250;
    m_arm = arm;
    addRequirements(arm);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_startTime = System.currentTimeMillis();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_arm.moveArm(m_speed);
    // m_arm.armmoter();

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_arm.stopArm();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (System.currentTimeMillis() - m_startTime) >= m_duration;
  }
}
