/*
 * EmployeeAlter.java
 *
 * Created on __DATE__, __TIME__
 */
package UI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.Utils;

/**
 *
 * @author  __USER__
 */
public class EmployeeAlter extends javax.swing.JFrame {

	/** Creates new form EmployeeAlter */
	public EmployeeAlter() {
		initComponents();
		setLocation(250,200);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel2 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jTextField9 = new javax.swing.JTextField();
		jTextField10 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jTextField8 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();
		jTextField14 = new javax.swing.JTextField();
		jButton12 = new javax.swing.JButton();

//		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel2.setText("\u4fee\u6539");

		jLabel1.setText("\u5458\u5de5\u7f16\u53f7\uff1a");

		jLabel10.setText("\u5bc6\u7801\uff1a");

		jLabel11.setText("\u5e74\u9f84\uff1a");

		jTextField9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField9ActionPerformed(evt);
			}
		});

		jTextField10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField10ActionPerformed(evt);
			}
		});

		jLabel6.setText("\u8eab\u4efd\u8bc1\u53f7\uff1a");

		jLabel8.setText("\u804c\u4f4d\uff1a");

		jLabel9.setText("\u5de5\u8d44\uff1a");

		jTextField7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField7ActionPerformed(evt);
			}
		});

		jTextField8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField8ActionPerformed(evt);
			}
		});

		jLabel5.setText("\u8054\u7cfb\u65b9\u5f0f\uff1a");

		jLabel3.setText("\u59d3\u540d\uff1a");

		jLabel4.setText("\u6027\u522b\uff1a");

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

		jButton1.setText("\u786e\u5b9a");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel16.setText("\u67e5\u8be2\uff08\u5458\u5de5\u7f16\u53f7\uff09\uff1a");

		jButton12.setText("\u67e5\u8be2");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(29, 29,
																		29)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																								.addGroup(
																										layout.createSequentialGroup()
																												.addComponent(
																														jLabel1)
																												.addGap(30,
																														30,
																														30)
																												.addComponent(
																														jTextField1,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														90,
																														javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGroup(
																										layout.createSequentialGroup()
																												.addGroup(
																														layout.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																																.addComponent(
																																		jLabel10,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		50,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addComponent(
																																		jLabel11))
																												.addGap(40,
																														40,
																														40)
																												.addGroup(
																														layout.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																																.addComponent(
																																		jTextField9,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		90,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addComponent(
																																		jTextField10,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		90,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)))
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addGroup(
																														layout.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																																.addGroup(
																																		layout.createSequentialGroup()
																																				.addComponent(
																																						jLabel6)
																																				.addGap(30,
																																						30,
																																						30)
																																				.addComponent(
																																						jTextField5,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						90,
																																						javax.swing.GroupLayout.PREFERRED_SIZE))
																																.addGroup(
																																		layout.createSequentialGroup()
																																				.addGroup(
																																						layout.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																								.addComponent(
																																										jLabel8,
																																										javax.swing.GroupLayout.PREFERRED_SIZE,
																																										50,
																																										javax.swing.GroupLayout.PREFERRED_SIZE)
																																								.addComponent(
																																										jLabel9))
																																				.addGap(40,
																																						40,
																																						40)
																																				.addGroup(
																																						layout.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																								.addComponent(
																																										jTextField7,
																																										javax.swing.GroupLayout.PREFERRED_SIZE,
																																										90,
																																										javax.swing.GroupLayout.PREFERRED_SIZE)
																																								.addComponent(
																																										jTextField8,
																																										javax.swing.GroupLayout.PREFERRED_SIZE,
																																										90,
																																										javax.swing.GroupLayout.PREFERRED_SIZE))))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel5)
																																.addGap(30,
																																		30,
																																		30)
																																.addComponent(
																																		jTextField4,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		90,
																																		javax.swing.GroupLayout.PREFERRED_SIZE))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addGroup(
																																		layout.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																				.addComponent(
																																						jLabel4)
																																				.addComponent(
																																						jLabel3,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						50,
																																						javax.swing.GroupLayout.PREFERRED_SIZE))
																																.addGap(40,
																																		40,
																																		40)
																																.addGroup(
																																		layout.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																				.addComponent(
																																						jTextField2,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						90,
																																						javax.swing.GroupLayout.PREFERRED_SIZE)
																																				.addComponent(
																																						jTextField3,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						90,
																																						javax.swing.GroupLayout.PREFERRED_SIZE)))))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel16)
																								.addGap(22,
																										22,
																										22)
																								.addComponent(
																										jTextField14,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										89,
																										javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addGap(40, 40,
																		40)
																.addComponent(
																		jButton12))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(117,
																		117,
																		117)
																.addComponent(
																		jButton1))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(151,
																		151,
																		151)
																.addComponent(
																		jLabel2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		50,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(55, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										20,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel16)
												.addComponent(
														jTextField14,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton12))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel1))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel5)
												.addComponent(
														jTextField4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel6)
												.addComponent(
														jTextField5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(17, 17, 17)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel8)
												.addComponent(
														jTextField8,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel9)
												.addComponent(
														jTextField7,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel10)
												.addComponent(
														jTextField10,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel11)
												.addComponent(
														jTextField9,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										46, Short.MAX_VALUE)
								.addComponent(jButton1).addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		//查询
		String eid_temp = this.jTextField14.getText();
		Statement st = null;

		st = Utils.getSt();
		try {
			//4、执行
			String sql = "select * from employee where Eid ='" + eid_temp
					+ "';";
			ResultSet rs = st.executeQuery(sql);
			//5、处理执行结果
			while (rs.next()) {
				String eid = Integer.toString(rs.getInt(1));
				jTextField1.setText(eid);
				String ename = rs.getString(2);
				jTextField2.setText(ename);
				String sex = rs.getString(3);
				jTextField3.setText(sex);
				String ephone = rs.getString(4);
				jTextField4.setText(ephone);
				String enumber = rs.getString(5);
				jTextField5.setText(enumber);
				String position = rs.getString(6);
				jTextField8.setText(position);
				String salary = Integer.toString(rs.getInt(7));
				jTextField7.setText(salary);
				String password = rs.getString(8);
				jTextField10.setText(password);
				String age = Integer.toString(rs.getInt(9));
				jTextField9.setText(age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		//修改更新
		Statement st = null;
		st = Utils.getSt();

		int eid_t = Integer.parseInt(jTextField1.getText());
		String ename = this.jTextField2.getText();
		String esex = this.jTextField3.getText();
		String ephone = this.jTextField4.getText();
		String enumber = this.jTextField5.getText();
		String position = this.jTextField8.getText();
		int salary = Integer.parseInt(this.jTextField7.getText());
		String password = this.jTextField10.getText();
		int age = Integer.parseInt(this.jTextField9.getText());
		String sql1 = "update employee set Ename = '" + ename + "',"
				+ "sex = '" + esex + "'," + "Ephone = '" + ephone + "',"
				+ "Enumber = '" + enumber + "'," + "position = '" + position
				+ "'," + "salary = '" + salary + "'," + "password = '"
				+ password + "'," + "age = '" + age + "' where Eid = '" + eid_t
				+ "';";
		try {
			st.executeUpdate(sql1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.dispose();
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton12;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField10;
	private javax.swing.JTextField jTextField14;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	private javax.swing.JTextField jTextField9;
	// End of variables declaration//GEN-END:variables

}