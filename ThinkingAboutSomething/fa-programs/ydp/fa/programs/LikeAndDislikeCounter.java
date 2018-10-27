package ydp.fa.programs;

import java.util.Scanner;

public class LikeAndDislikeCounter {
	static String s1, s2 = null;

	public int countLikesAndDislikes() {
		int like = 0, dislike = 0;
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if ((s1.charAt(i) == s2.charAt(i))) {
					if ((s1.charAt(i) == '1')) {
						like++;
					} else if ((s1.charAt(i) == '0')) {
						dislike++;
					}
				}
			}

		}
		return like + dislike;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Like(1) and Dislikes(0) of first person");
		s1 = sc.nextLine();
		System.out.println("Enter Like(1) and Dislikes(0) of second person");
		s2 = sc.nextLine();
		sc.close();
		LikeAndDislikeCounter c = new LikeAndDislikeCounter();
		System.out.println(c.countLikesAndDislikes());

	}

}
