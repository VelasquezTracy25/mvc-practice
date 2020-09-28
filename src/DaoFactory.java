public class DaoFactory {

    //reference the interface to access the dao
    private static Plants plantsDao;
    private static Fertilizers fertilizersDao;
    private static Pesticides pesticidesDao;

//any bean type we have will get a method called get[Bean]Dao

    // will run the PlantsDao method to create new plants if it is empty
    public static Plants getPlantsDao() {
        if (plantsDao == null) {
            plantsDao = new PlantsDao();
        }
        return plantsDao;
    }

    public static Fertilizers getFertilizersDao() {
        if (fertilizersDao == null) {
            fertilizersDao = new FertilizersDao();
        }
        return fertilizersDao;
    }

    public static Pesticides getPesticidesDao() {
        if (pesticidesDao == null) {
            pesticidesDao = new PesticidesDao();
        }
        return pesticidesDao;
    }


}
