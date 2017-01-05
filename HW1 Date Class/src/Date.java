
public class Date {
	int month, day, year;
	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	public void displayDate() {
		System.out.printf("Today's date is %d/%d/%d.\n", getMonth(), getDay(), getYear());
	}
}
