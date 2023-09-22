import java.lang.annotation.*;
import java.lang.reflect.Type;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface Tabela {
    String[] nome();
    String[] carros();
    long placaVeic();

}
