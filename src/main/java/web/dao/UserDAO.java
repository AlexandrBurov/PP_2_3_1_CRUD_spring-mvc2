package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserDAO {

    private List<User> users;

    private static int USER_COUNT;

    {
        users = new ArrayList<>();
        users.add(new User(++USER_COUNT,"Name_1","Surname_1",20));
        users.add(new User(++USER_COUNT,"Name_2","Surname_2",25));
        users.add(new User(++USER_COUNT,"Name_3","Surname_3",30));
        users.add(new User(++USER_COUNT,"Name_4","Surname_4",35));
        users.add(new User(++USER_COUNT,"Name_5","Surname_5",40));

    }
//===========================================================
    public List<User> index() {
        return users;
    }
    public User show(int id){return  users.stream().filter(user -> user.getId() == id).findAny().orElse(null);}

    public  void save(User user) {

        user.setId(++USER_COUNT);

        users.add(user);
    }

    public void update(int id, User updateUser){   // ОБНОВЛЯЕМ ПОЛЯ
        User userToBeUpdated = show(id);

        userToBeUpdated.setName(updateUser.getName());
        userToBeUpdated.setSurname(updateUser.getSurname());
        userToBeUpdated.setAge(updateUser.getAge());
    }

    public void delete(int id){
        users.removeIf(p-> p.getId() == id);
    }


//===========================================================
}
