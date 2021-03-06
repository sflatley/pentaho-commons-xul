package org.pentaho.ui.xul.containers;

import org.pentaho.ui.xul.XulContainer;
import org.pentaho.ui.xul.components.XulTabpanel;

public interface XulTabbox extends XulContainer{
	public int getSelectedIndex();
	public void setSelectedIndex(int index);
	public XulTabpanel getSelectedPanel();
	public XulTabs getTabs();
	public XulTabpanels getTabpanels();
	public void setTabDisabledAt(boolean flag, int pos);
	public void removeTab(int idx);
	public void removeTabpanel(int idx);
  public void addTab(int idx);
  public void addTabpanel(int idx);
  public void setClosable(boolean flag);
  public boolean isClosable();
  public void setOnclose(String command);
}
