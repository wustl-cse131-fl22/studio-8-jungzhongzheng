package studio8;

import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;
/**
 * 
 * @param month
 * @param day
 * @param year
 * @param holiday
 */
    public Date(int month, int day, int year, boolean holiday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
    /**
     * 
     */

	@Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", holiday=" + holiday + "]";
	}

	public static void main(String[] args) {
		Date d = new Date(1, 23, 2022, false);
		
    }
	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}

}
