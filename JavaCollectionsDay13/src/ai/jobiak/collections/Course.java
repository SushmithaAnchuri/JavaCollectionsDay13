package ai.jobiak.collections;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class Course {//implements Comparable {

	private String CourseId;
	private String title;
	private double durationhours;
	private double setfees;
	
	
	/*
	 * public Course(String courseId, String title, double durationhours, double
	 * setfees) { super(); CourseId = courseId; this.title = title;
	 * this.durationhours = durationhours; this.setfees = setfees; } public String
	 * getCourseId() { return CourseId; } public void setCourseId(String courseId) {
	 * CourseId = courseId; } public String getTitle() { return title; } public void
	 * setTitle(String title) { this.title = title; } public double
	 * getDurationhours() { return durationhours; } public void setDurationhours(int
	 * durationhours) { this.durationhours = durationhours; } public double
	 * getSetfees() { return setfees; } public void setSetfees(int setfees) {
	 * this.setfees = setfees; }
	 */
	@Override
	public int hashCode() {
		return Objects.hash(CourseId, durationhours, setfees, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(CourseId, other.CourseId) && durationhours == other.durationhours
				&& setfees == other.setfees && Objects.equals(title, other.title);
	}
	
	/*
	 * @Override public String toString() { return "Course [CourseId=" + CourseId +
	 * ", title=" + title + ", durationhours=" + durationhours + ", setfees=" +
	 * setfees + "]"; }
	 */
	/*
	 * //@Override public int compareTo(Object o) { Course ref=(Course)o;
	 * if(this.CourseId.compareTo(ref.getCourseId())<0) { return -1; } else
	 * if(this.CourseId.compareTo(ref.getCourseId())==0) { return 0; } else
	 * if(this.CourseId.compareTo(ref.getCourseId())>0) { return 1; } return 0; }
	 */
	
}
