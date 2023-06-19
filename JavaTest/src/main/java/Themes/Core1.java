package Themes;

import TestingPeople.Testing;
import lombok.*;
import java.util.List;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Core1 implements Testing {

    private List<String> question;

    @Override
    public String getQuestions(int number, List<String> question) {
        if (number >= question.size()) {
            System.out.println("Вы ввели некорректный номер вопроса. Вы видите последний из списка: ");
            return question.get(question.size() - 1);
        }
        return question.get(number);
    }

    @Override
    public String getAnswer(int number, List<String> questions) {
        return null;
    }
}
