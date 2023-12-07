package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
  private WPI_VictorSPX armmoter = new WPI_VictorSPX(6);

  public Arm() {}

  public void moveArm(double speed) {
    armmoter.set(speed);
  }

  public void stopArm() {
    armmoter.set(0);
  }
}
