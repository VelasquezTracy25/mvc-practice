public class Fertilizer {
    private long id;
    private String name;
    private int monthlyUsage; //1-4

    public Fertilizer(){};

    public Fertilizer(String name) {
        this.name = name;
        this.monthlyUsage=monthlyUsage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthlyUsage() {
        return monthlyUsage;
    }

    public void setMonthlyUsage(int monthlyUsage) {
        this.monthlyUsage = monthlyUsage;
    }
}
