package CourseSelection;

import CourseSelection.Course;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-20T00:26:35")
@StaticMetamodel(Teacher.class)
public class Teacher_ { 

    public static volatile SingularAttribute<Teacher, Integer> teacherid;
    public static volatile SingularAttribute<Teacher, String> teacherfirstname;
    public static volatile CollectionAttribute<Teacher, Course> courseCollection;
    public static volatile SingularAttribute<Teacher, String> teacherlastname;
    public static volatile SingularAttribute<Teacher, String> teacherdepartmentname;

}