public class Thief {
    private int skillLevel;
    private final int moneyStolen;

    public Thief(int skillLevel){
        this.skillLevel=skillLevel;
        moneyStolen=0;
    }
    public void steal(){}
    public void run(){}

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public int getMoneyStolen() {
        return moneyStolen;
    }


}
