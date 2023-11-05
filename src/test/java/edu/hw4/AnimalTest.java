package edu.hw4;

import net.bytebuddy.dynamic.DynamicType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    public List<Animal> getListOfAnimal() {
        Animal sharik = new Animal("Sharik", Animal.Type.DOG, Animal.Sex.M, 12, 60, 20, true);
        Animal garfield = new Animal("Garfield", Animal.Type.CAT, Animal.Sex.M, 17, 180, 15, false);
        Animal Jhon = new Animal("Jhon", Animal.Type.SPIDER, Animal.Sex.M, -3, 5, 1, false);
        Animal Nemo = new Animal("Nemo", Animal.Type.FISH, Animal.Sex.M, 5, 1, 2, false);
        Animal AngryBird = new Animal("Angry Bird angry", Animal.Type.BIRD, Animal.Sex.F, 20, 0, 1, true);
        Animal Sobaka = new Animal("Sobaka", Animal.Type.DOG, Animal.Sex.F, 18, 48, 19, true);
        Animal Koshka = new Animal("Koshka", Animal.Type.CAT, Animal.Sex.F, 4, 100, 13, false);
        Animal Lesha = new Animal("Lesha", Animal.Type.SPIDER, Animal.Sex.M, -1, 0, 0, true);
        List<Animal> animals = new ArrayList<>();
        animals.add(sharik);
        animals.add(garfield);
        animals.add(Jhon);
        animals.add(Nemo);
        animals.add(AngryBird);
        animals.add(Sobaka);
        animals.add(Koshka);
        animals.add(Lesha);
        return animals;
    }

    @Test
    void animal_Task1_Check_Minimal_Height() {
        List<Animal> animals = getListOfAnimal();
        Animal response = Animal.animalTask1(animals).get(0);
        Animal expected = new Animal("Angry Bird angry", Animal.Type.BIRD, Animal.Sex.F, 20, 0, 1, true);
        assertEquals(expected, response);

    }

    @Test
    void animal_Task2_The_Second_Heaviest_Of_4_First() {
        List<Animal> animals = getListOfAnimal();
        Animal response = Animal.animalTask2(animals, 4).get(1);
        Animal expected = new Animal("Sobaka", Animal.Type.DOG, Animal.Sex.F, 18, 48, 19, true);;
        assertEquals(expected, response);
    }

    @Test
    void animal_Task3_Amount_Of_Animal_Each_type() {
        List<Animal> animals = getListOfAnimal();
        Map<Animal.Type, Long> response = Animal.animalTask3(animals);
        Map<Animal.Type, Long> expected = new HashMap<>();
        expected.put(Animal.Type.FISH, 1L);
        expected.put(Animal.Type.DOG, 2L);
        expected.put(Animal.Type.SPIDER, 2L);
        expected.put(Animal.Type.BIRD, 1L);
        expected.put(Animal.Type.CAT, 2L);
        assertEquals(expected, response);
    }

    @Test
    void animal_Task4_Longest_Name() {
        List<Animal> animals = getListOfAnimal();
        Animal response = Animal.animalTask4(animals);
        Animal expected = new Animal("Angry Bird angry", Animal.Type.BIRD, Animal.Sex.F, 20, 0, 1, true);
        assertEquals(expected, response);
    }

    @Test
    void animal_Task5_Male_Or_Female_More() {
        List<Animal> animals = getListOfAnimal();
        Animal.Sex response = Animal.animalTask5(animals);
        Animal.Sex expected = Animal.Sex.M;
        assertEquals(expected, response);
    }

    @Test
    void animal_Task6_Heaviest_Animal_Of_Each_Type() {
        List<Animal> animals = getListOfAnimal();
        Map<Animal.Type, Animal> response = Animal.animalTask6(animals);
        Map<Animal.Type, Animal> expected = new HashMap<>();
        expected.put(Animal.Type.SPIDER, new Animal("Jhon", Animal.Type.SPIDER, Animal.Sex.M, -3, 5, 1, false));
        expected.put(Animal.Type.BIRD, new Animal("Angry Bird angry", Animal.Type.BIRD, Animal.Sex.F, 20, 0, 1, true));
        expected.put(Animal.Type.DOG, new Animal("Sharik", Animal.Type.DOG, Animal.Sex.M, 12, 60, 20, true));
        expected.put(Animal.Type.CAT, new Animal("Garfield", Animal.Type.CAT, Animal.Sex.M, 17, 180, 15, false));
        expected.put(Animal.Type.FISH, new Animal("Nemo", Animal.Type.FISH, Animal.Sex.M, 5, 1, 2, false));
        assertEquals(expected, response);
    }

    @Test
    void animalTask7_Oldest_Third_Animal() {
        List<Animal> animals = getListOfAnimal();
        Animal response = Animal.animalTask7(animals, 3);
        Animal expected = new Animal("Garfield", Animal.Type.CAT, Animal.Sex.M, 17, 180, 15, false);
        assertEquals(expected, response);
    }

    @Test
    void animal_Task8_Heaviest_Lower_Than_70() {
        List<Animal> animals = getListOfAnimal();
        Animal response = Animal.animalTask8(animals, 70).get();
        Animal expected = new Animal("Sharik", Animal.Type.DOG, Animal.Sex.M, 12, 60, 20, true);
        assertEquals(expected, response);
    }

    @Test
    void animal_Task9_Sum_Of_Paws() {
        List<Animal> animals = getListOfAnimal();
        Integer response = Animal.animalTask9(animals);
        Integer expected = 34;
        assertEquals(expected, response);
    }

    @Test
    void animal_Task10_Age_Not_Eauals_Paws() {
        List<Animal> animals = getListOfAnimal();
        List<Animal> response = Animal.animalTask10(animals);
        List<Animal> expected = new ArrayList<>();
        expected.add(new Animal("Sharik", Animal.Type.DOG, Animal.Sex.M, 12, 60, 20, true));
        expected.add(new Animal("Garfield", Animal.Type.CAT, Animal.Sex.M, 17, 180, 15, false));
        expected.add(new Animal("Jhon", Animal.Type.SPIDER, Animal.Sex.M, -3, 5, 1, false));
        expected.add(new Animal("Nemo", Animal.Type.FISH, Animal.Sex.M, 5, 1, 2, false));
        expected.add(new Animal("Angry Bird angry", Animal.Type.BIRD, Animal.Sex.F, 20, 0, 1, true));
        expected.add(new Animal("Sobaka", Animal.Type.DOG, Animal.Sex.F, 18, 48, 19, true));
        expected.add(new Animal("Lesha", Animal.Type.SPIDER, Animal.Sex.M, -1, 0, 0, true));
        assertEquals(expected, response);
    }

    @Test
    void animal_Task11_Can_Bite_And_Higher_100() {
        List<Animal> animals = getListOfAnimal();
        List<Animal> response = Animal.animalTask11(animals);
        List<Animal> expected = new ArrayList<>();
        assertEquals(expected, response);
    }

    @Test
    void animal_Task12_Weight_More_Than_Height() {
        List<Animal> animals = getListOfAnimal();
        Integer response = Animal.animalTask12(animals);
        Integer expected = 2;
        assertEquals(expected, response);
    }

    @Test
    void animal_Task13_Name_More_Than_2_Words() {
        List<Animal> animals = getListOfAnimal();
        List<Animal> response = Animal.animalTask13(animals);
        List<Animal> expected = new ArrayList<>();
        expected.add(new Animal("Angry Bird angry", Animal.Type.BIRD, Animal.Sex.F, 20, 0, 1, true));
        assertEquals(expected, response);
    }

    @Test
    void animal_Task14_Availability_Of_Dog_Higher_200() {
        List<Animal> animals = getListOfAnimal();
        boolean response = Animal.animalTask14(animals,200);
        boolean expected = false;
        assertEquals(expected, response);
    }

    @Test
    void animal_Task15_Sum_Weight_Of_Animal_More_5_Less_4_Age_Of_Each_Type() {
        List<Animal> animals = getListOfAnimal();
        Map<Animal.Type, Integer> response = Animal.animalTask15(animals, 4, 5);
        Map<Animal.Type, Integer> expected = new HashMap<>();
        expected.put(Animal.Type.FISH, 2);
        expected.put(Animal.Type.CAT, 13);
        assertEquals(expected, response);
    }

    @Test
    void animal_Task16_Sorted_By_Type_Sex_Name_Second() {
        List<Animal> animals = getListOfAnimal();
        Animal response = Animal.animalTask16(animals).get(1);
        Animal expected = new Animal("Koshka", Animal.Type.CAT, Animal.Sex.F, 4, 100, 13, false);
        assertEquals(expected, response);
    }

    @Test
    void animal_Task17_Spiders_Bite_More_Than_Dog() {
        List<Animal> animals = getListOfAnimal();
        boolean response = Animal.animalTask17(animals);
        boolean expected = false;
        assertEquals(expected, response);
    }

    @Test
    void animalTask18() {
        List<List<Animal>> animals = new ArrayList<>();
        List<Animal> animals1 = new ArrayList<>();
        animals1.add(new Animal("Nemo", Animal.Type.FISH, Animal.Sex.M, 5, 1, 2, false));
        animals1.add(new Animal("Angry Bird angry", Animal.Type.BIRD, Animal.Sex.F, 20, 0, 1, true));
        animals1.add(new Animal("Bob", Animal.Type.FISH, Animal.Sex.M, 5, 1, 1, false));
        List<Animal> animals2 = new ArrayList<>();
        animals2.add(new Animal("Dove", Animal.Type.FISH, Animal.Sex.F, 20, 0, 1, true));
        animals.add(animals2);
        animals.add(animals1);
        Animal response = Animal.animalTask18(animals);
        Animal expected = new Animal("Nemo", Animal.Type.FISH, Animal.Sex.M, 5, 1, 2, false);
        assertEquals(expected, response);
    }

    @Test
    void animal_Task19_Task20() {
        List<Animal> animals = getListOfAnimal();
        String response = Animal.animalTask20(animals).get("Lesha");
        String expected = "[Negative age]";
        assertEquals(expected, response);
    }
}
