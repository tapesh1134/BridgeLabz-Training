import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


class Person1 {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ObjectMapperUtil {

    public static <T> T toObject(Class<T> cls, Map<String, Object> properties) {
        try {
            T obj = cls.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    Field field = cls.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    field.set(obj, fieldValue);
                } catch (NoSuchFieldException e) {
                    System.out.println("No such field: " + fieldName);
                }
            }
            return obj;

        } catch (Exception e) {
            throw new RuntimeException("Object mapping failed", e);
        }
    }
    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("name", "Tapesh");
        data.put("age", 21);

        Person1 person = ObjectMapperUtil.toObject(Person1.class, data);
        System.out.println(person);
    }
}
