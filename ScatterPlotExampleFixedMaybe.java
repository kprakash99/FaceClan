package CPRE186;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class ScatterPlotExampleFixedMaybe extends JFrame {
	int i;
	double x, y, u;
	static double[] array;
	static double[] array1;
	static double[] array2;
	static double[] array3;

	private static final long serialVersionUID = 6294689542092367723L;

	public static void getXValues(String input) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File output = new File("C:\\Users\\Daniel's PC\\Downloads\\" + input);
		Scanner Scan = new Scanner(output);
		String[] xValues = new String[68];
		double[] xvalues = new double[68];

		Scan.nextLine();
		Scan.useDelimiter(",");
		for (int i = 0; i < 296; i++) {
			Scan.next();
		}
		for (int j = 0; j < 68; j++) {
			xValues[j] = Scan.next();
		}

		for (int w = 0; w < 68; w++) {
			xvalues[w] = Double.parseDouble(xValues[w]);
		}
		Scan.close();

		array = xvalues;

	}

	public static void getYValues(String input) throws FileNotFoundException {
		File output = new File("C:\\Users\\Daniel's PC\\Downloads\\" + input);
		Scanner Scan = new Scanner(output);
		String[] yValues = new String[68];
		double[] yvalues = new double[68];

		Scan.nextLine();
		Scan.useDelimiter(",");
		for (int i = 0; i < 364; i++) {
			Scan.next();
		}
		for (int l = 0; l < 68; l++) {
			yValues[l] = Scan.next();
		}
		for (int r = 0; r < 68; r++) {
			yvalues[r] = Double.parseDouble(yValues[r]);
		}
		for (int u = 0; u < 68; u++) {
			yvalues[u] = -1 * yvalues[u];
		}
		Scan.close();
		array1 = yvalues;

	}
	
	public static void getAUIntensities(String input) throws FileNotFoundException {
		File output = new File("C:\\Users\\Daniel's PC\\Downloads\\" + input);
		Scanner Scan = new Scanner(output);
		String[] AUIntensities = new String[17];
		double[] AUintensities = new double[17];

		Scan.nextLine();
		Scan.useDelimiter(",");
		for (int i = 0; i < 676; i++) {
			Scan.next();
		}
		for (int l = 0; l < 17; l++) {
			AUIntensities[l] = Scan.next();
		}
		for (int r = 0; r < 17; r++) {
			AUintensities[r] = Double.parseDouble(AUIntensities[r]);
		}
//		for (int u = 0; u < 17; u++) {
//			yvalues[u] = -1 * yvalues[u];
//		}
		Scan.close();
		array2 = AUintensities;

	}
	
	public static void getAUs(String input) throws FileNotFoundException {
		File output = new File("C:\\Users\\Daniel's PC\\Downloads\\" + input);
		Scanner Scan = new Scanner(output);
		String[] AU = new String[17];
		double[] au = new double[17];

		Scan.nextLine();
		Scan.useDelimiter(",");
		for (int i = 0; i < 693; i++) {
			Scan.next();
		}
		for (int l = 0; l < 17; l++) {
			AU[l] = Scan.next();
		}
		for (int r = 0; r < 17; r++) {
			au[r] = Double.parseDouble(AU[r]);
		}
//		for (int u = 0; u < 17; u++) {
//			yvalues[u] = -1 * yvalues[u];
//		}
		Scan.close();
		array3 = au;

	}

	public ScatterPlotExampleFixedMaybe(String title) {
		super(title);

		// Create dataset
		XYDataset dataset = createDataset();

		// Create chart
		JFreeChart chart = ChartFactory.createScatterPlot("face " + "chart", "X-Axis", "Y-Axis", dataset);

		// Changes background color
		XYPlot plot = (XYPlot) chart.getPlot();
		plot.setBackgroundPaint(Color.YELLOW);

		// Create Panel
		ChartPanel panel = new ChartPanel(chart);
		setContentPane(panel);
		
		try {
			final File file1 = new File("chart.png");
			ChartUtilities.saveChartAsPNG(file1, chart, 800, 400);
		}
		catch(Exception e) {
	};
	}

	private XYDataset createDataset() {
		XYSeriesCollection dataset = new XYSeriesCollection();

		XYSeries series1 = new XYSeries("Face");
		for (i = 0; i < array.length; i++) {
			x = array[i];
			y = array1[i];
			series1.add(x, y);
		}

		dataset.addSeries(series1);

		return dataset;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the filename?");
		String whatever = "";
		whatever = in.next();
		getYValues(whatever);
		getXValues(whatever);
		SwingUtilities.invokeLater(() -> {
			ScatterPlotExampleFixedMaybe example = new ScatterPlotExampleFixedMaybe(
					"Scatter Chart Example | JAVASCAN.COM");
			example.setSize(800, 400);
			example.setLocationRelativeTo(null);
			example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			example.setVisible(true);
//			try {
//				final File file1 = new File("chart.png");
//				ChartUtilities.saveChartAsPNG(file1, chart, 800, 400);
//			}
//			catch(Exception e) {
//		};
	});
		}
	}
	
//	public void doSaveAs() throws IOException {
//	    FileDialog fileDialog = new FileDialog(this.canvas.getShell(),
//	            SWT.SAVE);
//	    String[] extensions = {"*.png"};
//	    fileDialog.setFilterExtensions(extensions);
//	    String filename = fileDialog.open();
//	    if (filename != null) {
//	        if (isEnforceFileExtensions()) {
//	            if (!filename.endsWith(".png")) {
//	                filename = filename + ".png";
//	            }
//	        }
//	        //TODO replace getSize by getBounds ?
//	        ChartUtilities.saveChartAsPNG(new File(filename), this.chart,
//	                this.canvas.getSize().x, this.canvas.getSize().y);
//	    }
//	}
//}


