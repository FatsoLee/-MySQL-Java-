/*
 * Ranking.java
 *
 * Created on __DATE__, __TIME__
 */

package UI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

import com.jdbc.Utils;

/**
 *
 * @author  __USER__
 */
public class Ranking extends javax.swing.JPanel {

	/** Creates new form Ranking */
	public Ranking() {
		initComponents();
		String gname;
		int row = 0;
		Statement st = null;
		st = Utils.getSt();
		try {
			//5、处理执行结果
			
			String sql = "select * from Ranking order by salenumber desc";
			ResultSet rs = st.executeQuery(sql);

			//5、处理执行结果
			while (rs.next()) {

				if (jTable1.getRowCount() - 1 < row) {
					DefaultTableModel tableModel = (DefaultTableModel) jTable1
							.getModel();
					tableModel.addRow(new Object[] { "" });
				}

				int rank = row + 1;
				jTable1.setValueAt(rank, row, 0);
				String name = rs.getString(2);
				jTable1.setValueAt(name, row, 1);
				int salenumber = rs.getInt(3);
				jTable1.setValueAt(salenumber, row, 2);
				row++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel1.setText("\u5546\u54c1\u9500\u552e\u6392\u884c");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null } },
				new String[] { "排名", "商品编号", "销售量" }) {
			Class[] types = new Class[] { java.lang.Integer.class,
					java.lang.Integer.class, java.lang.Integer.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jTable1.setRowHeight(24);
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(163,
																		163,
																		163)
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		156,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		376,
																		Short.MAX_VALUE)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										201,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(68, Short.MAX_VALUE)));
	}// </editor-fold>
	//GEN-END:initComponents

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration//GEN-END:variables

}