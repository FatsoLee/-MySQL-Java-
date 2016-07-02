/*
 * GoodsInput.java
 *
 * Created on __DATE__, __TIME__
 */

package UI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.jdbc.Utils;

/**
 *
 * @author  __USER__
 */
public class GoodsInput extends javax.swing.JPanel {

	/** Creates new form GoodsInput */
	public GoodsInput() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel5 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();

		jLabel5.setText("\u4f9b\u5e94\u5546\u540d\u79f0\uff1a");

		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		jLabel3.setText("\u5e93\u5b58\uff1a");

		jLabel2.setText("\u552e\u4ef7\uff1a");

		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jButton1.setText("\u5f55\u5165");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel10.setText("\u5546\u54c1\u540d\uff1a");

		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});

		jTextField6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField6ActionPerformed(evt);
			}
		});

		jLabel11.setText("\u5546\u54c1ID\uff1a");

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
																.addGap(95, 95,
																		95)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										68,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextField3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										120,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										68,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextField2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										120,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel5)
																								.addGap(1,
																										1,
																										1)
																								.addComponent(
																										jTextField5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										120,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														jLabel11,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														68,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel10,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														68,
																														javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jTextField6,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														120,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jTextField4,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														120,
																														javax.swing.GroupLayout.PREFERRED_SIZE)))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(155,
																		155,
																		155)
																.addComponent(
																		jButton1)))
								.addContainerGap(118, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(66, 66, 66)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel11))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel10)
												.addComponent(
														jTextField4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel3)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel5,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														26, Short.MAX_VALUE))
								.addGap(26, 26, 26).addComponent(jButton1)
								.addContainerGap()));
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		int gid = Integer.parseInt(this.jTextField6.getText());
		String gname = this.jTextField4.getText();
		float saleprice = Float.valueOf(this.jTextField2.getText());
		int inventory = Integer.parseInt(this.jTextField3.getText());
		String sname = this.jTextField5.getText();
		int sid = 0;

		Statement st = null;
		st = Utils.getSt();
		try {
			String sql1 = "select Sid from supplier where Sname='" + sname
					+ "';";
			ResultSet rs = st.executeQuery(sql1);
			while (rs.next()) {
				sid = rs.getInt(1);
			}

			//4、执行
			String sql2 = "insert into goods(Gid,Gname,saleprice,inventory,Sid) values('"
					+ gid
					+ "','"
					+ gname
					+ "','"
					+ saleprice
					+ "','"
					+ inventory + "','" + sid + "');";

			st.executeUpdate(sql2);

			//5、处理执行结果
			JOptionPane.showMessageDialog(this, "录入成功！");
			
			String sql3 = "insert into ranking(Gid,Gname) values('"
					+ gid
					+ "','"
					+ gname
					+ "');";

			st.executeUpdate(sql3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	// End of variables declaration//GEN-END:variables

}