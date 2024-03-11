public class RobotMobile extends Robot{
    private int abs;
    private int ord;



    public RobotMobile(){

    }
    public RobotMobile(String type, double code, int abs, int ord) {
        super(type, code);
        this.abs = abs;
        this.ord = ord;
    }

    public int getAbs() {
        return abs;
    }

    public void setAbs(int abs) {
        this.abs = abs;
    }

    public int getOrd() {
        return ord;
    }

    public void setOrd(int ord) {
        this.ord = ord;
    }

    public void avancer(int x){
        if(x>0&&x<=4){
        switch (x){
            case 3:  setAbs(getAbs()+1);
                break;
            case 4:  setAbs(getAbs()+1);
                break;
            case 1:  setOrd(getOrd()-1);
                break;
            case 2:  setOrd(getOrd()-1);
                break;
        }
        }
    }
    public void affichePosition(){
        System.out.printf("l'abscice "+abs+" l'ordonne "+ ord);
    }

    @Override
    public void affiche() {
        super.affiche();
        affichePosition();
    }

}
