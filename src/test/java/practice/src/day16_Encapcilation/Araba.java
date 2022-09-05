package practice.src.day16_Encapcilation;

public class Araba { //POJO CLAAS(MODEL)
    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba() {
    }

    public Araba(String model, String rennk, int motor, int yil) {
        this.model = model;
        this.renk = rennk;
        setMotor(motor);
        setYil(yil);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRennk() {
        return renk;
    }

    public void setRennk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("motor gucu 1000 den az olamaz");
        }else
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){
            this.yil=(-1)*yil;
        }else
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
