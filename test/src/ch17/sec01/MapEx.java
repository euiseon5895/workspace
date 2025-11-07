package ch17.sec01;

import java.util.ArrayList;
import java.util.List;

public class MapEx {
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		stList.add(new Student("tanaka", 84));
		stList.add(new Student("tanaka", 94));
		stList.add(new Student("tanaka", 14));
		stList.add(new Student("tanaka", 34));

		stList.stream().mapToInt(s -> s.getScore()).forEach(score -> System.out.println(score));
	}
}
