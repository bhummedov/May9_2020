package ProjectQuestion;

import java.util.List;

public class Survey {
    public static void main(String[] args) {
        SurveyPreparing mySurvey = new SurveyPreparing();
        List<SurveyQuestion> survey= mySurvey.prepSurvey(3);
        mySurvey.startSurvey(survey);
    }
}
