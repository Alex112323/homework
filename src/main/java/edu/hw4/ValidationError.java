package edu.hw4;

import java.util.HashSet;
import java.util.Set;

public class ValidationError {
    TypeOfError typeOFError;

    public static Set<ValidationError> makeSetError(Animal animal) {
        Set<ValidationError> setErrors = new HashSet<>();
        if (animal.weight() < 0) {
            setErrors.add(new ValidationError(TypeOfError.NEGATIVEWEIGHT));
        } else if (animal.age() < 0) {
            setErrors.add(new ValidationError(TypeOfError.NEGATIVEAGE));
        } else if (animal.height() < 0) {
            setErrors.add(new ValidationError(TypeOfError.NEGATIVAHEIGHT));
        }
        return setErrors;
    }

    enum TypeOfError {
        NEGATIVEWEIGHT("Negative weighr"),
        NEGATIVEAGE("Negative age"),
        NEGATIVAHEIGHT("Negative height");
        String nameOfError;
        TypeOfError(String nameOfError) {
            this.nameOfError = nameOfError;
        }
    }

    public ValidationError(TypeOfError typeOFError) {
        this.typeOFError = typeOFError;
    }

    @Override
    public String toString() {
        return typeOFError.nameOfError;
    }
}
