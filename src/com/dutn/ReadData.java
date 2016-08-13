package com.dutn;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadData {

	private List<Model> models;

	public ReadData() {
		models = new ArrayList<>();
	}

	public void read(String file) {
		try {
			InputStream is = getClass().getResourceAsStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line = "";
			while ((line = reader.readLine()) != null) {
				String[] arr = line.split("\t");
				Model model = new Model();
				model.setHealth(arr[0]);
				model.setModerateExercise(arr[1]);
				model.setModerateMotivation(arr[2]);
				if (arr[3].equals("yes")) {
					model.setTechComfortable(true);
				} else {
					model.setTechComfortable(false);
				}
				model.setName(arr[4]);
				models.add(model);
			}
		} catch (Exception ex) {

		}
	}

	public List<Model> getModels() {
		return models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}

}
