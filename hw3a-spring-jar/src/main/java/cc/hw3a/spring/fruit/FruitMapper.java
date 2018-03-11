package cc.hw3a.spring.fruit;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FruitMapper {
    @Select("SELECT * FROM fruit")
    public List<Fruit> findAll();
}
