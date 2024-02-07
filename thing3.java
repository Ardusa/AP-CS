// public class thing3 {
//     public static void main(String[] args) {
//         double groundToShooterInches = 27;
//         double floorToSpeakerBottomMouthInches = 78;
//         double shooterToSpeakerBottomMouthMeters = Units
//                 .inchesToMeters(floorToSpeakerBottomMouthInches - groundToShooterInches);
//         /* Swerve Pose calculated in meters */
//         double distToSpeakerMeters = -Math.sqrt(Math.pow(currentPose.getX(), 2) + Math.pow(currentPose.getY(), 2));
//         double angleToSpeaker = Math.atan2(shooterToSpeakerBottomMouthMeters, distToSpeakerMeters);
//         angleToSpeaker = Units.radiansToDegrees(angleToSpeaker);
//         angleToSpeaker *= -1;
//     }
// }
