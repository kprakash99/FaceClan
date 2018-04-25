package core;

import java.awt.Point;
import core.ParseUtil;

public class Face {
	// Facial landmark features
	private Point[] facialMarks;
	private Point[] lFace;
	private Point chin;
	private Point[] rFace;
	private Point[] lEyebrow;
	private Point[] rEyebrow;
	private Point[] noseCrest;
	private Point[] noseBottom;
	private Point[] lEye;
	private Point[] rEye;
	private Point lLipCorner;
	private Point[] upperLip;
	private Point rLipCorner;
	private Point[] lowerLip;
	private Point lMouthCorner;
	private ParseUtil math;
	private Emotion feel;
	
	public Point[] getFacialMarks() {
		return facialMarks;
	}

	public void setFacialMarks(Point[] facialMarks) {
		this.facialMarks = facialMarks;
	}

	public Point[] getlFace() {
		return lFace;
	}

	public void setlFace(Point[] lFace) {
		this.lFace = lFace;
	}

	public Point getChin() {
		return chin;
	}

	public void setChin(Point chin) {
		this.chin = chin;
	}

	public Point[] getrFace() {
		return rFace;
	}

	public void setrFace(Point[] rFace) {
		this.rFace = rFace;
	}

	public Point[] getlEyebrow() {
		return lEyebrow;
	}

	public void setlEyebrow(Point[] lEyebrow) {
		this.lEyebrow = lEyebrow;
	}

	public Point[] getrEyebrow() {
		return rEyebrow;
	}

	public void setrEyebrow(Point[] rEyebrow) {
		this.rEyebrow = rEyebrow;
	}

	public Point[] getNoseCrest() {
		return noseCrest;
	}

	public void setNoseCrest(Point[] noseCrest) {
		this.noseCrest = noseCrest;
	}

	public Point[] getNoseBottom() {
		return noseBottom;
	}

	public void setNoseBottom(Point[] noseBottom) {
		this.noseBottom = noseBottom;
	}

	public Point[] getlEye() {
		return lEye;
	}

	public void setlEye(Point[] lEye) {
		this.lEye = lEye;
	}

	public Point[] getrEye() {
		return rEye;
	}

	public void setrEye(Point[] rEye) {
		this.rEye = rEye;
	}

	public Point getlLipCorner() {
		return lLipCorner;
	}

	public void setlLipCorner(Point lLipCorner) {
		this.lLipCorner = lLipCorner;
	}

	public Point[] getUpperLip() {
		return upperLip;
	}

	public void setUpperLip(Point[] upperLip) {
		this.upperLip = upperLip;
	}

	public Point getrLipCorner() {
		return rLipCorner;
	}

	public void setrLipCorner(Point rLipCorner) {
		this.rLipCorner = rLipCorner;
	}

	public Point[] getLowerLip() {
		return lowerLip;
	}

	public void setLowerLip(Point[] lowerLip) {
		this.lowerLip = lowerLip;
	}

	public Point getlMouthCorner() {
		return lMouthCorner;
	}

	public void setlMouthCorner(Point lMouthCorner) {
		this.lMouthCorner = lMouthCorner;
	}

	public Point[] getUpperMouth() {
		return upperMouth;
	}

	public void setUpperMouth(Point[] upperMouth) {
		this.upperMouth = upperMouth;
	}

	public Point getrMouthCorner() {
		return rMouthCorner;
	}

	public void setrMouthCorner(Point rMouthCorner) {
		this.rMouthCorner = rMouthCorner;
	}

	public Point[] getLowerMouth() {
		return lowerMouth;
	}

	public void setLowerMouth(Point[] lowerMouth) {
		this.lowerMouth = lowerMouth;
	}

	public Point getlBrowAvg() {
		return lBrowAvg;
	}

	public void setlBrowAvg(Point lBrowAvg) {
		this.lBrowAvg = lBrowAvg;
	}

	public Point getrBrowAvg() {
		return rBrowAvg;
	}

	public void setrBrowAvg(Point rBrowAvg) {
		this.rBrowAvg = rBrowAvg;
	}

	public Point getlEyeAvg() {
		return lEyeAvg;
	}

	public void setlEyeAvg(Point lEyeAvg) {
		this.lEyeAvg = lEyeAvg;
	}

	public Point getrEyeAvg() {
		return rEyeAvg;
	}

	public void setrEyeAvg(Point rEyeAvg) {
		this.rEyeAvg = rEyeAvg;
	}

	public Point getUpLipAvg() {
		return upLipAvg;
	}

	public void setUpLipAvg(Point upLipAvg) {
		this.upLipAvg = upLipAvg;
	}

	public Point getLoLipAvg() {
		return loLipAvg;
	}

	public void setLoLipAvg(Point loLipAvg) {
		this.loLipAvg = loLipAvg;
	}

	public Point getUpMouthAvg() {
		return upMouthAvg;
	}

	public void setUpMouthAvg(Point upMouthAvg) {
		this.upMouthAvg = upMouthAvg;
	}

	public Point getLoMouthAvg() {
		return loMouthAvg;
	}

	public void setLoMouthAvg(Point loMouthAvg) {
		this.loMouthAvg = loMouthAvg;
	}

	public double getlBrowDist() {
		return lBrowDist;
	}

	public void setlBrowDist(double lBrowDist) {
		this.lBrowDist = lBrowDist;
	}

	public double getrBrowDist() {
		return rBrowDist;
	}

	public void setrBrowDist(double rBrowDist) {
		this.rBrowDist = rBrowDist;
	}

	public double getBetweenBrowDist() {
		return betweenBrowDist;
	}

	public void setBetweenBrowDist(double betweenBrowDist) {
		this.betweenBrowDist = betweenBrowDist;
	}

	public double getBrowTipDist() {
		return BrowTipDist;
	}

	public void setBrowTipDist(double browTipDist) {
		BrowTipDist = browTipDist;
	}

	public double getLipDist() {
		return lipDist;
	}

	public void setLipDist(double lipDist) {
		this.lipDist = lipDist;
	}

	public double getMouthDist() {
		return mouthDist;
	}

	public void setMouthDist(double mouthDist) {
		this.mouthDist = mouthDist;
	}

	public boolean isMouthopen() {
		return mouthopen;
	}

	public void setMouthopen(boolean mouthopen) {
		this.mouthopen = mouthopen;
	}
	private Point[] upperMouth;
	private Point rMouthCorner;
	private Point[] lowerMouth;
	// Averages for emotion classification
	private Point lBrowAvg;
	private Point rBrowAvg;
	private Point lEyeAvg;
	private Point rEyeAvg;
	private Point upLipAvg;
	private Point loLipAvg;
	private Point upMouthAvg;
	private Point loMouthAvg;
	// Distances for emotion classification
	private double lBrowDist;
	private double rBrowDist;
	private double betweenBrowDist;
	private double BrowTipDist;
	private double lipDist;
	private double mouthDist;
	// characteristics
	private boolean mouthopen;

	// look up polymorphism or try other way to compact, split into more methods for
	// cleaner code
	Face(Point[] landmarks) {
		facialMarks = landmarks.clone();
		for (int i = 0; i < facialMarks.length; i++) {
			if (i >= 0 && i < 8) {
				lFace[i] = facialMarks[i];
			} else if (i == 8) {
				chin = facialMarks[i];
			} else if (i >= 9 && i < 17) {
				rFace[i] = facialMarks[i];
			} else if (i >= 17 && i < 22) {
				lEyebrow[i] = facialMarks[i];
			} else if (i >= 22 && i < 27) {
				rEyebrow[i] = facialMarks[i];
			} else if (i >= 27 && i < 31) {
				noseCrest[i] = facialMarks[i];
			} else if (i >= 31 && i < 36) {
				noseBottom[i] = facialMarks[i];
			} else if (i >= 36 && i < 42) {
				lEye[i] = facialMarks[i];
			} else if (i >= 42 && i < 48) {
				rEye[i] = facialMarks[i];
			} else if (i == 48) {
				lLipCorner = facialMarks[i];
			} else if (i >= 49 && i < 54) {
				upperLip[i] = facialMarks[i];
			} else if (i == 54) {
				rLipCorner = facialMarks[i];
			} else if (i >= 55 && i < 60) {
				lowerLip[i] = facialMarks[i];
			} else if (i == 60) {
				lMouthCorner = facialMarks[i];
			} else if (i >= 61 && i < 64) {
				upperMouth[i] = facialMarks[i];
			} else if (i == 64) {
				rMouthCorner = facialMarks[i];
			} else if (i >= 65 && i < 68) {
				lowerMouth[i] = facialMarks[i];
			}
		}
	}

	// checks distance to eyes, and brow shape
	public void eyebrowAnalysis(Point[] leftbrow, Point[] rightbrow, Point[] leftEye, Point[] rightEye) {
		
		lEyeAvg = math.centroid(leftEye);
		rEyeAvg = math.centroid(rightEye);
		lBrowAvg = math.centroid(leftbrow);
		rBrowAvg = math.centroid(rightbrow);

		// distance from eye to eyebrow
		lBrowDist = math.distance(lBrowAvg, lEyeAvg);
		rBrowDist = math.distance(rBrowAvg, rEyeAvg);
		// distance between left and right eyebrow centroids
		betweenBrowDist = math.distance(lBrowAvg, rBrowAvg);
		// distance between left and right eyebrow tips
		BrowTipDist = math.distance(leftbrow[leftbrow.length], rightbrow[0]);
	}
	public void lipMouthAnalysis() {
		
		upLipAvg = math.centroid(upperLip);
		loLipAvg = math.centroid(lowerLip);
		upLipAvg = math.centroid(upperLip);
		upLipAvg = math.centroid(upperLip);
	}
}
