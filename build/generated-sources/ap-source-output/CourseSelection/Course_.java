package CourseSelection;

import CourseSelection.Enrollment;
import CourseSelection.Teacher;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-20T00:26:35")
@StaticMetamodel(Course.class)
public class Course_ { 

    public static volatile SingularAttribute<Course, Teacher> teacherid;
    public static volatile SingularAttribute<Course, String> coursename;
    public static volatile CollectionAttribute<Course, Enrollment> enrollmentCollection;
    public static volatile SingularAttribute<Course, Integer> courseid;
    public static volatile SingularAttribute<Course, Integer> coursecredits;

}