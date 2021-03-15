public class Visitor {
    private int moneyToSpend;
    private int mood;

    public Visitor(){
        this.moneyToSpend=800;
        this.mood=50;
    }

    public void useBuilding(){}
    public void payTicket(){}
    public void throwTrash(){}
    public void exit(){}
    public void callTheStaff(Staff staff){}


}
