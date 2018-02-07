package ru.sndolgov.graduationproject.service.menu;

import org.springframework.transaction.annotation.Transactional;
import ru.sndolgov.graduationproject.model.Menu;
import ru.sndolgov.graduationproject.util.exception.NotFoundException;

import java.util.List;

/**
 * Created by Сергей on 07.02.2018.
 */
public interface MenuService {

    Menu creat(Menu menu, int restaurantId);

    Menu update(Menu menu, int restaurantId) throws NotFoundException;

    Menu get(int id, int restaurantId) throws NotFoundException;

    void delete(int id, int restaurantId) throws NotFoundException;

     List<Menu> getAll(int restaurantId);

     Menu getWithRestaurant(int id, int restaurantId);
}