package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
private int hour;
private int minute;
private boolean format;
/**
 * constructs time object
 * 
 * @param hour
 * @param minute
 * @param format
 */
	public Time(int hour, int minute, boolean format) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.format = format;
	}
	/**
	 * print time
	 */
@Override
	public String toString() {
	if (format) {
		if (hour > 12) {
			return hour - 12 + ":" + minute +" pm";
		} else {
			return hour + ":" + minute + " am";
		}
	} else {
		return hour + ":" + minute;
	}
}




@Override
	public int hashCode() {
		return Objects.hash(format, hour, minute);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return format == other.format && hour == other.hour && minute == other.minute;
	}
/**
 * 
 * @param args
 */
public static void main(String[] args) {
	Time a = new Time(13, 12, true);
	System.out.println(a);
    Time b = new Time(24, 46, true);
    System.out.println(b);
    Time c = new Time(11, 10, false);
    System.out.println(c);
    Time d = new Time(1, 20, true);
    System.out.println(d);
    Time e = new Time(1, 20, true);
    System.out.println(e);
    
    LinkedList<Time> list = new LinkedList<Time>();
    list.add(a);
    list.add(b);
    list.add(c);
    list.add(d);
    list.add(a);
    System.out.println(list);
    
    
    HashSet<Time> set = new HashSet<Time>();
    set.add(a);
    set.add(b);
    set.add(a);
    System.out.println(set);
    
    System.out.print(a.equals(b));
    }
}

