package fr.charly.mavenTraining;

import org.apache.commons.lang3.StringUtils;

public class PremierTest {

	public static void main(String[] args) {
		String sentenceALittleLong = "This is a super long sentence that will not fit in width on my screens";
		System.out.println(sentenceALittleLong);
		String shortenedSentence=StringUtils.abbreviate(sentenceALittleLong, 10);
		System.out.println(shortenedSentence);

	}

}