package view;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitaCaracteres extends PlainDocument {

    private final int limite;

    public LimitaCaracteres(int limite) {
        super();
        this.limite = limite;
    }

    @Override
    public void insertString(int ofs, String str, AttributeSet a) throws BadLocationException {
        //se a quantidade digitada for igual ao total, não permite digitar mais
        if ((getLength() + str.length()) <= limite) {
            super.insertString(ofs, str, a);
        }
    }
}
