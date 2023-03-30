package domain;

public class Monster {
    private int id;
    private String name;
    private String skill;

    public Monster() {
    }

    public Monster(int personId, String name, String skill) {
        this.id = personId;
        this.name = name;
        this.skill = skill;
    }

    public int getPersonId() {
        return id;
    }

    public void setId(int personId) {
        this.id = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}
