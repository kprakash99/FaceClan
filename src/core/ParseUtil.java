package core;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ParseUtil {

	public ParseUtil() {
		// empty because these are just helper methods
	}

	static String[] traits = { "sad", "surprise", "angry", "surprise", "happy", "disgust", "disgust", "disgust",
			"happy", "sad", "sad", "sad", "disgust", "angry", "surprise", "surprise", "surprise" };

	public void getActionUnits(double[] arr, File file) throws FileNotFoundException {
		// File file = new File("D:\\karth\\Downloads\\OpenFace Output\\" + input);
		Scanner scan = new Scanner(file);
		String[] AUS = new String[17];

		scan.nextLine();
		scan.useDelimiter(",");
		for (int i = 0; i < 676; i++) {
			scan.next();
		}
		for (int l = 0; l < 17; l++) {
			AUS[l] = scan.next();
		}
		for (int r = 0; r < 17; r++) {
			arr[r] = Double.parseDouble(AUS[r]);
		}
		scan.close();

	}

	public String getEmotion(double[] ActionUnits) {
		double AUHolder = 0;
		String stringHolder = "";
		String emotion = "";
		double sum = 0;
		double maxSum = 0;
		boolean neutral = true;

		for (int p = 0; p < ActionUnits.length; p++) {
			if (ActionUnits[p] > 1) {
				neutral = false;
				break;
			}
		}
		if (neutral)
			return "neutral";

		for (int i = 0; i < ActionUnits.length; i++) {
			for (int j = i + 1; j < ActionUnits.length; j++) {
				if (ActionUnits[i] < ActionUnits[j]) {
					AUHolder = ActionUnits[i];
					ActionUnits[i] = ActionUnits[j];
					ActionUnits[j] = AUHolder;

					stringHolder = traits[i];
					traits[i] = traits[j];
					traits[j] = stringHolder;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			sum = ActionUnits[i];
			for (int j = i + 1; j < 5; j++) {
				if (traits[i].equals(traits[j])) {
					sum += ActionUnits[j];
				}
			}
			if (sum > maxSum) {
				maxSum = sum;
				emotion = traits[i];
			}
		}

		return emotion;
	}

	public double avg(Point[] landmarks, char xORy) {
		int avg = 0;
		if (xORy == 'x') {
			for (int i = 0; i < landmarks.length; i++) {
				avg += landmarks[i].getX();
			}
		} else if (xORy == 'y') {
			for (int i = 0; i < landmarks.length; i++) {
				avg += landmarks[i].getY();
			}
		} else {
			return -1.0;
		}
		return avg / landmarks.length;
	}

	public Point centroid(Point[] landmarks) {
		Point center = new Point();
		center.setLocation(avg(landmarks, 'x'), avg(landmarks, 'y'));
		return center;
	}

	public double distance(Point a, Point b) {
		return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
	}

	// TODO recreate csv parsing program?

	// returns X coordinate array of a point array
	public int[] getXs(Point[] landmarks) {

		return null;
	}

	// returns Y coordinate array of a point array
	public int[] getYs(Point[] landmarks) {

		return null;
	}

	public Emotion AUClassifier(ArrayList<ActionUnit> AUs) {

		return Emotion.NEUTRAL;
	}

}
