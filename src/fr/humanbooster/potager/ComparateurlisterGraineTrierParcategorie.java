package fr.humanbooster.potager;

import java.util.Comparator;

import fr.humanbooster.potager.business.Graine;

public class ComparateurlisterGraineTrierParcategorie implements Comparator<Graine> {

	@Override
	public int compare(Graine o1, Graine o2) {
		// trie par famille
		if (o1.getFamille().getNom().compareTo(o2.getFamille().getNom()) == 0) {
			//trie par nom
			return o1.getNom().compareTo(o2.getNom());

		} else {

			return o1.getNom().compareTo(o2.getNom());

		}

	}
}
