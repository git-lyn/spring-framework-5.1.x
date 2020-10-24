import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: spring
 * @author: lyn
 * * @create: 2020-07-10 10:08
 **/
public class BB {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();
		AA bean = context.getBean(AA.class);
		System.out.println(bean);
	}
}
