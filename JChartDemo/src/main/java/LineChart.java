import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class LineChart extends ApplicationFrame {
  public LineChart(String applicationTitle,String title) {
    super(applicationTitle);
    JFreeChart lineChart = ChartFactory.createLineChart(title,
        "Years","Number of Schools",
        createDataset(),
        PlotOrientation.VERTICAL,
        true,true,false);
    ChartPanel chartPanel = new ChartPanel(lineChart);
    
    chartPanel.setPreferredSize(new java.awt.Dimension(560,367));
    setContentPane(chartPanel);
  }
  DefaultCategoryDataset createDataset(){
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    dataset.addValue(15,"schools", "1970");
    dataset.addValue(30,"schools", "1980");
    dataset.addValue(45,"schools", "1990");
    return dataset;
  }

  public static void main(String[] args){
    LineChart chart = new LineChart("School vs Years"," Number of schools vs years");
    chart.pack();
    RefineryUtilities.centerFrameOnScreen(chart);
    chart.setVisible(true);

  }
}
