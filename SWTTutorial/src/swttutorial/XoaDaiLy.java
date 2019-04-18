package swttutorial;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.MessageBox;

public class XoaDaiLy {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Xóa đại lý");
		Group group = new Group(shell, SWT.NONE);
		group.setBounds(22, 10, 300, 50);
		// group.setLayout(rowlayout);

		Button btnNewButton = new Button(group, SWT.NONE);
		btnNewButton.setBounds(10, 15, 100, 25);
		btnNewButton.setText("Quản lý hồ sơ");

		Button btnNewButton_1 = new Button(group, SWT.NONE);
		btnNewButton_1.setBounds(120, 15, 75, 25);
		btnNewButton_1.setText("Lập phiếu");

		Button btnNewButton_2 = new Button(group, SWT.NONE);
		btnNewButton_2.setBounds(209, 15, 75, 25);
		btnNewButton_2.setText("Báo cáo");

		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.setBounds(10, 226, 75, 25);
		btnNewButton_3.setText("Thêm");

		Button btnNewButton_4 = new Button(shell, SWT.NONE);
		btnNewButton_4.setBounds(91, 226, 75, 25);
		btnNewButton_4.setText("Xóa");

		Button btnNewButton_5 = new Button(shell, SWT.NONE);
		btnNewButton_5.setBounds(172, 226, 75, 25);
		btnNewButton_5.setText("Sửa");

		Button btnNewButton_6 = new Button(shell, SWT.NONE);
		btnNewButton_6.setBounds(349, 226, 75, 25);
		btnNewButton_6.setText("Cấu hình");

		// ViewForm viewForm = new ViewForm(shell, SWT.NONE);
		// viewForm.setBounds(73, 175, 243, -53);

		Table table = new Table(shell, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		table.setHeaderVisible(true);
		String[] titles = { "Tên đại lý", "Loại đại lý", "Điện thoại", "Địa chỉ", "Quận", "Ngày tiếp nhận" };

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

		table.setBounds(20, 60, 350, 160);
		MessageBox messageBox = new MessageBox(shell, SWT.ICON_QUESTION | SWT.YES | SWT.NO);
		messageBox.setMessage("Do you really want to delete?");
		messageBox.setText("Exiting Application");
		int response = messageBox.open();
		//if (response == SWT.YES)
			//System.exit(0);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}