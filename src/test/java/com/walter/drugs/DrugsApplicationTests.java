/*
package com.walter.drugs;


import com.wal  ter.drugs.entities.DrugClass;
import com.walter.drugs.entities.Drugs;
import com.walter.drugs.repos.DrugsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class DrugsApplicationTests {

	@Autowired
	private DrugsRepository drugsRepository;
	@Test
	public void testCreateDrugs() {
		Drugs drug = new Drugs("maher","Nuvigil","oral capsule (50 mg)",new Date());
		drugsRepository.save(drug);

	}

		@Test
		public void testFindDrugs() {
			Drugs drug = drugsRepository.findById(10).get();
			System.out.println(drug);
		}

		@Test
		public void testUpdateDrugs() {
			Drugs drug = drugsRepository.findById(6).get();
			drug.setGenericName("Oxybate");
			drug.setBrandNames("Xyrem");
			drug.setDosageForm("oral capsule (50 mg)");



			drug.setLastUpdated(new Date());
			drugsRepository.save(drug);
	}

		@Test
		public void testDeleteDrugs() {
			drugsRepository.deleteById(8);
		}

		@Test
		public void testListDrugs() {
			Iterable<Drugs> drugs = drugsRepository.findAll();
			for (Drugs drug : drugs) {
				System.out.println(drug);
			}
		}

		@Test
		public void testFindByGenericName() {
			String genericName = "Oxybate";
			Iterable<Drugs> drugs = drugsRepository.findByGenericName(genericName);
			for (Drugs drug : drugs) {
				System.out.println(drug);
			}
		}

		@Test
		public void testFindByGenericNameContains() {
			String genericName = "a";
			Iterable<Drugs> drugs = drugsRepository.findByGenericNameContains(genericName);
			for (Drugs drug : drugs) {
				System.out.println(drug);
			}
		}

		@Test
		public void testFindByGenericNameBrandNames() {
			String genericName = "Armodafinil";
			String brandNames = "Nuvigil";
			Iterable<Drugs> drugs = drugsRepository.findByGenericNameBrandNames(genericName, brandNames);
			for (Drugs drug : drugs) {
				System.out.println(drug);
			}
		}

		@Test
		public void testFindByDrugClassName() {
			DrugClass drugClass = new DrugClass();
			drugClass.setIdcl(2);
			drugClass.setName("Nootropics");
			Iterable<Drugs> drugs = drugsRepository.findByDrugClass(drugClass);
			for (Drugs drug : drugs) {
				System.out.println(drug);
			}
		}

		@Test
		public void testFindByDrugClassIdcl() {
			Integer idcl = 1;
			Iterable<Drugs> drugs = drugsRepository.findByDrugClassIdcl(idcl);
			for (Drugs drug : drugs) {
				System.out.println(drug);
			}
		}


		@Test
		public void testFindByOrderByGenericNameAsc() {
			Iterable<Drugs> drugs = drugsRepository.findByOrderByGenericNameAsc();
			for (Drugs drug : drugs) {
				System.out.println(drug);
			}
		}

		@Test
		public void testSortByGenericNameDosageForm() {
			Iterable<Drugs> drugs = drugsRepository.sortByGenericNameDosageForm();
			for (Drugs drug : drugs) {
				System.out.println(drug);
			}
		}


}
*/