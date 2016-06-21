import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


	@Target({ElementType.FIELD,ElementType.METHOD})
	@Retention(RetentionPolicy.SOURCE)
	@Documented
	@Inherited
	public @interface myAnnotation{
		String validate() default "false";
		String value() default "value1";
	}
	

