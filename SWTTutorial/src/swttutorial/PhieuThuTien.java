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
public class PhieuThuTien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Phiếu thu tiền");
		
		Label label1=new Label(shell,SWT.NONE);
		label1.setText("PHIẾU THU TIỀN");
		label1.setBounds(20, 20	,150, 25);
		Table table = new Table(shell, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
		table.setHeaderVisible(true);
		String[] titles = { "Đại lý", "Địa chỉ", "Điện Thoại", "Email","Ngày thu tiền", "Số tiền thu"};

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

		table.setBounds(20, 50, 370, 160);
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBounds(10, 220, 75, 25);
		btnNewButton_1.setText("Thêm");
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setBounds(90, 220, 75, 25);
		btnNewButton_2.setText("Xóa");
		Button button3=new Button(shell,SWT.NONE);
		button3.setBounds(170,220,75,25);
		button3.setText("Sửa");
		Button button4=new Button(shell,SWT.NONE);
		button4.setBounds(250, 220, 75, 25);
		button4.setText("In");
		
		
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

}
