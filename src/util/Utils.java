package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionContext;

import quanyec.thinkblog.action.main.LoginAction;

/**
 * 工具类
 * 
 * @author quanyeChen
 *
 */
public class Utils {

	private static Configuration config;

	private Utils() {
	}

	public static SessionFactory getSessionFactory() {
		if (config == null) {
			Configuration config = new Configuration().configure();
			return config.buildSessionFactory();
		} else {
			return config.buildSessionFactory();
		}
	}

	public static Object getSessionHashCode() {
		ActionContext context = ActionContext.getContext();
		return context.getSession().get(LoginAction.PASSWD_HASH_CODE);
	}
}
