package management.library;

public @interface MyFirstAnnotation {
    String name() default "John Doe";
    int age() default 30;
}
