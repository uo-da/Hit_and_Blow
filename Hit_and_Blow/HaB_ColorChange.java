import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

@SuppressWarnings("rawtypes")
class MyCellRenderer extends JLabel implements ListCellRenderer {

  MyCellRenderer() {
    setOpaque(true);
  }

  public Component getListCellRendererComponent(
      JList list,
      Object value,
      int index,
      boolean isSelected,
      boolean cellHasFocus) {

    String data = value.toString();
    setText(data);

    if (index == 0) {
      setForeground(new Color(30, 144, 255));
    } else if (index == 1) {
      setForeground(new Color(220, 20, 60));
    } else if (index == 2) {
      setForeground(new Color(34, 139, 34));
    } else if (index == 3) {
      setForeground(new Color(255, 215, 0));
    } else if (index == 4) {
      setForeground(Color.PINK);
    } else if (index == 5) {
      setForeground(Color.BLACK);
    }

    return this;
  }
}
