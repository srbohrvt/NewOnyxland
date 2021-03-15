public abstract class Buildings {
    public String naming;
    protected int price;
    protected int ticketPrice;
    protected String sizeOfBuilding; //for example "3x6", "8x2"
    protected int moodImprovement;
    protected int maxVisitors;
    protected int level;
    public boolean is_builted = false; //is it under construction or was builted and can work

    public Buildings(String n, int p, int tp, String s, int mi, int mv, int l){
        this.naming=n;
        this.price = p;
        this.ticketPrice = tp;
        this.sizeOfBuilding = s;
        this.moodImprovement = mi;
        this.maxVisitors = mv;
        this.level = l;
    }

    public abstract String GetInfo();
    public abstract void UpgradeTheLevel();
    public abstract void Delete();
    public abstract void Built();
    public abstract void Repair();
    public abstract void Clean();

    public String RotatedSize() {
        String[] temp = this.getSizeOfBuilding().split("x");
        return temp[1] + "x" + temp[0];
    }
    public String getSizeOfBuilding() {
        return this.sizeOfBuilding;
    }
    public int getPrice() {
        return this.price;
    }
    public int getTicketPrice() {
        return this.ticketPrice;
    }
    public int getMoodImprovement() {
        return this.moodImprovement;
    }
    public int getMaxVisitors() {
        return this.maxVisitors;
    }
    public int getCurrentLevel() {
        return this.level;
    }


}
