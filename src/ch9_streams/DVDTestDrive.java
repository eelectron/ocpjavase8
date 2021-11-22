package ch9_streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DVDTestDrive {
	public static void main(String[] args) {
		List<DVDInfo> dvds = loadDVD("/Users/prashantsingh/eclipse-workspace/OCPJavaSE8/src/ch9_streams/dvdinfo.txt");
		dvds.forEach(System.out::println);
	}
	
	public static List<DVDInfo> loadDVD(String filename){
		List<DVDInfo> dvds = new ArrayList<>();
		try(Stream<String> stream = Files.lines(Paths.get(filename))){
			stream.forEach(line -> {
				String[] dvdItems = line.split("/");
				DVDInfo dvd = new DVDInfo(dvdItems[0], dvdItems[1], dvdItems[2]);
				dvds.add(dvd);
			});
		}
		catch(IOException e) {
			System.out.println("Error reading DVD");
			e.printStackTrace();
		}
		return dvds;
	}
}