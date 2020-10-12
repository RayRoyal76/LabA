package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import main.Main;
import org.junit.jupiter.api.Test;

class MathUtilTest {

    Main answers;
    
    @BeforeEach
    void makeVariable() {
    	answers = new Main();
    }
    
	@Test
	void testAdd()  {
	int actual = answers.add(10,5);
	
	assertEquals(actual,15);
	}
	
	@Test
	 void testSubtract() {
     int actual = answers.subtract(10,5);
     
     assertEquals(actual,5);
     }
	
	@Test
	 void testDivide() {
     int actual = answers.divide(10,5);
     
     assertEquals(actual,2);
	 }
	
	@Test
	 void testMultiply() {
	 int actual = answers.multiply(10,5);
	 
	 assertEquals(actual,50);
	 }
	
	@Test
	 void testCircumference() {
	 int radius = 10;	
	 double actual = answers.circumference(10);
	 double expected = 2 * radius * Math.PI;
	 assertEquals(actual,expected);
	 
	 }
}
