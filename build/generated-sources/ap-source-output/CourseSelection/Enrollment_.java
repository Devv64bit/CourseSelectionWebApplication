package CourseSelection;

import CourseSelection.Course;
import CourseSelection.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-20T00:26:35")
@StaticMetamodel(Enrollment.class)
public class Enrollment_ { 

    public static volatile SingularAttribute<Enrollment, String> enrollmentsemester;
    public static volatile SingularAttribute<Enrollment, Student> studentid;
    public static volatile SingularAttribute<Enrollment, Integer> enrollmentid;
    public static volatile SingularAttribute<Enrollment, Integer> enrollmentyear;
    public static volatile SingularAttribute<Enrollment, String> studentgrade;
    public static volatile SingularAttribute<Enrollment, Course> courseid;

}