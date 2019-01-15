package housekeepers.services;

import housekeepers.tools.GardenTool;

public class GardeningService implements HouseKeepersService{
	private GardenTool tool;
	public GardenTool getTool() {
		return tool;
	}

	public void setTool(GardenTool tool) {
		this.tool = tool;
	}

	public GardeningService(GardenTool tool) {
		super();
		this.tool = tool;
	}

	public void doGardenJob() {
		System.out.println("");
	}

	public void doJob() {
		System.out.println("Do Garden Job");
		
	}
	
	

}
