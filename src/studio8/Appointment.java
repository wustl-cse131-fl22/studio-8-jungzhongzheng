package studio8;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Appointment {

	private Date date;
	private Time time;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(1, 23, 2022, false);
		Time t = new Time(11, 10, true);
		Appointment a1 = new Appointment(d, t);
		
	}
	

	public Appointment(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

}
