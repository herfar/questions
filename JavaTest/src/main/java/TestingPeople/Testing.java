package TestingPeople;

import java.util.List;

public interface Testing {
    public String getQuestions(int number, List<String> questions);

    public String getAnswer(int number, List<String> questions);
}
