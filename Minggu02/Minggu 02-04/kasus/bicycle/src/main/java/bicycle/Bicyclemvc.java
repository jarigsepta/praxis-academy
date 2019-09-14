package bicycle;

import bicycle.Bicycle;
import bicycle.BicycleController;
import bicycle.BicycleView;

public class Bicyclemvc {
    public static void main(String[] args) {
        Bicycle model = retriveBicycleFromDatabase();

        BicycleView view = new BicycleView();
        BicycleController controller = new BicycleController(model, view);
        controller.updateView();

        controller.setCadence(20);
        controller.updateView();
    }

    private static Bicycle retriveBicycleFromDatabase() {
        Bicycle bicycle = new Bicycle();
        bicycle.setCadence(30);
        bicycle.setGear(100);
        bicycle.setSpeed(120);
        return bicycle;
    }
}