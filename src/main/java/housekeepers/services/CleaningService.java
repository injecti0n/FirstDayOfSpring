package housekeepers.services;

import housekeepers.tools.CleaningTool;

public class CleaningService implements HouseKeepersService{

	private CleaningTool tool;
	
	

	public CleaningService(CleaningTool tool) {
		super();
		this.tool = tool;
	}

	public CleaningTool getTool() {
		return tool;
	}

	public void setTool(CleaningTool tool) {
		this.tool = tool;
	}

	public void clean() {
		tool.doCleanJob();

	}

	public void doJob() {
		System.out.println("Cleaning Service");
		
	}

}
