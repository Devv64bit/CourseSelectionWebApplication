package CourseSelection;

import CourseSelection.Enrollment;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-20T00:26:35")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, Integer> studentid;
    public static volatile SingularAttribute<Student, String> studentmajor;
    public static volatile SingularAttribute<Student, String> studentgender;
    public static volatile CollectionAttribute<Student, Enrollment> enrollmentCollection;
    public static volatile SingularAttribute<Student, String> studentfirstname;
    public static volatile SingularAttribute<Student, Double> studentgpa;
    public static volatile SingularAttribute<Student, String> studentlastname;
    public static volatile SingularAttribute<Student, Date> studentbday;

}