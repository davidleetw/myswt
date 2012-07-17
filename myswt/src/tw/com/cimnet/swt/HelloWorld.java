package tw.com.cimnet.swt;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Display display = Display.getDefault();
		final Shell shell = new Shell();

//		shell.setSize(327, 253);
//		shell.setFullScreen(true); // No Title Bar
//		shell.setMinimized(true);	// minimize the form

		shell.setMaximized(true);	// maxmize the form
		shell.setToolTipText("我的第一個SWT介面");
		shell.setText("驗布包裝工作站");
		
//		other controls
		Button button=new Button(shell, SWT.NONE);
		button.setText("按鈕測試");
		button.setBounds(88, 94, 100, 25);
//		button.click
		button.addSelectionListener(new SelectionListener(){
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(shell, "系統提示訊息", "I love Eclipse!");
			}

			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		shell.layout();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}
}
