//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Robot robot=new Robot("GAA0",14);
robot.setOrientation(4);
robot.setEtat(true);
robot.affiche();
RobotMobile robotMobile=new RobotMobile("kobre",777,4,5);
robotMobile.avancer(4);
robotMobile.affichePosition();
    }
}