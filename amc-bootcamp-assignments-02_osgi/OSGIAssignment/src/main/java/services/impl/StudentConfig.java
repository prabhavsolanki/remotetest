package services.impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Student configurations", description = "Custom configurations for Students")
public @interface StudentConfig {

    @AttributeDefinition(name = "Maximum Students", type = AttributeType.INTEGER)
    int maxStudents() default 60;

    @AttributeDefinition(name = "Passing marks", type = AttributeType.INTEGER)
    int passingMarks() default 35;

}
