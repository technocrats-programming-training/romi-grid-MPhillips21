package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {
  private int horizontalPosition;
  private int verticalPosition;

    public void driveUp() throws InterruptedException {
      driveDistance(10);
      this.verticalPosition += 10;
    }

    public void driveDown() throws InterruptedException {
      driveDistance(-10);
      this.verticalPosition -= 10;
    }

    public void driveRight() throws InterruptedException {
      turnDegrees(90);
      driveDistance(10);
      turnDegrees(-90);
      this.horizontalPosition += 10;
    }

    public void driveLeft() throws InterruptedException {
      turnDegrees(-90);
      driveDistance(-10);
      turnDegrees(90);
      this.horizontalPosition -= 10;
    }

    public void returnToHome() throws InterruptedException {
      driveDistance((-1) * (this.verticalPosition));
      turnDegrees(-90);
      driveDistance(this.horizontalPosition);
      //if it's to the left, horizontalPosition is negative and so it drives backwards. If it's to the right, horizontalPosition is positive and so it drives forwards. Given that it is facing left, this will move it correctly.
      turnDegrees(90);
      this.horizontalPosition = 0;
      this.verticalPosition = 0;
    }

    public String toString() {
        return "(" + this.horizontalPosition + ", " + this.verticalPosition + ")";
    }
}
