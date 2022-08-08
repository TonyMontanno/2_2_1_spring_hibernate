package hiber.dao;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();


    @Transactional
    User getUserCar(String model, int series);
}
