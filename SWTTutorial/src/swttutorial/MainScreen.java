package swttutorial;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.OpenWindowListener;
import org.eclipse.swt.browser.WindowEvent;
import org.eclipse.swt.widgets.Listener;

public class MainScreen {

	public static void main(String[] args) {

		Display display = new Display();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		// final Text text = new Text(shell, SWT.BORDER);
		// text.setBounds(25, 240, 220, 25);

		// RowLayout rowlayout=new RowLayout();
		// rowlayout.justify=true;
		//Group group = new Group(shell, SWT.NONE);
		//group.setBounds(22, 10, 300, 50);
		// group.setLayout(rowlayout);
		Menu menu1=new Menu(shell, SWT.BAR);
		
		MenuItem item0=new MenuItem(menu1,SWT.CASCADE);
		item0.setText("Quản lý hồ sơ");
		//Button btnNewButton = new Button(group, SWT.NONE);
		//btnNewButton.setBounds(10, 15, 100, 25);
		//btnNewButton.setText("Quản lý hồ sơ");

		//Button btnNewButton_1 = new Button(group, SWT.NONE);
		//btnNewButton_1.setBounds(120, 15, 75, 25);
		//btnNewButton_1.setText("Lập phiếu");
		
		MenuItem item1=new MenuItem(menu1,SWT.CASCADE);
		item1.setText("Lập phiếu");
		Menu filemenu1=new Menu (shell,SWT.DROP_DOWN);
		item1.setMenu(filemenu1);
		//filemenu.setLocation(120, 15);
		MenuItem item2=new MenuItem(filemenu1,SWT.PUSH);
		item2.setText("Lập phiếu nhập hàng");
		MenuItem item3=new MenuItem(filemenu1,SWT.PUSH);
		item3.setText("Lập phiếu xuất hàng");
		MenuItem item4=new MenuItem(filemenu1,SWT.PUSH);
		item4.setText("Lập phiếu thu tiền");
		shell.setMenuBar(menu1);
		
		MenuItem Item5=new MenuItem(menu1,SWT.CASCADE);
		Item5.setText("Báo cáo");
		Menu filemenu2=new Menu(shell,SWT.DROP_DOWN);
		Item5.setMenu(filemenu2);
		MenuItem item6=new MenuItem(filemenu2,SWT.PUSH);
		item6.setText("Báo cáo doanh số");
		MenuItem item7=new MenuItem(filemenu2,SWT.PUSH);
		item7.setText("Báo cáo công nợ");
		
		//Button btnNewButton_2 = new Button(group, SWT.NONE);
		//btnNewButton_2.setBounds(209, 15, 75, 25);
		//btnNewButton_2.setText("Báo cáo");

		Button btnNewButton_3 = new Button(shell, SWT.PUSH);
		btnNewButton_3.setBounds(10, 196, 75, 25);
		btnNewButton_3.setText("Thêm");
		btnNewButton_3.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		Button btnNewButton_4 = new Button(shell, SWT.NONE);
		btnNewButton_4.setBounds(91, 196, 75, 25);
		btnNewButton_4.setText("Xóa");

		Button btnNewButton_5 = new Button(shell, SWT.NONE);
		btnNewButton_5.setBounds(172, 196, 75, 25);
		btnNewButton_5.setText("Sửa");

		Button btnNewButton_6 = new Button(shell, SWT.NONE);
		btnNewButton_6.setBounds(349, 196, 75, 25);
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

		table.setBounds(30, 20, 370, 160);

		// table.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event event) {
		/// if (event.detail == SWT.CHECK) {
		// text.setText("You checked " + event.item);
		// } else {
		// text.setText("You selected " + event.item);
		// }
		// }
		// });

		shell.setText("Phan Mem Quan Ly Cac Dai Ly");
		shell.setSize(450, 300);
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

}