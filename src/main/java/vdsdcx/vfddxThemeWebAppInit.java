package vdsdcx;

import org.zkoss.zk.ui.WebApp;
import org.zkoss.zk.ui.util.WebAppInit;
import org.zkoss.zul.theme.Themes;

public class vfddxThemeWebAppInit implements WebAppInit {

	private final static String EWFS_NAME = "ewfs";
	private final static String EWFS_DISPLAY = "Ewfs";
	private final static int EWFS_PRIORITY = 1000;

	public void init(WebApp wapp) throws Exception {
		Themes.register(EWFS_NAME, EWFS_DISPLAY, EWFS_PRIORITY);
	}

}
