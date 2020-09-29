import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class getGuid {
    public static void main(String[] args)
    {
        java.util.UUID test = java.util.UUID.randomUUID();
        System.out.println(test.toString());
        String myString = test.toString();
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
}
