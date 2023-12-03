import com.bridgelabz.MoodAnalyzer;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTests {
    @Test
    public void analyzeSadMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am sad");
        assertEquals("SAD",moodAnalyzer.analyzeMood());
    }

    @Test
    public void analyzeHappyMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am happy");
        assertEquals("HAPPY",moodAnalyzer.analyzeMood());
    }

    @Test
    public void analyzeNULLMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        assertEquals("HAPPY",moodAnalyzer.analyzeMood());
    }
}
