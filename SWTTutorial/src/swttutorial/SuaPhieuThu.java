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

public class SuaPhieuThu {

	public static void main(String[] args) {

		Display display = new Display();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Sửa phiếu thu");
		Label label = new Label(shell, SWT.NONE);
		label.setText("Thông tin phiếu thu");
		label.setBounds(40, 10, 110, 25);

		Group group = new Group(shell, SWT.NONE);
		group.setBounds(22, 10, 400, 180);

		Label label1 = new Label(group, SWT.NONE);
		label1.setText("Mã hồ sơ :");
		label1.setBounds(30, 35, 75, 25);
		int style = SWT.BORDER;
		Text text1 = new Text(group, style);
		text1.setBounds(105, 30, 75, 25);

		Label label2 = new Label(group, SWT.NONE);
		label2.setText("Điện thoại:");
		label2.setBounds(30, 83, 75, 25);
		Text text2 = new Text(group, style);
		text2.setBounds(105, 78, 75, 25);

		Label label3 = new Label(group, SWT.NONE);
		label3.setText("Email :");
		label3.setBounds(30, 130, 75, 25);
		Text text3 = new Text(group, style);
		text3.setBounds(105, 125, 75, 25);


		Label label5 = new Label(group, SWT.NONE);
		label5.setText("Ngày thu tiền :");
		label5.setBounds(200, 35, 85, 25);
		Text text5 = new Text(group, style);
		text5.setBounds(295, 30, 75, 25);

		Label label6 = new Label(group, SWT.NONE);
		label6.setText("Địa chỉ :");
		label6.setBounds(200, 83, 85, 25);
		Text text6 = new Text(group, style);
		text6.setBounds(295, 78, 75, 25);

		Label label7 = new Label(group, SWT.NONE);
		label7.setText("Số tiền thu :");
		label7.setBounds(200, 130, 85, 25);
		Text text7 = new Text(group, style);
		text7.setBounds(295, 125, 75, 25);

		Button btnNewButton_6 = new Button(shell, SWT.NONE);
		btnNewButton_6.setBounds(222, 200, 75, 25);
		btnNewButton_6.setText("Lưu");

		Button btnNewButton_7 = new Button(shell, SWT.NONE);
		btnNewButton_7.setBounds(317, 200, 75, 25);
		btnNewButton_7.setText("Hủy");
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();

	}
}