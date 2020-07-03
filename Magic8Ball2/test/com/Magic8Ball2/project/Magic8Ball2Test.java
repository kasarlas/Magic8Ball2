package com.Magic8Ball2.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class Magic8Ball2Test {

	private static Magic8Ball2 m8b2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		m8b2 = new Magic8Ball2();//class under test
	}

	@Test
	@Order(1)
	void magic8Ball2_GivenNoParameter_Should_ConstructObject() {
		assertTrue(m8b2 instanceof Magic8Ball2);
		
	}
	@Test
	@Order(2)
	void askQuestion_GivenAString_ShouldReturnTrue(){
		boolean success = false;
		String question = "Should i cut bangs into my hair?";
		success = m8b2.askQuestion(question);
		assertTrue(success);
		assertEquals(question, m8b2.getQuestion());
		
	}
	@Test
	@Order(3)
	void shake_GivenNoParamters_ShouldReturnAnswer() {
		String answer =null;
		answer = m8b2.shake();
		assertNotNull(answer);
	
		
	}
	
}
