package com.dutn;

public class Model {
	private String name;
	private String health;
	private String moderateExercise;
	private String moderateMotivation;
	private boolean techComfortable;
	
	
	public Model() {

	}
	
	public Model(String name, String health, String moderateExercise, String moderateMotivation,
			boolean techComfortable) {
		this.name = name;
		this.health = health;
		this.moderateExercise = moderateExercise;
		this.moderateMotivation = moderateMotivation;
		this.techComfortable = techComfortable;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getModerateExercise() {
		return moderateExercise;
	}
	public void setModerateExercise(String moderateExercise) {
		this.moderateExercise = moderateExercise;
	}
	public String getModerateMotivation() {
		return moderateMotivation;
	}
	public void setModerateMotivation(String moderateMotivation) {
		this.moderateMotivation = moderateMotivation;
	}
	public boolean isTechComfortable() {
		return techComfortable;
	}
	public void setTechComfortable(boolean techComfortable) {
		this.techComfortable = techComfortable;
	}
	
	
	
}
