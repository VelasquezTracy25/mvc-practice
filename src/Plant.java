import java.io.Serializable;
import java.util.List;

public class Plant implements Serializable {

//properties should all be private when implementing MVC

    private long id;
    private String plantName;
    private List<Fertilizer> fertilizer;
    private String type;

// We have to create a 'zero-argument' constructor, so that Java can reserve space in memory for this object
    public Plant() {
    }

    public Plant(String plantName, List<Fertilizer> fertilizer, String type) {
        this.plantName = plantName;
        this.fertilizer = fertilizer;
        this.type = type;
    }

    //constructor
    public Plant(String plantName) {
        this.plantName = plantName;
    }

//getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Fertilizer> getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(List<Fertilizer> fertilizer) {
        this.fertilizer = fertilizer;
    }


}
