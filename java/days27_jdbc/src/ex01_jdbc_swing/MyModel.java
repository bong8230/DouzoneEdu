package ex01_jdbc_swing;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {

	Object[][] data;
	String[] columnName;
	int rows, cols; //���ڵ� ��� ���� ������ �����ϴ� ����
	@Override
	public int getRowCount() { // ���ڵ� ���� �˾Ƴ���
		return data.length;
	}

	// ���ڵ� ���� �˾Ƴ��� - user method
	public int getRowCount(ResultSet rsScroll) {
		try {
			rsScroll.last(); // ���ڵ��� ������ ������ Ŀ�� �̵�
			rows = rsScroll.getRow();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rows;
	}
	@Override
	public int getColumnCount() { // �ʵ�(��)�� ����
		return columnName.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	//DB�� ����� ������ ä��
	public void setData(ResultSet rs) {
		try {
			String title;
			//�����Ϳ� ���� ���� ����
			ResultSetMetaData rsmd = rs.getMetaData();
			cols = rsmd.getColumnCount(); // ���� ���� ����
			columnName = new String[cols];
			
			for (int i = 0; i < cols; i++) {
				columnName[i] = rsmd.getColumnName(i + 1); // �ʵ� ��ȣ�� 1���� ������
			}
			
			data = new Object[rows][cols];
			int r = 0;
			
			while( rs.next() ) {
				for (int i = 0; i < cols; i++) {
					if(i!=1) data[r][i] = rs.getObject(i+1); // number type
					else data[r][i] = rs.getObject(i+1); // varchar2
				}// for end
				r++;
			}// while end
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
