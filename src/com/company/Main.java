package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	FullTimeEmployee f1 = new FullTimeEmployee("f1",7000);
	FullTimeEmployee f2 = new FullTimeEmployee("f2",14000);
	FullTimeEmployee f3 = new FullTimeEmployee("f3",5000);
	FullTimeEmployee f4 = new FullTimeEmployee("f4",20000);
	FullTimeEmployee f5 = new FullTimeEmployee("f5",6500);

	PartTimeEmployee disigner = new PartTimeEmployee("disigner",25,150);
	PartTimeEmployee tester = new PartTimeEmployee("tester",35,176);
	PartTimeEmployee backEnd = new PartTimeEmployee("JavaDev",50,200);
	PartTimeEmployee gui = new PartTimeEmployee("gui",38,200);
	PartTimeEmployee devop = new PartTimeEmployee("admin",40,176);

		List<IAccounting> employees = new ArrayList<>();
		employees.add(f1);
		employees.add(f2);
		employees.add(f3);
		employees.add(f4);
		employees.add(f5);

		employees.add(disigner);
		employees.add(tester);
		employees.add(backEnd);
		employees.add(gui);
		employees.add(devop);

		int salary = employees.stream().mapToInt(IAccounting::getSalary).sum();
		IAccounting highestSalaryMan = employees.stream().max(Comparator.comparingInt
				(IAccounting::getSalary))
				.orElse(null);IAccounting lowestSalaryMan = employees.stream()
				.min(Comparator.comparingInt
				(IAccounting::getSalary))
				.orElse(null);
				double avg = employees.stream().mapToInt(IAccounting::getSalary)
						.average().orElse(0);

				int partTimeSalary = employees.stream().filter(el->
						el instanceof PartTimeEmployee).mapToInt(IAccounting::getSalary)
						.sum();
				int fullTimeSalary = employees.stream().filter(el->
						el instanceof FullTimeEmployee).mapToInt(IAccounting::getSalary)
						.sum();

				if (partTimeSalary > fullTimeSalary){
					System.out.println("Part time worker get greater salary than Full timers");
				} else {
					System.out.println("Fulltimers are the best");
				}
		System.out.print("Company contains of a" + employees.size() +
				System.lineSeparator() + "Total salary is " + salary + " USD.");
	}
}
