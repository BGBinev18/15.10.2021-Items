package Item;

import java.util.Scanner;

public class Item {

	private String title;
	private boolean borrowed;
	private int year;
	private int month;
	private int dayOfMonth;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public boolean isBorrowed() {
		return borrowed;
	}
	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	
	public int getDayOfMonth() {
		return dayOfMonth;
	}
	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	
	public void getTime() {
		
	}
	private int borrowedInt = borrowed ? 1:0;
	public void print(String title,boolean borrowed,int year, int month,int dayOfMonth,int borrowedInt) {
		System.out.println(title+" "+borrowed+" "+year+" "+month+" "+dayOfMonth);
	}
}