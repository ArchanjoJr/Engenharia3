package view;

import java.util.List;

public interface Observer {
	public void update(List l);
	public void updateMsg(String m);
}
