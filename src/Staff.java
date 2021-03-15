public abstract class Staff {
    private int salaryPerDay  ;
    private Point position;
    public Staff(){
    }
    public abstract void doTheJob();
    public int getSalaryPerDay(){
        return salaryPerDay;
    }
    public void setSalaryPerDay(int salary){
        this.salaryPerDay=salary;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position=new Point(position);
    }
}
