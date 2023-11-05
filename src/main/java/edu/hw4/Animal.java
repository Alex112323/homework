package edu.hw4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("MagicNumber")
public record Animal(
    String name,
    Type type,
    Sex sex,
    int age,
    int height,
    int weight,
    boolean bites
) {
    enum Type {
        CAT, DOG, BIRD, FISH, SPIDER
    }

    enum Sex {
        M, F
    }

    @SuppressWarnings("MagicNumber")
    public int paws() {
        return switch (type) {
            case CAT, DOG -> 4;
            case BIRD -> 2;
            case FISH -> 0;
            case SPIDER -> 8;
        };
    }

    public static List<Animal> animalTask1(List<Animal> animals) {
        return animals.stream()
            .sorted(Comparator.comparing(Animal::height))
            .toList();
    }

    public static List<Animal> animalTask2(List<Animal> animals, int k) {
        return animals
            .stream()
            .sorted(Comparator.comparing(Animal::weight)
                .reversed())
            .limit(k)
            .toList();
    }

    public static Map<Animal.Type, Long> animalTask3(List<Animal> animals) {
        return animals
            .stream()
            .collect(Collectors
                .groupingBy(Animal::type, Collectors.counting()));
    }

    public static Animal animalTask4(List<Animal> animals) {
        return animals
            .stream()
            .max(Comparator
                .comparing(animal -> animal.name.length()))
            .get();
    }

    public static Sex animalTask5(List<Animal> animals) {
        return animals
            .stream()
            .collect(Collectors
                .groupingBy(Animal::sex, Collectors.counting()))
            .entrySet()
            .stream()
            .max(Comparator
                .comparing(Map.Entry::getValue))
            .get()
            .getKey();
    }

    public static Map<Animal.Type, Animal> animalTask6(List<Animal> animals) {
        return animals
            .stream()
            .collect(Collectors
                .groupingBy(Animal::type, Collectors
                    .maxBy(Comparator
                        .comparing(Animal::weight))))
            .entrySet()
            .stream()
            .collect(Collectors
                .toMap(Map.Entry::getKey, animal -> animal.getValue()
                    .orElse(null)));
    }

    public static Animal animalTask7(List<Animal> animals, int k) {
        return animals
            .stream()
            .sorted(Comparator
                .comparing(Animal::age)
                .reversed())
            .toList()
            .get(k - 1);
    }

    public static Optional<Animal> animalTask8(List<Animal> animals, int k) {
        return animals
            .stream()
            .filter(animal -> animal.height < k)
            .max(Comparator
                .comparing(Animal::weight));
    }

    public static Integer animalTask9(List<Animal> animals) {
        return animals
            .stream()
            .mapToInt(Animal::paws)
            .sum();
    }

    public static List<Animal> animalTask10(List<Animal> animals) {
        return animals
            .stream()
            .filter(animal -> animal.age != animal.paws())
            .toList();
    }

    public static List<Animal> animalTask11(List<Animal> animals) {
        return animals
            .stream()
            .filter(animal -> animal.bites & animal.height > 100)
            .toList();
    }

    public static Integer animalTask12(List<Animal> animals) {
        return animals
            .stream()
            .filter(animal -> animal.weight > animal.height)
            .toList().size();
    }

    public static List<Animal> animalTask13(List<Animal> animals) {
        return animals
            .stream()
            .filter(animal -> animal.name.split(" ").length >= 3)
            .toList();
    }

    public static boolean animalTask14(List<Animal> animals, int k) {
        return !animals
            .stream()
            .filter(animal -> animal.type == Type.DOG & animal.height > k)
            .toList()
            .isEmpty();
    }

    public static Map<Animal.Type, Integer> animalTask15(List<Animal> animals, int k, int l) {
        return animals
            .stream()
            .filter(animal -> animal.age >= k & animal.age <= l)
            .collect(Collectors
                .groupingBy(Animal::type, Collectors
                    .summingInt(Animal::weight)))
            .entrySet()
            .stream()
            .collect(Collectors
                .toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public static List<Animal> animalTask16(List<Animal> animals) {
        return animals
            .stream()
            .sorted(Comparator
                .comparing(Animal::type)
                .thenComparing(Animal::sex)
                .thenComparing(Animal::name))
            .toList();
    }

    public static boolean animalTask17(List<Animal> animals) {
        Map<Animal.Type, Long> map = animals
            .stream()
            .filter(animal -> (animal.type == Type.DOG || animal.type == Type.SPIDER) & animal.bites)
            .collect(Collectors
                .groupingBy(Animal::type, Collectors
                    .counting()));
    if (map.containsKey(Type.DOG) & map.containsKey(Type.SPIDER)) {
        return map.get(Type.SPIDER) > map.get(Type.DOG);
    }
    return false;
    }

    public static Animal animalTask18(List<List<Animal>> animals) {
        return animals
            .stream()
            .map(listAnimals -> listAnimals
                .stream()
                .filter(animal -> animal.type == Type.FISH)
                .max(Comparator
                    .comparing(Animal::weight))
                .get())
            .max(Comparator
                .comparing(Animal::weight))
            .get();
    }

    public static Map<String, Set<ValidationError>> animalTask19(List<Animal> animals) {
        return animals
            .stream()
            .collect(Collectors
                .toMap(Animal::name, ValidationError::makeSetError));
    }

    public static Map<String, String> animalTask20(List<Animal> animals) {
        return animals
            .stream()
            .collect(Collectors
                .toMap(Animal::name, animal -> ValidationError
                    .makeSetError(animal)
                    .toString()));
    }
}
