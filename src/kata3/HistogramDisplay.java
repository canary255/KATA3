package kata3;

import javax.swing.JPanel;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
      
    private final Histogram<String> histogram;
    
    public HistogramDisplay(Histogram<String> histogram){
        super("Histograma");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }
private JFreeChart createChart (DefaultCategoryDataset dataset) {
  
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String key: histogram.keySet()){
            dataset.addValue(histogram.get(key), "", key);
        }
          return dataset;
      }
  }