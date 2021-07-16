import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FirstChart extends ApplicationFrame {

  public FirstChart(String title) {
    super(title);
  }

  public static void main(String[] args) throws IOException {


    DefaultPieDataset pieDataset = new DefaultPieDataset();
    pieDataset.setValue("A", 10);
    pieDataset.setValue("B", 10);
    pieDataset.setValue("C", 10);
    pieDataset.setValue("D", 10);

    JFreeChart chart = ChartFactory.createPieChart("Category Summary", // title
        pieDataset, //dataset
        true,
        true,
        false);
    ChartUtilities.saveChartAsJPEG(new File("C:\\Users\\mciap\\OneDrive\\Pulpit\\Java_Projekty\\JChart\\chart.jpeg"),
        chart, 500, 500);


  }

}
