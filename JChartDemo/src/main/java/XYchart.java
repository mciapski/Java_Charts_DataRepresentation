import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import java.awt.*;
import java.awt.color.ColorSpace;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class XYchart extends ApplicationFrame {
  public XYchart(String applicableTitle, String title) {
    super(applicableTitle);
    JFreeChart XYchart = ChartFactory.createXYLineChart(
        title,
        "Time",
        "Price",
        createDataset(),
        PlotOrientation.VERTICAL,
        true, true, false
    );
    ChartPanel chartPanel = new ChartPanel(XYchart);
    chartPanel.setPreferredSize(new java.awt.Dimension(500, 500));
    final XYPlot plot = XYchart.getXYPlot();

    XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
    renderer.setSeriesPaint(0, Color.RED);
    renderer.setSeriesPaint(1, Color.YELLOW);
    renderer.setSeriesPaint(2, Color.GREEN);
    renderer.setSeriesStroke(0, new BasicStroke(1.0f));
    renderer.setSeriesStroke(1, new BasicStroke(1.0f));
    renderer.setSeriesStroke(2, new BasicStroke(1.0f));
    plot.setRenderer(renderer);
    setContentPane(chartPanel);
  }

  private XYDataset createDataset() {
    LocalDate localDate;

    final XYSeries ing = new XYSeries("ING Bank Slaski");
    ing.add(1, 2);
    ing.add(2, 2);
    ing.add(3, 2);

    final XYSeries millenium = new XYSeries("Millenium Bank Slaski");
    millenium.add(1, 3);
    millenium.add(2, 4);
    millenium.add(3, 5);

    final XYSeries bgz = new XYSeries("BGZ Bank Slaski");
    bgz.add(1, 5);
    bgz.add(2, 4);
    bgz.add(3, 3);

    final XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(ing);
    dataset.addSeries(millenium);
    dataset.addSeries(bgz);

    return dataset;

  }

  public static void main(String[] args) {
    XYchart xYchart = new XYchart("Bank Rates", "Rates");
    xYchart.pack();
    RefineryUtilities.centerFrameOnScreen(xYchart);
    xYchart.setVisible(true);

  }

}
