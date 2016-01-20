package myexample.testlayout;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

@SuppressWarnings("serial")
public class HexFormattedTextField extends JFormattedTextField {
	private int cursorPosition = 0;
	
	public HexFormattedTextField() {
		super();
		initListeners();
	}
	
	public HexFormattedTextField(JFormattedTextField.AbstractFormatter formatter) {
		super(formatter);
		initListeners();
	}
	
	protected Document createDefaultModel() {
        return new UpperCaseDocument();
    }
 
	private void initListeners() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("mouseClicked");
				mouseCursorSet();
			}
		});
	}
	
	private void mouseCursorSet() {
		int p = this.getText().replace(" ", "").length();
		
		if (this.getSelectionStart() > p) {
			this.setSelectionStart(p);
			this.setSelectionEnd(p);
		}
	}
	
    private class UpperCaseDocument extends PlainDocument {
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {

            super.insertString(offs, str, a);

        }
    }
}
