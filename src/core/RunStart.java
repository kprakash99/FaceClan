package core;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RunStart {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Change ParseUtil to use static methods?
		// TODO file location selector is optimal way better, implement later
		ParseUtil session = new ParseUtil();
		Runtime rTime = Runtime.getRuntime();
		// replace w/ your folder location
		String facelocation = "C:\\Users\\aaron\\Documents\\FaceClan\\Face_Clan\\src";
		String photoTaker = facelocation + "\\website\\1home.html";

		// This deletes /fileIO and recreates the directory
		File fileIO = new File(facelocation + "\\fileIO");
		session.deleteDir(fileIO);
		fileIO.mkdir();

		File htmlFile = new File(photoTaker);
		Desktop.getDesktop().browse(htmlFile.toURI());

		File rawFace = new File(facelocation + "\\fileIO\\yourface.png");

		// Checks to see if the file was created, if it wasn't, the thread will sleep
		// for
		// 1 second
		System.out.print("Waiting");
		while (!rawFace.exists()) {
			TimeUnit.SECONDS.sleep(1);
			System.out.print(".");
		}

		System.out.println("Image File found.");

		// replace command1 with "cd <your OpenFace Release folder>"
		String command1 = "cd C:\\Users\\aaron\\Downloads\\OpenFace-master\\x64\\Release";
		String command2 = "FaceLandmarkImg.exe -f \"" + facelocation + "\\fileIO\\yourface.png\" -out_dir "
				+ facelocation + "\\fileIO";

		try {
			Runtime.getRuntime().exec("cmd /c \"" + command1 + " && " + command2 + "\"");
		} catch (Exception e) {
			System.out.println("you screwed up somehow ");
			e.printStackTrace();
		}

		System.out.print("Waiting");
		File csv = new File(facelocation + "\\fileIO\\yourface.csv");
		while (!csv.exists()) {
			TimeUnit.SECONDS.sleep(1);
			System.out.print(".");
			// add condition to restart if x amount of loops?
		}
		System.out.println("Landmarks File Found.");

		// empty array to be modified
		double[] ActionUnits = new double[17];

		session.getActionUnits(ActionUnits, csv);
		String emotion = session.getEmotion(ActionUnits);

		String happyPage = facelocation + "\\website\\2happy.html";
		String neutralPage = facelocation + "\\website\\3neutral.html";
		String sadPage = facelocation + "\\website\\4sad.html";
		String surprisePage = facelocation + "\\website\\5surprise.html";
		String angerPage = facelocation + "\\website\\6anger.html";
		String disgustPage = facelocation + "\\website\\7disgust.html";

		// This can be shortened severely, maybe create a method for this
		switch (emotion) {

		case "happy":
			htmlFile = new File(happyPage);
			break;
		case "surprise":
			// may be buggy
			htmlFile = new File(surprisePage);
			break;
		case "disgust":
			htmlFile = new File(disgustPage);
			break;
		case "angry":
			htmlFile = new File(angerPage);
			break;
		case "neutral":
			htmlFile = new File(neutralPage);
			break;
		default:
			htmlFile = new File(neutralPage);
			System.out.println("you screwed up somehow ");
			break;
		}
		Desktop.getDesktop().browse(htmlFile.toURI());

	}

}
