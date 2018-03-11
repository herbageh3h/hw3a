package cc.hw3a.spring.fruit;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hw3a/spring/fruit")
public class FruitController {

    private FruitMapper fruitMapper;

    public FruitController(FruitMapper fruitMapper) {
        this.fruitMapper = fruitMapper;
    }

    @GetMapping("/all")
    public List<Fruit> getAllFruits() {
        return fruitMapper.findAll();
    }
}
