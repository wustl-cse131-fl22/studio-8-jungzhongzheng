package studio8;

import java.util.HashSet;
import java.util.Set;

public class Calendar {
	Set<Appointment> calender;
	
	public Calendar() {
		calender = new HashSet<Appointment>();
	}
    public void addDate(Appointment a) {
    	calender.add(a);
    }
    public void removeDate(Appointment a) {
    	calender.remove(a);
    }
    
	@Override
	public String toString() {
		return "Calendar [calender=" + calender + "]";
	}
	public static void main(String[] args) {
		Date d = new Date(1, 23, 2022, false);
		Time t = new Time(11, 10, true);
		Appointment a1 = new Appointment(d, t);
		Calendar c = new Calendar();
		c.addDate(a1);
		System.out.println(c);
	

}
}
