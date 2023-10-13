package Models;
import lombok.Data;
@Data
public class User
{
    private String name;
    private Integer age;
    public Integer gender;
    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}