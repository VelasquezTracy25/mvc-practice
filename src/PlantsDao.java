import java.util.ArrayList;
import java.util.List;

public class PlantsDao implements Plants{

//create temporary list to hold plants as they are created
    private List<Plant> plants = new ArrayList<>();

    public PlantsDao(){

    }


    @Override
    public Plant findByID(long id) {
        return null;
    }

    @Override
    public long createPlant(Plant plant) {
        return 0;
    }
}
