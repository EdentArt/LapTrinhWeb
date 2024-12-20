package vn.iotstar.services;

import java.util.List;
import java.util.Locale.Category;

public interface ICategoryService {int count();

List<Category> findAll(int page, int pagesize);

List<Category> findByCategoryname(String catname);

List<Category> findAll();

Category findById(int cateid);

void delete(int cateid) throws Exception;

void update(vn.iotstar.entity.Category category);

void insert(vn.iotstar.entity.Category category);

void insert(Category category);

void update(Category category);


}
