package quanyec.thinkblog.action.main;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 博客的管理员登录action
 * 
 * @author quanyeChen
 *
 */
public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String PASSWD_HASH_CODE = "passwordHashCode";
	private static final String USER = "DavidChen";
	private static final String PASS = "quanyec";

	private String username;
	private String password;

	@Override
	public String execute() throws Exception {
		if (USER.equals(username) && PASS.equals(password)) {
			// 将已登录的信息保存到session中
			ActionContext context = ActionContext.getContext();
			context.getSession().put(PASSWD_HASH_CODE, password.hashCode());
			return SUCCESS;
		} else {
			addFieldError("msg", "用户名不存在或者密码出错，请重新填写");
			return INPUT;
		}
	}

	@Override
	public void validate() {
		super.validate();
		if (username == null || username.isEmpty()) {
			addFieldError("msg", "用户名为空，请重新输入");
		}
		if (password == null || password.isEmpty()) {
			addFieldError("msg", "密码为空，请重新输入");
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
