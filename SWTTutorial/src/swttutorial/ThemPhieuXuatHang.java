package swttutorial;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

public class ThemPhieuXuatHang {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell();
		shell.setSize(450, 350);
		shell.setText("Thêm phiếu nhập hàng");
		Label label = new Label(shell, SWT.NONE);
		label.setText("Thêm phiếu nhập hàng");
		label.setBounds(40, 10, 150, 25);
		Group group = new Group(shell, SWT.NONE);
		group.setBounds(22, 10, 400, 260);
		Label label0=new Label(group,SWT.NONE);
		label0.setText("Mã đại lý :");
		label0.setBounds(30,30,65,25);
		Text t3=new Text(group,SWT.BORDER);
		t3.setBounds(100, 25, 75, 25);
		Label label1 = new Label(group, SWT.NONE);
		label1.setText("Ngày lập phiếu :");
		label1.setBounds(180, 30, 100, 25);
		Text t1 = new Text(group, SWT.BORDER);
		t1.setBounds(285, 25, 75, 25);
		Table table = new Table(group, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		table.setHeaderVisible(true);
		String[] titles = { "Mặt hàng", "ĐVT", "Số lượng", "Đơn giá", "Thành tiền" };

		for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
			TableColumn column = new TableColumn(table, SWT.NULL);
			column.setText(titles[loopIndex]);
		}

		// for (int loopIndex = 0; loopIndex < 5; loopIndex++) {
		// TableItem item = new TableItem(table, SWT.NULL);
		// item.setText("Item " + loopIndex);
		// item.setText(0, "Item " + loopIndex);
		// item.setText(1, "Yes");
		// item.setText(2, "No");
		// item.setText(3, "A table item");

		// }

		for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
			table.getColumn(loopIndex).pack();
		}

		table.setBounds(40, 55, 300, 140);
		Label label3 = new Label(group, SWT.NONE);
		label3.setText("Tổng tiền :");
		label3.setBounds(60, 208, 80, 25);
		Label label4 = new Label(group, SWT.NONE);
		label4.setText("Số tiền trả :");
		label4.setBounds(60, 233, 70, 25);
		Text text5 = new Text(group, SWT.BORDER);
		text5.setBounds(140, 228, 75, 25);
		Label label5 = new Label(group, SWT.NONE);
		label5.setText("Còn lại :");
		label5.setBounds(230, 233, 75, 25);

		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setBounds(180, 276, 75, 25);
		btnNewButton_2.setText("Lưu");
		Button button3 = new Button(shell, SWT.NONE);
		button3.setBounds(260, 276, 75, 25);
		button3.setText("Hủy");
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}
}
