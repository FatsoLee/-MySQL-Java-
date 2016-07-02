/*
 * Information.java
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
public class Information extends javax.swing.JPanel {

	/** Creates new form Information */
	public Information() {
		initComponents();

		int row = 0;
		Statement st = null;
		st = Utils.getSt();
		try {
			//5、处理执行结果
			String sql2 = "select * from Information";
			ResultSet rs = st.executeQuery(sql2);

			//5、处理执行结果
			while (rs.next()) {

				if (jTable1.getRowCount() - 1 < row) {
					DefaultTableModel tableModel = (DefaultTableModel) jTable1
							.getModel();
					tableModel.addRow(new Object[] { "" });
				}

				int gid = rs.getInt(2);
				jTable1.setValueAt(gid, row, 0);
				String inumber = rs.getString(3);
				jTable1.setValueAt(inumber, row, 1);
				float imoney = rs.getFloat(5);
				jTable1.setValueAt(imoney, row, 2);
				String idate = rs.getString(7);
				jTable1.setValueAt(idate, row, 3);
				int eid = rs.getInt(4);
				jTable1.setValueAt(eid, row, 4);
				row++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();

		jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 18));
		jLabel1.setText("\u4ea4\u6613\u4fe1\u606f");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null } }, new String[] {
						"商品编号", "数量", "金额", "日期", "员工编号" }));
		jTable1.setRowHeight(24);
		jScrollPane1.setViewportView(jTable1);

		jLabel2.setText("\u65e5\u671f\uff1a");

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jButton1.setText("\u67e5\u8be2");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(25, 25, 25)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(180,
																		180,
																		180)
																.addComponent(
																		jLabel1))
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														452,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel2)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jTextField1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		99,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(66, 66,
																		66)
																.addComponent(
																		jButton1)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addGap(6, 6, 6)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										160,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1))
								.addContainerGap(77, Short.MAX_VALUE)));
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		//查询
		String idate = this.jTextField1.getText();
		Statement st = null;
		int i = 0;

		st = Utils.getSt();
		DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

		while (i < jTable1.getRowCount()) {
			tableModel.removeRow(0);
		}

		try {
			//4、执行
			String sql = "select * from information where Idate ='" + idate
					+ "';";
			ResultSet rs = st.executeQuery(sql);

			int row = 0;
			//5、处理执行结果
			while (rs.next()) {
				if (jTable1.getRowCount() - 1 < row) {
					tableModel.addRow(new Object[] { "" });
				}

				int gid = rs.getInt(2);
				jTable1.setValueAt(gid, row, 0);
				String inumber = rs.getString(3);
				jTable1.setValueAt(inumber, row, 1);
				float imoney = rs.getFloat(5);
				jTable1.setValueAt(imoney, row, 2);
				String idate_tmp = rs.getString(7);
				jTable1.setValueAt(idate_tmp, row, 3);
				int eid = rs.getInt(4);
				jTable1.setValueAt(eid, row, 4);
				row++;
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}