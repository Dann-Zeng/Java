package team.domain;

public class Architect extends Designer {
    private int stack;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stack) {
        super(id, name, age, salary, equipment, bonus);
        this.stack = stack;
    }

    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        this.stack = stack;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" +
                getBonus() + "\t" + getStack() + "\t" + getEquipment().getDescription();
    }

    @Override
    public String getDetailsForTeam(){
        return getBasicDetailsForTeam() + "设计师/t" + getBonus() + "/t" + getStack();
    }
}
