package cc.hw3a.spring.fruit;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    private FruitMapper fruitMapper;

    public FruitController(FruitMapper fruitMapper) {
        this.fruitMapper = fruitMapper;
    }

    @GetMapping("/all")
    public List<Fruit> getAllFruits() {
        return fruitMapper.findAll();
    }

    @PostMapping()
    public void add(@RequestBody Fruit fruit) {
        fruitMapper.insert(fruit);
    }

    @GetMapping("/search")
    public List<Fruit> search(@Param("id") Integer id, @Param("name") String name) {
        return fruitMapper.search(id, name);
    }

    @DeleteMapping()
    public void delete(@Param("id") int id) {
        fruitMapper.delete(id);
    }

    @PutMapping()
    public void update(@RequestBody Fruit fruit) {
        fruitMapper.update(fruit);
    }
}
