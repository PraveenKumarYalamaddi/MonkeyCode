package junit.code;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestInfo;

//@RunWith(JUnitPlatform.class)
class RepeatedTests {
	Logger logger;
	
	 @BeforeEach
	    void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
	        int currentRepetition = repetitionInfo.getCurrentRepetition();
	        int totalRepetitions = repetitionInfo.getTotalRepetitions();
	        String methodName = testInfo.getTestMethod().get().getName();
	        logger.info(String.format("About to execute repetition %d of %d for %s",
	            currentRepetition, totalRepetitions, methodName));
	    }
	
	@RepeatedTest(5)
	void repetedTets1() {
		//assertTrue(4<5);
	}
	
	 @RepeatedTest(5)
	    void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo) {
	        assertEquals(5, repetitionInfo.getTotalRepetitions());
	    }
	
	 @RepeatedTest(value = 1, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	    @DisplayName("Repeat!")
	    void customDisplayName(TestInfo testInfo) {
	        assertEquals(testInfo.getDisplayName(), "Repeat! 1/1");
	    }
	 
	 @RepeatedTest(value = 5, name = "Wiederholung {currentRepetition} von {totalRepetitions}")
	    void repeatedTestInGerman() {
	        // ...
	    }
	
	@TestFactory
	@Test
    Stream<DynamicTest> dyanamicTestFromIntStream(){
		return IntStream.iterate(0, n ->n+2).limit(10).mapToObj(n -> dynamicTest("DTest"+n,()-> assertTrue(n%2 == 0)));
    	
    }
}
