import com.bridgelabz.MoodAnalyzer;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTests {
    @Test
    public void analyzeSadMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        assertEquals("SAD",moodAnalyzer.analyzeMood("I am sad"));
    }
}
