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
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.custom.SashForm;

public class CauHinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Cấu Hình");
		shell.setSize(450, 300);
		shell.setLayout(new FillLayout());

		TabFolder folder = new TabFolder(shell, SWT.BORDER);
		TabItem tab1 = new TabItem(folder, SWT.BORDER);
		tab1.setText("Qui định tổ chức đăng kí");

		// Create the HORIZONTAL SashForm.
		Group group = new Group(folder, SWT.None);
		Label label1 = new Label(group, SWT.None);
		label1.setText("Số loại đại lý:");
		label1.setBounds(70, 35, 75, 25);
		int style = SWT.BORDER;
		Text text1 = new Text(group, style);
		text1.setBounds(250, 30, 75, 25);

		Label label2 = new Label(group, SWT.None);
		label2.setText("Số quận tối đa :");
		label2.setBounds(70, 70, 85, 25);
		Text text2 = new Text(group, style);
		text2.setBounds(250, 65, 75, 25);

		Label label3 = new Label(group, SWT.None);
		label3.setText("Số đại lý tối đa của một quận :");
		label3.setBounds(70, 105, 175, 25);
		Text text3 = new Text(group, style);
		text3.setBounds(250, 100, 75, 25);

		Button btnNewButton_6 = new Button(group, SWT.NONE);
		btnNewButton_6.setBounds(222, 170, 75, 25);
		btnNewButton_6.setText("Lưu");

		Button btnNewButton_7 = new Button(group, SWT.NONE);
		btnNewButton_7.setBounds(317, 170, 75, 25);
		btnNewButton_7.setText("Hủy");
		tab1.setControl(group);

		// Tab 2
		TabItem tab2 = new TabItem(folder, SWT.NONE);
		tab2.setText("Qui định mặt hàng");

		Group group1 = new Group(folder, SWT.NONE);
		group1.setBounds(10, 30, 100, 100);

		Label label4 = new Label(group1, SWT.None);
		label4.setText("Số lượng mặt hàng:");
		label4.setBounds(50, 35, 105, 25);
		Text text4 = new Text(group1, style);
		text4.setBounds(230, 30, 75, 25);
		
		Label label5 = new Label(group1, SWT.None);
		label5.setText("Số lượng đơn vị tính :");
		label5.setBounds(50, 70, 115, 25);
		Text text5 = new Text(group1, style);
		text5.setBounds(230, 65, 75, 25);
		
		Label label6=new Label(group1,SWT.NONE);
		label6.setText("Số tiền đại lý loại ");
		label6.setBounds(50, 105, 90, 25);
		Combo combo1 = new Combo(group1, SWT.DROP_DOWN);
		combo1.setBounds(145, 100, 75, 25);
		String[] items = new String[] { "Loại 1", "Loại 2" };
		combo1.setItems(items);
		Label label7=new Label(group1,SWT.NONE);
		label7.setText("nợ tối đa");
		label7.setBounds(230, 105, 55, 25);
		Text text7=new Text(group1,style);
		text7.setBounds(285, 100, 60, 25);
		Label label8=new Label(group1,SWT.NONE);
		label8.setText("VND");
		label8.setBounds(350, 105	, 40	, 25);

		Button btnNewButton_8 = new Button(group1, SWT.NONE);
		btnNewButton_8.setBounds(222, 170, 75, 25);
		btnNewButton_8.setText("Lưu");

		Button btnNewButton_9 = new Button(group1, SWT.NONE);
		btnNewButton_9.setBounds(317, 170, 75, 25);
		btnNewButton_9.setText("Hủy");
		tab1.setControl(group);


		tab2.setControl(group1);
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

}
