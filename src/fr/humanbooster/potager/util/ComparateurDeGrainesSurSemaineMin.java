package fr.humanbooster.potager.util;

import java.util.Comparator;

import fr.humanbooster.potager.business.Graine;

public class ComparateurDeGrainesSurSemaineMin implements Comparator<Graine> {

	@Override
	public int compare(Graine o1, Graine o2) {
		if (o1.getNumDeSemaineDePlantationMin() > o2.getNumDeSemaineDePlantationMin()) {

			return 1;

		} else if (o1.getNumDeSemaineDePlantationMin() == o2.getNumDeSemaineDePlantationMin()) {
			return 0;

		} else {

			return -1;
		}
	}

}
