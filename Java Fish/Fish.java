package org.example;

public class Fish extends Pet {
	int currentDepth = 0;
	String currentMessage = "";

	public int dive(int howDeep) {
		currentDepth = currentDepth + howDeep;
//		System.out.println("Ныряю на глубину " + howDeep + " футов");
//		System.out.println("Я на глубине " + currentDepth + " футов ниже уровня моря");

		if (currentDepth > 100) {
			currentMessage = "Я маленькая рыбка " + " и не могу плавать глубже 100 метров";
			currentDepth = currentDepth - howDeep;
		} else {
			currentMessage = "Ныряю на глубину " + howDeep + " футов\n"
					+ "Я на глубине " + currentDepth + " футов ниже уровня моря";
		}
		System.out.println(currentMessage);

		return currentDepth;
	}

	public String say(String something) {
		return "Ты чё не знаешь, что рыбы не разговаривают?";
	}

	public void sleep() {
		currentMessage = "Спокойнойночи! Дозавтра";
	}

	public int getCurrentDepth() {
		return currentDepth;
	}

	public String getCurrentMessage() {
		return currentMessage;
	}
}
