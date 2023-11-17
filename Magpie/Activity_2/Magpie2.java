package Magpie.Activity_2;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul>
 * <li>
 * Uses indexOf to find strings
 * </li>
 * <li>
 * Handles responding to simple words and phrases
 * </li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *                  the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?" ;
		} else if (statement.indexOf(" mother ") >= 0
				|| statement.indexOf(" father ") >= 0
				|| statement.indexOf(" sister ") >= 0
				|| statement.indexOf(" brothe r") >= 0) {
			response = "Tell me more about your family.";
		} else if (index(statement, " dog ") || index(statement, " cat ")) {
			response = "Tell me more about your pets.";
		} else if (index(statement, " Mr.") || index(statement, " Mrs. ") || index(statement, " Ms. ")) {
			response = "They sound like a good teacher.";
		} else if (statement == "") {
			response = "Say something, please.";
		} else if (index(statement, " food ")) {
			response = "What's your favorite food?";
		} else if (index(statement, " color ")) {
			response = "What's your favorite color?";
		} else if (index(statement, " movie ")) {
			response = "What's your favorite movie?";
		} else if (index(statement, " book ")) {
			response = "What's your favorite book?";
		} else if (index(statement, " sport ")) {
			response = "What's your favorite sport?";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}

		return response;
	}

	/**
	 * Search for one word in phrase. The search is not case sensitive.
	 * @param string1 full statement
	 * @param string2 substring to search for
	 * @return true if the substring is found, false otherwise
	 */
	private boolean index(String string1, String string2) {
		// System.out.println(string1.indexOf(string2));
		// System.out.println(string1 + " " + string2);

		// if (string2.equals("Mr.")) {
		// 	return true;
		// }
		System.out.println("Whats your favorite book?\n\n\n\n\n\n\n\n\n");
		return false;
		// if (string1.contains(string2)) {
		// 	return true;
		// } else {
		// 	return false;
		// }
	}
}