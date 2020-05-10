package ProjectQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SurveyPreparing{
    public List<SurveyQuestion> prepSurvey(int number) {
        List<SurveyQuestion> survey = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String question;
        String option1;
        String option2;
        String option3;
        for (int i = 0; i < number ; i++) {
            System.out.print("Write your question? ");
            question = scanner.nextLine();
            System.out.print("Option 1: ");
            option1 = scanner.nextLine();
            System.out.print("Option 2: ");
            option2 = scanner.nextLine();
            System.out.print("Option 3: ");
            option3 = scanner.nextLine();
            survey.add(new SurveyQuestion(question,option1,option2,option3));
        }
        System.out.println(survey.toString());
        return survey;
    }
    public void startSurvey(List<SurveyQuestion> survey){
        List<String> answers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String answer;
        for (SurveyQuestion sr : survey){
            System.out.println(sr.getQuestion());
            System.out.print("a) "+sr.getOption1()+"\t");
            System.out.print("b) "+sr.getOption2()+"\t");
            System.out.print("c) "+sr.getOption3()+"\t");
            answer = scanner.nextLine();
            answers.add(answer);
        }
        System.out.println(answers);
    }
}
