package Service;

import Models.User;
import java.util.ArrayList;
import java.util.List;
public class Main
{
    public static List<User> userList = new ArrayList<>();
    public static void main(String[] args)
    {
        System.out.println(userList.size());
        User user = new User();
        User user1 = new User();
        userList.add(user1);
        userList.add(user);
        user.gender = 2;
        user.setName("a");
        user.setAge(78);
        System.out.println(userList.size());
        System.out.println(userList.get(0).toString());
    }
}