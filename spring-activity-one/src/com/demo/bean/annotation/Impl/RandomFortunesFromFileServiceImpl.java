package com.demo.bean.annotation.Impl;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.demo.bean.annotation.interfaces.FortuneService;

@Component
public class RandomFortunesFromFileServiceImpl implements FortuneService {

	private String[] arr = null;
	private List<String> itemsSchool = new ArrayList<String>();
	private Random randomIndex = new Random();

	@Override
	public String getDailyFortune() {
		int index = randomIndex.nextInt(arr.length);
		return arr[index];
	}

	@PostConstruct
	private String[] getArrayListFromFile() {
		System.out.println("PostConstuct Called");
		try {
			FileInputStream fstream_school = new FileInputStream(
					"C:/Users/navee/workspace/spring-activity-one/src/FortuneServiceName.txt");
			DataInputStream data_input = new DataInputStream(fstream_school);
			BufferedReader buffer = new BufferedReader(
					new InputStreamReader(data_input));
			String str_line;
			while ((str_line = buffer.readLine()) != null) {
				str_line = str_line.trim();
				if ((str_line.length() != 0)) {
					itemsSchool.add(str_line);
				}
			}
			arr = (String[]) itemsSchool.toArray(new String[itemsSchool.size()]);
		} catch (Exception e) {
			System.out.println("File Not Found exception :" + e);
		}
		System.out.println(arr);
		return arr;
	}
}
