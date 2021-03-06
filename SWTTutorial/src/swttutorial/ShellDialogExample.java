package swttutorial;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
public class ShellDialogExample {
	 ShellDialogExample() {
	    Display d = new Display();
	    Shell s = new Shell(d);
	    s.setSize(300, 300);
	    s.open();
	    DialogExample de = new DialogExample(s);
	    String result = de.open();
	    System.out.println(result);
	    while (!s.isDisposed()) {
	      if (!d.readAndDispatch())
	        d.sleep();
	    }
	    d.dispose();

}

	  public static void main(String[] argv) {
	    new ShellDialogExample();
	  }

	}

	class DialogExample extends Dialog {
	  DialogExample(Shell parent) {
	    super(parent);
	  }

	  public String open() {
	    Shell parent = getParent();
	    Shell dialog = new Shell(parent, SWT.DIALOG_TRIM
	        | SWT.APPLICATION_MODAL);
	    dialog.setSize(100, 100);
	    dialog.setText("Java Source and Support");
	    dialog.open();
	    Display display = parent.getDisplay();
	    while (!dialog.isDisposed()) {
	      if (!display.readAndDispatch())
	        display.sleep();
	    }
	    return "After Dialog";
	  }

	  public static void main(String[] argv) {
	    new DialogExample(new Shell());
	  }
	}