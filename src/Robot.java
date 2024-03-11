public class Robot {
    protected String type ;
    protected double code;
    protected  int orientation ;
    protected boolean etat ;

    public Robot() {
    }

    public Robot(String type, double code) {
        this.type = type;
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public double getCode() {
        return code;
    }

    public int getOrientation() {
        return orientation;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
    public void tourner(int sens){
        if((sens==1||sens==2||sens==3||sens==4)&&etat){
            setOrientation(sens);
        }else {
            System.out.printf("erreur ");
        }
    }
    public void affiche (){
        System.out.printf("etat de robot "+etat+" oriante "+orientation);
    }
}
