import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class GUI {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUI window = new GUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblPleaseHaveA = new Label(shell, SWT.NONE);
		lblPleaseHaveA.setBounds(150, 61, 136, 15);
		lblPleaseHaveA.setText("Please have a good day!");
		
		Button btnOk = new Button(shell, SWT.NONE);
		btnOk.setBounds(88, 142, 75, 25);
		btnOk.setText("Ok!");
		
		Button btnNo = new Button(shell, SWT.NONE);
		btnNo.setBounds(270, 142, 75, 25);
		btnNo.setText("No.");

	}
}
