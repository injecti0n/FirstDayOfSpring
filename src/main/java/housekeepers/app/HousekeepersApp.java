package housekeepers.app;

import java.util.ArrayList;
import java.util.List;

import housekeepers.services.CleaningService;
import housekeepers.services.GardeningService;
import housekeepers.services.HouseKeepersService;
import housekeepers.tools.Bahcivan;
import housekeepers.tools.Broom;
import housekeepers.tools.CleaningTool;
import housekeepers.tools.GardenTool;
import housekeepers.tools.VacuumCleaner;

public class HousekeepersApp {

	public static void main(String[] args) {

		CleaningTool broom = new Broom();
		CleaningService jill = new CleaningService(broom);

		CleaningTool vacuum = new VacuumCleaner();
		CleaningService john = new CleaningService(vacuum);

		GardenTool mower = new Bahcivan();
		GardeningService alf = new GardeningService(mower);

		List<HouseKeepersService> housekeepers = new ArrayList<HouseKeepersService>();
		housekeepers.add(jill);
		housekeepers.add(alf);
		housekeepers.add(john);
		
		for (HouseKeepersService houseKeepersService : housekeepers) {
			houseKeepersService.doJob();
		}
	}

}
