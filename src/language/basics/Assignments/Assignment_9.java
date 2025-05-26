package language.basics.Assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Assignment_9 {

	public static void main(String[] args) {
		// Employee Names
		String[] empName = { "Alice Johnson", "Bob Smith", "Carol Smith", "David Brown", "Eva Green" };

		// Employee BaseSalary,Experience and Rating

		Double[] emp1Data = { 75000.0, 5.1, 4.2 };
		Double[] emp2Data = { 68000.0, 3.2, 3.8 };
		Double[] emp3Data = { 82000.2, 7.1, 4.5 };
		Double[] emp4Data = { 90000.0, 10.2, 2.5 };
		Double[] emp5Data = { 60000.0, 2.4, 3.5 };

		Map<String, Double[]> empDetails = new HashMap<>();

		empDetails.put(empName[0], emp1Data);
		empDetails.put(empName[1], emp2Data);
		empDetails.put(empName[2], emp3Data);
		empDetails.put(empName[3], emp4Data);
		empDetails.put(empName[4], emp5Data);

		// Hike Percentage

		for (String emp : empName) {
			Double[] values = empDetails.get(emp);
		}
	}

}
