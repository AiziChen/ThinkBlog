package quanyec.thinkblog.action.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import quanyec.thinkblog.pojo.Blog;
import util.Utils;

/**
 * 处理主界面的Action
 * 
 * @author QuanyeChen
 *
 */
public class LoadIndexAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Blog> allBlogs;
	private int id;

	@Override
	public String execute() throws Exception {
		SessionFactory sf = Utils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Blog> query = session.createQuery("from Blog");
		allBlogs = query.getResultList();
		tx.commit();
		session.close();

		return SUCCESS;
	}

	/**
	 * 加载用户选中的博客标题的内容
	 * 
	 * @return
	 * @throws Exception
	 */
	public String loadContent() throws Exception {
		SessionFactory sf = Utils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		@SuppressWarnings("unchecked")
		Query<Blog> query = session.createQuery("from Blog");
		allBlogs = query.getResultList();
		tx.commit();
		session.close();

		if (id >= allBlogs.size()) {
			return ERROR;
		}
		
		ActionContext.getContext().put("currentBlog", allBlogs.get(id));
		return SUCCESS;
	}

	public List<Blog> getAllBlogs() {
		return allBlogs;
	}

	public void setAllBlogs(List<Blog> allBlogs) {
		this.allBlogs = allBlogs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
