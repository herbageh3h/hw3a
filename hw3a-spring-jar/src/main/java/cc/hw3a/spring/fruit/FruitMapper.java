package cc.hw3a.spring.fruit;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface FruitMapper {
	@Select("SELECT * FROM fruit")
	public List<Fruit> findAll();

	@Insert("INSERT INTO fruit(name) VALUES(#{name})")
	@Options(useGeneratedKeys = true)
	// @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
	public void insert(Fruit fruit);

	@Delete("DELETE FROM fruit WHERE id = #{id}")
	public void delete(int id);

	public List<Fruit> search(Integer id, String name);

    @Update("UPDATE fruit SET name = #{name} WHERE id = #{id}")
    public void update(Fruit fruit);
}
