public class Farm {
    private String name;
    private int cows;
    private int horses;
    private int sheep;
    private String ownerName;

    public Farm(String name, int cows, int horses, int sheep, String ownerName) {
        this.name = name;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public int getSheep() {
        return sheep;
    }

    public void setSheep(int sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", cows=" + cows +
                ", horses=" + horses +
                ", sheep=" + sheep +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
