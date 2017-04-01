package com.zinmorrow.test;

import com.zinmorrow.CaeserCipher;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaeserCipherTest {

	private final CaeserCipher foo = new CaeserCipher();
	
	@Test
	public void shouldReturnString() {
		assertEquals("middle-Outz", foo.useStringBuilder("middle-Outz"));
		assertEquals("F16-Fighter", foo.useStringBuilder("F16-Fighter"));
	}
	
	
	@Test
	public void shouldReturnAsciiNums() {
		assertEquals("109;105;100;100;108;101;45;79;117;116;122;", foo.getAsciiNums ("middle-Outz", 11));
		assertEquals("74;97;118;97;32;73;115;32;70;117;110;", foo.getAsciiNums ("Java Is Fun", 11));
	}
	
	@Test
	public void shouldReturnAsciiNumsPlusAddend() {
		assertEquals("112;108;103;103;111;104;48;82;120;119;125;", foo.getAsciiNumsAddition(11, "middle-Outz", 3));
		assertEquals("78;101;122;101;36;77;119;36;74;121;114;", foo.getAsciiNumsAddition(11, "Java Is Fun", 4));
	}
	
	@Test
	public void shouldReturnAsciiNumsIfLowerCase() {
		assertEquals("106;97;118;97;", foo.getAsciiNumsLowerCase(4, "java"));
		assertEquals("106;97;118;97;", foo.getAsciiNumsLowerCase(4, "java-4"));
	}
	
	@Test
	public void shouldReturnAsciiNumsIfUpperCase() {
		assertEquals("74;65;86;65;", foo.getAsciiNumsUpperCase(4, "JAVA"));
		assertEquals("65;", foo.getAsciiNumsUpperCase(4, "javA-4"));
	}
	
	
	@Test
	public void shouldReturnRotatedAsciiNumsIfLowerCase() {
		assertEquals("99;", foo.getAsciiNumsLowerCaseRotation(1, "z", 3));
		assertEquals("107;98;119;98;", foo.getAsciiNumsLowerCaseRotation(4, "java", 1));
		assertEquals("98;107;111;121;", foo.getAsciiNumsLowerCaseRotation(9, "ziNmORROw", 2));
		
	}
	
	@Test
	public void shouldReturnRotatedAsciiNumsIfUpperCase() {
		assertEquals("65;", foo.getAsciiNumsUpperCaseRotation(1, "Z", 1));
		assertEquals("82;65;", foo.getAsciiNumsUpperCaseRotation(9, "ziNmorr0W", 4));
	}
	
	@Test
	public void shouldReturnEncryptedString() {
		assertEquals("okffng-Qwvb", foo.caeserCipher(11, "middle-Outz", 2));
	}

	
}
