package Service;
import java.util.Scanner;
import Models.User;
import java.util.ArrayList;
import java.util.List;
import utils.StringGenerator;
import static utils.StringGenerator.StringDegenerator;
public class Main
{
    public static List<User> userList = new ArrayList<>();
    public static List<User> Listm = new ArrayList<>();
    public static List<User> Listf = new ArrayList<>();
    public static void main(String[] args)
    {
        //System.out.println(userList.size());
        User user = new User();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();
        User user6 = new User();
        User user7 = new User();
        User user8 = new User();
        User user9 = new User();
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);
        user.gender = 1;
        user1.gender = 2;
        user2.gender = 1;
        user3.gender = 2;
        user4.gender = 1;
        user5.gender = 2;
        user6.gender = 1;
        user7.gender = 2;
        user8.gender = 1;
        user9.gender = 1;
        user.setName("a");
        user.setAge(78);
       /*System.out.println(userList.size());
        System.out.println(userList.get(0).toString());*/
        for(int i = 0;i<10;i++)
        {
            if(userList.get(i).gender == 1){Listm.add(userList.get(i));} else{Listf.add(userList.get(i));}
        }
        /*System.out.println(Listm.size());
        System.out.println(Listf.size());*/
        System.out.println("ВВедите кол-во символов:");
        Scanner in = new Scanner(System.in);
        int kolvo = in.nextInt();
        StringDegenerator(kolvo);
    }
}