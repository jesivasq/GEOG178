package lecture;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] u = { 14, 14, 13, 13, 14, 14, 16, 13, 15, 21, 23, 25, 28, 29, 14, 15, 36, 14, 16, 28, 28, 28, 27, 27,
				28, 27, 27, 27, 26, 26, 26, 26, 26, 26, 25, 24, 24, 24, 25, 28, 26, 26, 25, 25, 25, 25, 25, 25, 24, 24,
				24, 24, 24, 24, 24, 24, 24, 24, 23, 23, 23, 22, 22, 23, 23, 22, 21, 20, 19, 20, 25, 20, 19, 18, 18, 19,
				20, 19, 18, 18, 18, 18, 18, 21, 19, 19, 24, 18, 18, 18, 18, 23, 19, 17, 17, 17, 16, 16, 15, 15, 15, 15,
				16, 16, 17, 17, 16, 16, 16, 17, 18, 18, 18, 17, 16, 18, 9, 6, 6, 6, 6, 7, 6, 6, 7, 6, 7, 7, 7, 7, 7, 6,
				6, 6, 5, 6, 5, 6, 7, 6, 6, 7, 8, 9, 11, 18, 15, 15, 15, 14, 14, 13, 13, 13, 13, 13, 13, 14, 14, 13, 14,
				17, 20, 8, 11, 18, 17, 16, 12, 9, 7, 5, 4 };
		XYChart chart = new XYChartBuilder().width(600).height(500).title("Ultrasonic Profile").xAxisTitle("X")
				.yAxisTitle("Y").build();
		// Customize Chart
		chart.getStyler().setDefaultSeriesRenderStyle(XYSeriesRenderStyle.Line);
		chart.getStyler().setChartTitleVisible(true);
		chart.getStyler().setLegendPosition(LegendPosition.InsideSE);
		chart.getStyler().setMarkerSize(2);
		
		System.out.println(chart.getStyler().getChartTitleFont());
		
		int[] i = IntStream.range(0, u.length).toArray();
		double[] x = Arrays.stream(i).asDoubleStream().toArray();
		chart.addSeries("Ultrasonic Profile", x, u);
		new SwingWrapper(chart).displayChart();

	}

}
