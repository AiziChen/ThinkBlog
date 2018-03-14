package quanyec.thinkblog.action.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;

import quanyec.thinkblog.pojo.Blog;
import util.Utils;

/**
 * 删除该博客
 * 
 * @author quanyeChen
 *
 */
public class DeleteBlogAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 将要删除的博客的id
	 */
	private int id;

	@Override
	public String execute() throws Exception {
		if (Utils.getSessionHashCode() == null) {
			return NONE;
		}
		SessionFactory sf = Utils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Blog blog = session.get(Blog.class, id);
		session.delete(blog);
		tx.commit();
		session.close();

		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
