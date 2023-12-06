import com.bridgelabz.MoodAnalysisException;
import com.bridgelabz.MoodAnalyzer;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTests {
    @Test
    public void analyzeSadMood() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am sad");
        assertEquals("SAD",moodAnalyzer.analyzeMood());
    }

    @Test
    public void analyzeHappyMood() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am happy");
        assertEquals("HAPPY",moodAnalyzer.analyzeMood());
    }

    @Test(expected = MoodAnalysisException.class)
    public void analyzeNULLMood() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        moodAnalyzer.analyzeMood();
    }
}
