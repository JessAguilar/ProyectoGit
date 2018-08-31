/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogit;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectogit.conexion;

/**
 *
 * @author Juan Andres
 */
public class JavaJFreeChartBarChart3D extends ApplicationFrame{
    
    private static conexion conexion;
    private Connection con;
    
    public JavaJFreeChartBarChart3D(final String title,boolean control) {
        super(title);
        if(control == true){
            final CategoryDataset dataset = createDataset();
            final JFreeChart chart = createChart(dataset);
            final ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
            setContentPane(chartPanel);
        }
        else{
            final CategoryDataset dataset2 = createDataset2();
            final JFreeChart chart2 = createChart(dataset2);
            final ChartPanel chartPanel2 = new ChartPanel(chart2);
            chartPanel2.setPreferredSize(new java.awt.Dimension(500, 270));
            setContentPane(chartPanel2);
        }
		
    }
    
	public CategoryDataset createDataset() {
                
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                try {
                    String sql = "SELECT\n" +
                                "	IDPersonaSalida,\n" +
                                "	SUM(llamada.costoTotal)\n" +
                                "FROM\n" +
                                "	llamada \n" +
                                "GROUP BY IDPersonaSalida ";
                    con = conexion.getInstance().getConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    while(rs.next())
                    {   
                      
                            dataset.addValue(rs.getDouble(2),"ID:"+Integer.toString(rs.getInt(1)), "Gastos de Llamada");
                        
                    }
                    con.commit();
                    con.close();

                } 
                catch (SQLException ex) {
                    Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
                }
		return dataset;

	}

        public CategoryDataset createDataset2() {
                
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                double cLocal=0,cInternacional=0,cCelular=0;
                String comparative;
                try {
                    String sql2 = "SELECT llamada.tipoLlamada\n" +
                    "FROM llamada";
                    con = conexion.getInstance().getConnection();
                    Statement st2 = con.createStatement();
                    ResultSet rs2 = st2.executeQuery(sql2);
                    while(rs2.next())
                    {   
                        comparative = rs2.getString(1);
                        if(comparative.equals("Local")){
                            cLocal++;  
                        }
                        if(comparative.equals("Internacional")){
                            cInternacional++;
                        }
                        if(comparative.equals("Celular")){
                            cCelular++;
                        }
                    }
                    dataset.addValue(cLocal,"Local", "Tipos de Llamada");
                    dataset.addValue(cInternacional,"Internacional", "Tipos de Llamada");
                    dataset.addValue(cCelular,"Celular", "Tipos de Llamada");
                    con.commit();
                    con.close();

                } 
                catch (SQLException ex) {
                    Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
                }
		return dataset;

	}
        
	public JFreeChart createChart(final CategoryDataset dataset) {

		final JFreeChart chart = ChartFactory.createBarChart3D("3D Bar Chart Demo", // chart
																					// title
				"Category", // domain axis label
				"Value", // range axis label
				dataset, // data
				PlotOrientation.VERTICAL, // orientation
				true, // include legend
				true, // tooltips
				false // urls
		);

		final CategoryPlot plot = chart.getCategoryPlot();
		final CategoryAxis axis = plot.getDomainAxis();
		axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 8.0));

		final CategoryItemRenderer renderer = plot.getRenderer();
		renderer.setItemLabelsVisible(true);
		final BarRenderer r = (BarRenderer) renderer;
		// r.setMaxBarWidth(0.05);

		return chart;
	}
        

    
}
